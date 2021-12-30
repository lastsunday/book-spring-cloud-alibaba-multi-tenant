package com.github.lastsunday.cloud.multitenant.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.github.lastsunday.cloud.multitenant.entity.UserEntity;
import com.github.lastsunday.cloud.multitenant.service.TenantService;
import com.github.lastsunday.cloud.multitenant.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private UserService userService;

    @Resource
    private TenantService tenantService;

    //access url http://localhost:7867/test/1/tom
    @GetMapping(path = "/test/{tenantId}/{username}")
    public String test(@PathVariable Long tenantId,@PathVariable String username) throws JsonProcessingException {
        tenantService.loginTenant(tenantId);
        List<UserEntity> result = userService.getUserAndAddr(username);
        JsonMapper jsonMapper = new JsonMapper();
        return jsonMapper.writeValueAsString(result);
    }
}
