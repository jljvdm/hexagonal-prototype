package nu.bldr.hexagonalprototype.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = "nu.bldr.hexagonalprototype")
@Configuration
public class BootstrapApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootstrapApplication.class, args);
    }
}
