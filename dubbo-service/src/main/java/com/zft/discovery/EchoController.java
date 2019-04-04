package com.zft.discovery;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zft
 * @date 2019/4/4.
 */
@RestController
public class EchoController {

	@SentinelResource("echo")
	@RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
	public String echo(@PathVariable String string) {
		return "Hello Nacos Discovery " + string;
	}
}
