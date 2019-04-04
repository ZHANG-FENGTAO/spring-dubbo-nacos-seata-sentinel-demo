package com.zft.consumer;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zft
 * @date 2019/4/4.
 */

@RestController
public class TestController {

	private final RestTemplate restTemplate;

	@Autowired
	public TestController(RestTemplate restTemplate) {this.restTemplate = restTemplate;}

	@SentinelResource("echo-web")
	@RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
	public String echo(@PathVariable String str) {
		return restTemplate.getForObject("http://service-provider/echo/" + str, String.class);
	}
}
