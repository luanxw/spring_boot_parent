package com.luan.fegin_client.service;

import com.luan.fegin_client.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FileName: EurekaClientFeign
 * Description: Feign Client 客户端的一个接口
 *
 * @author ：LuanXW
 * @create 2018/8/25
 * @since 1.0.0
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {
    @GetMapping("/hi")
    String SayHiFromClientEureka(@RequestParam(value = "name") String name);

}