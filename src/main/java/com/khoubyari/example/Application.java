package com.khoubyari.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext ctx = new SpringApplication("integration.xml").run(args);
		Thread.sleep(30000);
        ctx.close();
    }

}
