package by.artbax.service.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "by.artbax.service")
@EnableJpaRepositories(basePackages = "by.artbax.service.repositories")
@EntityScan(basePackages = "by.artbax.service.models")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
