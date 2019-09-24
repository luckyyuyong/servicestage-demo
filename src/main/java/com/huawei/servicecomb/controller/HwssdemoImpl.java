package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-09-24T03:22:48.896Z")

@RestSchema(schemaId = "hwssdemo")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class HwssdemoImpl {

    @Autowired
    private HwssdemoDelegate userHwssdemoDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userHwssdemoDelegate.helloworld(name);
    }

}
