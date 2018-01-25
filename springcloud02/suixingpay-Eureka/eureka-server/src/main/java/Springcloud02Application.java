package Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class Springcloud02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud02Application.class, args);
    }
}
