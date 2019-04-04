package com.zft.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author zft
 * @date 2019/4/4.
 */
@Controller
@RequestMapping("config")
@RefreshScope
public class ConfigController {

	@NacosValue(value = "${dept}", autoRefreshed = true)
	private String dept;
	@NacosValue(value = "${comment}", autoRefreshed = true)
	private String comment;

	@RequestMapping(value = "/get/dept", method = GET)
	@ResponseBody
	public String getDept() {
		return dept;
	}

	@RequestMapping(value = "/get/comment", method = GET)
	@ResponseBody
	public String getComment() {
		return comment;
	}

}
