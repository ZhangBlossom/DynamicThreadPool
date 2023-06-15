package zhang.blossom.dynamic.threadpool.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author: 张锦标
 * @date: 2023/6/15 11:25
 * ThreadPoolProperty类
 */
//@Configuration
@RefreshScope
@Component
@ConfigurationProperties("dynamic.threadpool")
public class ThreadPoolProperty {
    //@Value("${dynamic.threadpool.corePoolSize}")
    private Integer corePoolSize;
    //@Value("${dynamic.threadpool.maximumPoolSize}")
    private Integer maximumPoolSize;
    //@Value("${dynamic.threadpool.queueCapacity}")
    private Integer queueCapacity;

    public Integer getCorePoolSize() {
        return corePoolSize;
    }

    public void setCorePoolSize(Integer corePoolSize) {
        this.corePoolSize = corePoolSize;
    }

    public Integer getMaximumPoolSize() {
        return maximumPoolSize;
    }

    public void setMaximumPoolSize(Integer maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }

    public Integer getQueueCapacity() {
        return queueCapacity;
    }

    public void setQueueCapacity(Integer queueCapacity) {
        this.queueCapacity = queueCapacity;
    }
}
