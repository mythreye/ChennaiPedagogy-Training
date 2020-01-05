package com.niit.Ques3SpringMVC.Config;

import javax.servlet.annotation.MultipartConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.niit.Ques3SpringMVC")
@MultipartConfig
public class WebConfig extends WebMvcConfigurerAdapter {
}