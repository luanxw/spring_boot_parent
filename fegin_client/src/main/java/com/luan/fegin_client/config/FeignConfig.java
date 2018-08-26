package com.luan.fegin_client.config;

/**
 * FileName: FeignRetryer
 * Description: 这是Feign客户端的配置类
 *
 * @author ：LuanXW
 * @create 2018/8/25
 * @since 1.0.0
 */

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {
    @Bean
    public Retryer FeignRetryer(){
        return new Retryer.Default(100 , 2, 3);
    }

}