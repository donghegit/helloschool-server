package com.grapep.byle;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.grapep.byle.common.swagger.FastJsonHttpMessageConverterEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.converter.HttpMessageConverter;

@SpringBootApplication
public class ByleApplication  extends SpringBootServletInitializer{


	public static void main(String[] args) {
		SpringApplication.run(ByleApplication.class, args);
	}


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}

	/**
	 * FastJsonHttpMessageConverter
	 * 使用FastJson替换系统Jackson
	 * @return
	 */
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverterEx();
		HttpMessageConverter<?> converter = fastConverter;
		return new HttpMessageConverters(converter);
	}
}
