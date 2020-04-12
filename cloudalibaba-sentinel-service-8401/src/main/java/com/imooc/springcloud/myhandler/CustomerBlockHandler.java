package com.imooc.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.imooc.springcloud.entities.CommonResult;
import com.imooc.springcloud.entities.Payment;

/**
 * @author CBeann
 * @create 2020-04-12 1:22
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handlerException", new Payment(2020L, "serial0003"));
    }
    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义2,global handlerException", new Payment(2020L, "serial0003"));
    }
}