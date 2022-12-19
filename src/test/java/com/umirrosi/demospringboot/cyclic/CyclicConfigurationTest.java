package com.umirrosi.demospringboot.cyclic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class CylicConfigurationTest {
    private ApplicationContext context;
    @BeforeEach
    void setUp() {
    }

    @Test
    void circularTest() {
        Assertions.assertThrows(Throwable.class, () -> {
            context = new AnnotationConfigApplicationContext(CylicConfiguration.class);
        });
    }
}
