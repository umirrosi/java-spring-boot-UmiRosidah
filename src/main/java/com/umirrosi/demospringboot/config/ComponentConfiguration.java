package com.umirrosi.demospringboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "umirrosi.spring.dasar.componentscan"
})
public class ComponentConfiguration {
}
