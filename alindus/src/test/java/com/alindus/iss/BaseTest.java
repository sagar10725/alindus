package com.alindus.iss;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(DoNothingRunner.class)
@SpringApplicationConfiguration(classes = AlindusIssApplication.class)
@WebAppConfiguration
public class BaseTest {

	//@Test
	public void contextLoads() {
	}

}
