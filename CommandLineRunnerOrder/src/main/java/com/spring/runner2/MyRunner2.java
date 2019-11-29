package com.spring.runner2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class MyRunner2 implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner2.class);

    @Override
    public void run(String... args) throws Exception {

        logger.info("Running MyRunner2");
    }
}
