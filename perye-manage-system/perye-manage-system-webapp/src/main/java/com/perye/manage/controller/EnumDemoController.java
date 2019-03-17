package com.perye.manage.controller;

import com.perye.manage.bean.domain.PermissionResource;
import com.perye.manage.permission.Pass;
import com.perye.manage.service.PermissionResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 枚举映射
 *
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Pass
@RestController
@RequestMapping( "enums" )
public class EnumDemoController {

    @Autowired
    private PermissionResourceService permissionResourceService;


    @GetMapping
    public ResponseEntity< List< PermissionResource > > list () {
        return ResponseEntity.ok().body( permissionResourceService.list() );
    }


}
