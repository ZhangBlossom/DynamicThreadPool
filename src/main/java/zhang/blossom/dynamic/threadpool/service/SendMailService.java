package zhang.blossom.dynamic.threadpool.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: 张锦标
 * @date: 2023/6/15 15:24
 * SendMailToWarn类
 */
@Service
public class SendMailService{

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${warn.recipient}")
    public String recipient;

    @Value("${warn.addresser}")
    public String addresser;


    public boolean sendMailToWarn(ThreadPoolExecutor threadPoolExecutor){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(recipient);
        simpleMailMessage.setFrom(addresser);
        simpleMailMessage.setSubject("线程池情况汇报");
        String s = "CorePoolSize="+threadPoolExecutor.getCorePoolSize()+"   "+
                "LargestPoolSize="+threadPoolExecutor.getLargestPoolSize()+"   "+
                "MaximumPoolSize="+threadPoolExecutor.getMaximumPoolSize();
        simpleMailMessage.setText(s);
        javaMailSender.send(simpleMailMessage);
        return true;
    }
}
