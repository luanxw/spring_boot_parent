package com.luan.eureka_client.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: HelloController
 * Description: hello欢迎页面的，这是一个测试环境
 *
 * @author ：LuanXW
 * @create 2018/8/25
 * @since 1.0.0
 */

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam(defaultValue = "luanyi") String name){
        return "hi ! "+name+",I am eureka_client. This is "+port+" port for your service";
    }
}