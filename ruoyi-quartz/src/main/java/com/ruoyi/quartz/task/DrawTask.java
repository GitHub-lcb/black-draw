package com.ruoyi.quartz.task;

import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.http.HttpUtils;
import com.ruoyi.common.utils.sign.SignUtils;
import com.ruoyi.system.domain.vo.DrawBaoDi;
import com.ruoyi.system.service.IDrawRecordService;
import com.ruoyi.system.service.IGameAccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 定时任务调度测试
 * 
 * @author ruoyi
 */
@Component("drawTask")
@Slf4j
public class DrawTask
{



    private static final String gmUrl = "http://gm-sszg.lichenbo.cn/gm9/user/gmquery.php";

    @Autowired
    private IGameAccountService gameAccountService;

    @Autowired
    private IDrawRecordService drawRecordService;

    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i)
    {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    public void ryParams(String params)
    {
        System.out.println("执行有参方法：" + params);
    }

    public void ryNoParams()
    {
        gameAccountService.updategameAccountCount();
    }

    /**
     * 周末福利定时任务
     */
    public void weeklyFuli()
    {
        gameAccountService.updategameAccountIp();
    }

    /**
     * 发送保底福利
     */
    public void baoDi()
    {
        log.info("======发送保底福利开启=======");

        List<DrawBaoDi> list = drawRecordService.selectBaodi();
        list.forEach(drawBaoDi -> {
            // 钻石500
            String result1 = sendEmail("3", drawBaoDi.getUsername(), 500*drawBaoDi.getCount(), "daoju");
            // 随机5星碎片
            String result2 = sendEmail("29905", drawBaoDi.getUsername(), 5*drawBaoDi.getCount(), "daoju");

            log.info("======发送保底福利======= : username: {} ,数量：{}， 结果： {}", drawBaoDi.getUsername(),drawBaoDi.getCount(), result1+result2);


        });

        log.info("======发送保底福利结束=======");
    }


    public String sendEmail(String item, String uid, int num, String type) {
        // 发送邮件
        String paramEmail = "type=" + type + "&qu=1&checknum=952000&item=" + item + "&uid=" + uid + "&num=" + num;
        String sign = SignUtils.getSign(paramEmail);
        return HttpUtils.sendPost(gmUrl, paramEmail + "&sign=" + sign);
    }
}
