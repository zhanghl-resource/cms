package com.briup.cms.web.controller;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @PostMapping("authentication/form")
    @ApiOperation("登录逻辑")
    public void login(String username, String password){

    }
}
