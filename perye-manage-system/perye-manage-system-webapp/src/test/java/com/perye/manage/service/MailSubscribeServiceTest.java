package com.perye.manage.service;

import com.github.pagehelper.PageInfo;
import com.perye.common.PagingRequest;
import com.perye.manage.bean.domain.MailSubscribe;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith( SpringRunner.class )
@SpringBootTest
public class MailSubscribeServiceTest {

    @Autowired
    private MailSubscribeService mailSubscribeService;

    @Test
    public void listPage () {
        final PageInfo< MailSubscribe > pageInfo = mailSubscribeService.listPage( new PagingRequest() );
        System.err.println("pageInfo = " + pageInfo);
    }
}
