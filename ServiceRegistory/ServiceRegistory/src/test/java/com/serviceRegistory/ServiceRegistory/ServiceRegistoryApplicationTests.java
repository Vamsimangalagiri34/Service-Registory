package com.serviceRegistory.ServiceRegistory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EurekaServerAutoConfiguration;

@SpringBootTest(classes = ServiceRegistoryApplication.class)
//@EnableAutoConfiguration(exclude = {EurekaClientAutoConfiguration.class, EurekaServerAutoConfiguration.class})
//@TestPropertySource(properties = { "eureka.client.enabled=false" })
class ServiceRegistoryApplicationTests {
//
//	@Test
//	void contextLoads() {
//	}

}
