package com.yingu.project.feign.controller;

import com.yingu.project.feign.rpc.ApiHelper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Created by MMM on 2018/05/05.
 */
@RestController
@RequestMapping(value="/feign")
public class FeignController {
    @Autowired
    ApiHelper apiHelper;
    @ApiOperation(value="getMessage",notes="返回结果,SUCCESS:100,FAILED:200",httpMethod = "POST")
    @RequestMapping(value = "/getMessage",method = RequestMethod.POST)
    public void getMessage(){
        try {
            String str = apiHelper.getMessage("feign");
            System.out.println(str);
        }
        catch (Exception ex){
            System.out.println("feign error");
        }
    }
}
