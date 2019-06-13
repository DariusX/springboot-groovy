package com.xby2.team1

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication (scanBasePackages = "com.xby2.team1")
class Application {

    static void main(String[] args) {
        SpringApplication.run(Application.class, args)
    }

}
