package com.zft.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;

/**
 * @author zft
 * @date 2019/4/4.
 */
@NacosConfigurationProperties(
		dataId = "test"
)
public class Foo {

	private String dept;

	private String group;

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "com.zft.config.Foo{" +
				"dept='" + dept + '\'' +
				", group='" + group + '\'' +
				'}';
	}
}
