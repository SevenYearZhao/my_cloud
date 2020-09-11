package com.bobo.controller;

import com.alibaba.fastjson.JSONObject;
import com.bobo.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author bobo
 * @date 2020-09-10
 */
@RestController
public class EstateController {
    @Autowired
    private EstateService estateService;

    @RequestMapping("/estate/selectCompany")
    public JSONObject selectCompany() {
        List<String> list = estateService.selectCompany();
        System.out.println(Arrays.toString(list.toArray()));
        return JSONObject.parseObject(JSONObject.toJSONString(list));
    }
}
