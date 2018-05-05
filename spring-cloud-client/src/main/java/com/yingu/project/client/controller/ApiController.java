package com.yingu.project.client.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;


/**
 * Created by MMM on 2018/05/05.
 */
@RestController
@RequestMapping(value = "api")
public class ApiController {
    @RequestMapping(value = "/getMessage",method = RequestMethod.POST)
    public String getMessage(@RequestParam(value = "fromNode") String fromNode){
        return MessageFormat.format("由{0}节点,调用client节点",fromNode);
    }
}
