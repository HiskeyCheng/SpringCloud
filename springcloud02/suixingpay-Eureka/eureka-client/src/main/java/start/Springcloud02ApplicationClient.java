package start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class Springcloud02ApplicationClient {

    public static void main(String[] args) {
        SpringApplication.run(Springcloud02ApplicationClient.class, args);
    }
}
