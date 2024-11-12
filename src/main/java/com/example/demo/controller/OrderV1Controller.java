package com.example.demo.controller;

import com.example.demo.apiversion.ApiVersion;
import com.example.demo.bean.JSONResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiVersion(value = 1)
@RestController
@RequestMapping("api/{version}/order")
public class OrderV1Controller {

    @GetMapping("/delete/{orderId}")
    public JSONResult deleteOrderById(@PathVariable String orderId) {
        System.out.println("V1删除订单成功:"+orderId);
        return JSONResult.ok("V1删除订单成功");
    }

    @GetMapping("/detail/{orderId}")
    public JSONResult queryOrderById(@PathVariable String orderId) {
        System.out.println("V1获取订单详情成功:"+orderId);
        return JSONResult.ok("V1获取订单详情成功");
    }

}
