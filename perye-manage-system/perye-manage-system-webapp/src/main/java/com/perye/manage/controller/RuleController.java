package com.perye.manage.controller;

import com.perye.manage.permission.Pass;
import com.perye.manage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
@Pass
@RestController
@RequestMapping( "rules" )
public class RuleController {

    @Autowired
    private UserService userService;

    public static void main ( String[] args ) {



    }


    public void rule () {


    }


}
