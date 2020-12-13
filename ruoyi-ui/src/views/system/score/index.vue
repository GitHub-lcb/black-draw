<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="兑换物品" prop="goods">
        <el-input
          v-model="queryParams.goods"
          placeholder="请输入兑换物品"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建者" prop="createBy">
        <el-input
          v-model="queryParams.createBy"
          placeholder="请输入创建者"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="cyan" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:score:add']"
        >积分兑换</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:score:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:score:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:score:export']"
        >导出</el-button>
      </el-col>
	  <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="scoreList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
<!--      <el-table-column label="主键id" align="center" prop="id" />-->
      <el-table-column label="兑换物品" align="center" prop="goods" />
      <el-table-column label="积分剩余" align="center" prop="scoreRemain" />
      <el-table-column label="消耗积分" align="center" prop="scoreCost" />
      <el-table-column label="创建者" align="center" prop="createBy" />
      <el-table-column label="兑换时间" align="center" prop="createTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createTime, '{y}-{m}-{d} {h}:{i}:{s}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:score:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:score:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改积分兑换对话框 -->
<!--    <el-dialog v-bind="$attrs" v-on="$listeners" @open="onOpen" @close="onClose" title="Dialog Titile">-->
<!--      <el-form ref="elForm" :model="formData" :rules="rules" size="medium" label-width="100px">-->
<!--        <el-form-item label="下拉选择" prop="field101">-->
<!--          <el-select v-model="formData.field101" placeholder="请选择下拉选择" filterable clearable-->
<!--                     :style="{width: '100%'}">-->
<!--            <el-option v-for="(item, index) in field101Options" :key="index" :label="item.label"-->
<!--                       :value="item.value" :disabled="item.disabled"></el-option>-->
<!--          </el-select>-->
<!--        </el-form-item>-->
<!--      </el-form>-->
<!--      <div slot="footer">-->
<!--        <el-button @click="close">取消</el-button>-->
<!--        <el-button type="primary" @click="handelConfirm">确定</el-button>-->
<!--      </div>-->
<!--    </el-dialog>-->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="选择英雄" prop="goods">
<!--          <el-input v-model="form.goods" placeholder="请输入兑换物品" />-->
          <el-select v-model="form.goods" filterable clearable placeholder="请选择英雄">
            <el-option
              v-for="dict in heroOptions"
              :key="dict.dictValue"
              :label="dict.dictLabel"
              :value="dict.dictValue"
            />
          </el-select>

        </el-form-item>
<!--        <el-form-item label="积分总数量" prop="scoreTotal">-->
<!--          <el-input v-model="form.scoreTotal" placeholder="请输入积分总数量" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="积分剩余数量" prop="scoreRemain">-->
<!--          <el-input v-model="form.scoreRemain" placeholder="请输入积分剩余数量" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="消耗积分" prop="scoreCost">-->
<!--          <el-input v-model="form.scoreCost" placeholder="请输入消耗积分" />-->
<!--        </el-form-item>-->
<!--        <el-form-item label="删除标志" prop="delFlag">-->
<!--          <el-input v-model="form.delFlag" placeholder="请输入删除标志" />-->
<!--        </el-form-item>-->
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">兑换</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listScore, getScore, delScore, addScore, updateScore, exportScore } from "@/api/system/score";

export default {
  name: "Score",
  components: {
  },
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 积分兑换表格数据
      scoreList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        goods: null,
        createBy: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
      },
      heroOptions: []
    };
  },
  created() {
    this.getList();
    this.getDicts("hero").then(response => {
      this.heroOptions = response.data;
      console.log(response.data);
    });
  },
  methods: {
    /** 查询积分兑换列表 */
    getList() {
      this.loading = true;
      listScore(this.queryParams).then(response => {
        this.scoreList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        goods: null,
        scoreTotal: null,
        scoreRemain: null,
        scoreCost: null,
        delFlag: null,
        createBy: null,
        createTime: null,
        updateBy: null,
        updateTime: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "积分兑换";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getScore(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改积分兑换";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateScore(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addScore(this.form).then(response => {
              this.msgSuccess("兑换成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$confirm('是否确认删除积分兑换编号为"' + ids + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delScore(ids);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        })
    },
    /** 导出按钮操作 */
    handleExport() {
      const queryParams = this.queryParams;
      this.$confirm('是否确认导出所有积分兑换数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return exportScore(queryParams);
        }).then(response => {
          this.download(response.msg);
        })
    }
  }
};
</script>
