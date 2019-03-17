package com.perye.manage.controller;

import com.github.pagehelper.PageInfo;
import com.perye.common.PagingRequest;
import com.perye.common.ResponseEntityPro;
import com.perye.common.annotation.Log;
import com.perye.manage.bean.domain.User;
import com.perye.manage.permission.Pass;
import com.perye.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Pass
@RestController
@RequestMapping( "log" )
public class LogDemoController {

    @Autowired
    private UserService userService;

    @Log
    @GetMapping( "users" )
    public ResponseEntity< List< User > > users () {
        return ResponseEntityPro.ok( userService.list() );
    }

    @GetMapping( "users-page" )
    public ResponseEntity< PageInfo< User > > listPage ( PagingRequest pagingRequest ) {
        return ResponseEntityPro.ok( userService.listPage( pagingRequest ) );
    }


}
