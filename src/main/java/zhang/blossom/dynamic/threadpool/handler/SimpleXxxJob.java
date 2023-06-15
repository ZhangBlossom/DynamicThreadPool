package zhang.blossom.dynamic.threadpool.handler;


import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import zhang.blossom.dynamic.threadpool.service.SendMailService;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author 张锦标
 * @version 1.0
 */
@Component
public class SimpleXxxJob {
    @Autowired
    private SendMailService sendMailService;

    @Autowired
    @Qualifier("commonThreadPool")
    private ThreadPoolExecutor threadPoolExecutor;
    //使用XXLJOB注解定义一个job
    @XxlJob(value = "sendMailHandler", init = "initHandler", destroy = "destroyHandler")
    public void sendMailHandler() {
        sendMailService.sendMailToWarn(threadPoolExecutor);
        System.out.println("发送短信成功。。。。。。。。。。。");
    }

    //任务初始化方法
    public void initHandler() {
        System.out.println("任务调用初始化方法执行");
    }

    public void destroyHandler() {
        System.out.println("任务执行器被销毁");
    }


}
