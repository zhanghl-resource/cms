package com.briup.cms.web.controller;

import com.briup.cms.bean.Catagory;
import com.briup.cms.service.ICatagoryService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/catagory")
@Api(description = "栏目管理")
public class CatagoryController {

    @Autowired
    private ICatagoryService catagoryService;

    @ApiOperation("添加栏目")
    @PostMapping("/add")
    public Message addCatagory(Catagory catagory){
        catagoryService.saveOrUpdate(catagory);
        return MessageUtil.success();
    }

    @ApiOperation("根据id删除栏目")
    @GetMapping("/deleteById")
    @ApiImplicitParam(name = "id",value = "栏目id",paramType = "query",dataType = "int",required = true)
    public Message deleteBYId(int id){
        catagoryService.deleteById(id);
        return MessageUtil.success();
    }

    @ApiOperation("更新栏目")
    @PostMapping("/updata")
    public Message update(Catagory catagory){
        catagoryService.saveOrUpdate(catagory);
        return MessageUtil.success();
    }

    @GetMapping("/findById")
    @ApiOperation("根据id查询栏目")
    @ApiImplicitParam(name = "id",value = "栏目id",paramType = "query",dataType = "int",required = true)
    public Message<Catagory> findById(int id){
        return MessageUtil.success(catagoryService.findById(id));
    }

    @GetMapping("/findAll")
    @ApiOperation("查询所有栏目")
    public Message<List<Catagory>> findAll(){
        return MessageUtil.success(catagoryService.findAll());
    }
}
