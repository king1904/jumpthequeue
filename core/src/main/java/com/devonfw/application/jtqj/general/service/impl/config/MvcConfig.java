package com.devonfw.application.jtqj.general.service.impl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

  // @Override
  // public void addViewControllers(ViewControllerRegistry registry) {
  // registry.addViewController("/home").setViewName("home");
  // registry.addViewController("/").setViewName("login");
  // registry.addViewController("/403").setViewName("403");
  // }

  @Bean
  public InternalResourceViewResolver viewResolver() {

    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/static/");
    resolver.setSuffix(".html");
    return resolver;
  }

}