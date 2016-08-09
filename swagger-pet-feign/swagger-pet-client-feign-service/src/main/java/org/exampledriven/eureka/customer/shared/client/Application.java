package org.exampledriven.eureka.customer.shared.client;

import io.swagger.api.PetsApiClient;
import org.exampledriven.eureka.customer.shared.client.controller.PetsApiClient2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableWebMvc
@EnableFeignClients(basePackageClasses = PetsApiClient2.class)
@ComponentScan(basePackageClasses = {PetsApiClient.class, PetsApiClient2.class, Application.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}


