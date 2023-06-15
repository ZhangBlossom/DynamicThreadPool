package zhang.blossom.dynamic.threadpool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zhang.blossom.dynamic.threadpool.config.ThreadPoolProperty;
import zhang.blossom.dynamic.threadpool.core.DynamicThreadPool;

/**
 * @author: 张锦标
 * @date: 2023/6/15 11:54
 * DynamicThreadPoolApplication类
 */
@SpringBootApplication
//@EnableConfigurationProperties({ThreadPoolProperty.class})
@EnableDiscoveryClient
public class DynamicThreadPoolApplication {
    public static void main(String[] args) {
        SpringApplication.run(DynamicThreadPoolApplication.class,args);
    }

}
