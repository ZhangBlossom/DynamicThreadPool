package zhang.blossom.dynamic.threadpool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zhang.blossom.dynamic.threadpool.config.ThreadPoolProperty;

/**
 * @author: 张锦标
 * @date: 2023/6/15 11:59
 * TestController类
 */
@RestController
public class TestController {
    @Autowired
    private ThreadPoolProperty threadPoolProperty;
    @GetMapping("/get")
    public String getValue(){
        return threadPoolProperty.getMaximumPoolSize() +"  "+
        threadPoolProperty.getCorePoolSize()+"  "+
                threadPoolProperty.getQueueCapacity();
    }
}
