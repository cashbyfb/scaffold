package com.perye.manage;

import com.perye.common.util.JsonUtils;
import com.perye.manage.bean.domain.User;
import com.perye.manage.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Perye
 * @Date: 2019-03-17
 */
@RunWith( SpringRunner.class )
@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	public void save () throws Exception {
		User user = new User();
		user.setEmail( "11143526@qq.com" )
			.setNickName( "perye" )
			.setUsername( "admin" )
			.setEnabled( true )
			.setPassword( passwordEncoder.encode( "admin" ) );
		userService.save( user );

	}

	@Test
	public void name() {
		final User admin = userService.findByUsername("admin");

		System.err.println(admin);

		JsonUtils.toJson(admin);

	}
}

















