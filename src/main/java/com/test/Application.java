package com.test;
import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication(scanBasePackages={"com.test"})
@EnableAsync
public class Application {

    public static void main(String[] args) throws IOException, URISyntaxException {
         SpringApplication.run(Application.class);
    }

}