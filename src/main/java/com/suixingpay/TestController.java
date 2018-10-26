package com.suixingpay;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chiyajing on 2017/7/26.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping(value = "/list", method = {RequestMethod.GET})
    public String list() {
     return "test list";

    }
}
