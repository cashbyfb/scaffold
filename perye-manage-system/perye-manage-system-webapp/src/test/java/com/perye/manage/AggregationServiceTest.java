package com.perye.manage;

import com.perye.manage.bean.domain.User;
import com.perye.manage.service.AggregationService;
import org.apache.commons.lang3.RandomStringUtils;
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
@RunWith(SpringRunner.class)
@SpringBootTest
public class AggregationServiceTest {

	@Autowired
	private AggregationService aggregationService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	public void saveUser() throws Exception {
		User user = new User();
		final String username = "admin" + RandomStringUtils.randomNumeric(3);
		user.setEmail("11143526@qq.com")
			.setNickName("perye")
			.setUsername(username)
			.setEnabled(true)
			.setPassword(passwordEncoder.encode("123456"));
		aggregationService.saveUser(user);

		System.err.println("username = " + username);

	}

	@Test
	public void intoUser() throws Exception {
		User user = new User();
		final String username = "admin" + RandomStringUtils.randomNumeric(3);
		user.setEmail("11143526@qq.com")
			.setNickName("perye")
			.setUsername(username)
			.setEnabled(true)
			.setPassword(passwordEncoder.encode("123456"));
		aggregationService.intoUser(user);

		System.err.println("username = " + username);

	}
}

















