package com.umirrosi.demospringboot.importConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class,
        FooBarConfiguration.class
})
public class ImportConfiguration {

}


