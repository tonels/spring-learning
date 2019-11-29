package com.spring.runner;

import com.spring.runner.dao.CityRepo;
import com.spring.runner.model.City;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private CityRepo cityRepo;

    @Override
    public void run(String... args) throws Exception {
        cityRepo.deleteAll();

        cityRepo.save(new City("Bratislava", 432000));
        cityRepo.save(new City("Budapest", 1759000));
        cityRepo.save(new City("Prague", 1280000));

        cityRepo.findAll().forEach((city) -> {
            logger.info("{}", city);
        });
    }
}
