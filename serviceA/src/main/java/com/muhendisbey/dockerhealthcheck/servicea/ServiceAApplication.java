package com.muhendisbey.dockerhealthcheck.servicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceAApplication
{

    public static void main(String[] args) throws InterruptedException
    {
        Thread.sleep(9000);
        SpringApplication.run(ServiceAApplication.class, args);
    }

}
