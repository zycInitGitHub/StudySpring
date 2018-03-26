package com.spring.two.chapterFive.buildSpringWeb.buildSpringMVC;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
//@ComponentScan(basePackages = {"com.spring.two.chapterFive.buildSpringWeb.buildSpringMVC"},
@ComponentScan(basePackages = {"com.spring.two.chapterFive.buildSpringWeb.buildSpringMVC"},
    excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)
    })
public class RootConfig {
}