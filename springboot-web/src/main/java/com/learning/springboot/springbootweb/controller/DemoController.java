package com.learning.springboot.springbootweb.controller;

import com.alibaba.fastjson.JSONObject;
import com.learning.springboot.springbootweb.constant.ResultCode;
import com.learning.springboot.springbootweb.vo.request.DemoRequest;
import com.learning.springboot.springbootweb.vo.response.DemoResponse;
import org.springframework.web.bind.annotation.*;

/**
 * @description: demo
 * @author: sunfeifei
 * @create: 2019-09-24 17:31
 **/
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    @RequestMapping(value = "/demo1", method = RequestMethod.GET)
    public DemoResponse demoMethod(@RequestParam(value = "request") String requestJson) {

        DemoResponse demoResponse = new DemoResponse();

        DemoRequest demoRequest = JSONObject.parseObject(requestJson, DemoRequest.class);

        System.out.println("demoRequest.toString() = " + demoRequest.toString());

        return demoResponse;
    }

    @RequestMapping(value = "/demo2", method = RequestMethod.GET)
    public DemoResponse demoMethod2(@RequestBody JSONObject requestJson) {

        DemoResponse demoResponse = new DemoResponse();

        DemoRequest demoRequest = JSONObject.parseObject(requestJson.toJSONString(), DemoRequest.class);

        System.out.println("demoRequest.toString() = " + demoRequest.toString());

        if (demoRequest == null) {
            demoResponse.setResultCode(ResultCode.FAILED);
            demoResponse.setErrorCode("ERROR");
            demoResponse.setResultDesc("参数错误");
        }
        return demoResponse;
    }
}
