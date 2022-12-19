package com.umirrosi.demospringboot.config;

import com.umirrosi.demospringboot.model.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Slf4j
@Configuration
public class DuplicateBeanConfiguration {
    @Primary
    @Bean
    public Foo foo1(){
        log.info("Foo1");
        return new Foo();
    }

    @Bean
    public Foo foo2(){
        log.info("Foo2");
        return new Foo();
    }
}

