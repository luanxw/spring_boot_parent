package com.luan.fegin_client.Controller;

import com.luan.fegin_client.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class HiController {
    @Autowired
    HiService hiService;

    @RequestMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "luanyi" , required = false) String name){
        return hiService.SayHi(name);
    }
}