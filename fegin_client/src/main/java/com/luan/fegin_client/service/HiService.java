package com.luan.fegin_client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FileName: HiService
 * Description: 服务层
 *
 * @author ：LuanXW
 * @create 2018/8/25
 * @since 1.0.0
 */
@Service
public class HiService {
    @Autowired
    EurekaClientFeign eurekaClientFeign;
    public  String SayHi(String  name){
        return eurekaClientFeign.SayHiFromClientEureka(name);
    }

}