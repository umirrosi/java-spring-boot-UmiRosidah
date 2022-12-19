package com.umirrosi.demospringboot.config;

import com.umirrosi.demospringboot.model.Foo;
import com.umirrosi.demospringboot.model.Inventory;
import com.umirrosi.demospringboot.model.Product;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.spel.ast.Projection;

import java.io.InvalidClassException;

@Slf4j
@Configuration
public class BeanConfiguration {
    /*@Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("Created bean foo...!");
        return foo;
    }

    @Bean
    public Product product(){
        Product product = new Product();
        log.info("Created bean Product...!");
        return product;
    }

    @Bean
    public Inventory inventory(){
        Inventory inventory = new Inventory();
        log.info("Created bean Inventory...!");
        return inventory;
    }*/

}


