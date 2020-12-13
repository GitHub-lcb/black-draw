package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 游戏用户对象 game_account
 * 
 * @author lcb
 * @date 2020-12-03
 */
public class GameAccount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 角色id */
    private Integer uid;

    /** 账号 */
    @Excel(name = "账号")
    private String username;

    /** 密码 */
    @Excel(name = "密码")
    private String password;

    /** 设备号 */
    @Excel(name = "设备号")
    private String accIdfa;

    /** 注册ip */
    @Excel(name = "注册ip")
    private String regIp;

    /** 免费抽奖数量 */
    @Excel(name = "免费抽奖数量")
    private Long count;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long version;

    public void setUid(Integer uid) 
    {
        this.uid = uid;
    }

    public Integer getUid() 
    {
        return uid;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setAccIdfa(String accIdfa) 
    {
        this.accIdfa = accIdfa;
    }

    public String getAccIdfa() 
    {
        return accIdfa;
    }
    public void setRegIp(String regIp) 
    {
        this.regIp = regIp;
    }

    public String getRegIp() 
    {
        return regIp;
    }
    public void setCount(Long count) 
    {
        this.count = count;
    }

    public Long getCount() 
    {
        return count;
    }
    public void setVersion(Long version) 
    {
        this.version = version;
    }

    public Long getVersion() 
    {
        return version;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("uid", getUid())
            .append("username", getUsername())
            .append("password", getPassword())
            .append("accIdfa", getAccIdfa())
            .append("regIp", getRegIp())
            .append("count", getCount())
            .append("version", getVersion())
            .toString();
    }
}
