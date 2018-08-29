package com.revengemission.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class ScheduledTasksApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ScheduledTasksApplication.class, args);
    }

}
