package com.example.demo.controller;

import com.example.demo.apiversion.ApiVersion;
import com.example.demo.bean.JSONResult;
import com.example.demo.bean.Person;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@ApiVersion(value = 2)
@RestController
@RequestMapping("api/{version}/order")
public class OrderV2Controller {

    @GetMapping("/detail/{orderId}")
    public JSONResult queryOrderById(@PathVariable String orderId) {
        System.out.println("V2获取订单详情成功:"+orderId);
        return JSONResult.ok("V2获取订单详情成功");
    }

    @GetMapping("/list")
    public JSONResult list(){
        System.out.println("V2,新增list订单列表接口");
        return JSONResult.ok("V2,新增list订单列表接口");
    }

    @PostMapping("/save")
    public JSONResult saveOrder(@RequestBody Person person){
        System.out.println("V2,人员新增成功");
        return JSONResult.ok("V2,人员新增成功");
    }

    @DeleteMapping("/deleteBatch")
    public JSONResult deleteBathcOrder(@RequestBody List<Long> ids){
        System.out.println("V2人员批量删除成功");
        return JSONResult.ok("V2人员批量删除成功");
    }

}



