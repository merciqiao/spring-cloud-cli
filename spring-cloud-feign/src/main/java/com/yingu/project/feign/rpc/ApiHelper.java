package com.yingu.project.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by MMM on 2018/05/05.
 */
@FeignClient(value = "cloud-client")
public interface ApiHelper {
    @RequestMapping(value = "api/getMessage", method = RequestMethod.POST)
    String getMessage(@RequestParam(value = "fromNode") String fromNode);
}
