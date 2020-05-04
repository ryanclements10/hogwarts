package edu.tcu.cs.hogwartsartifactonline;

import edu.tcu.cs.hogwartsartifactonline.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HogwartsartifactonlineApplication {

    public static void main(String[] args) {
        SpringApplication.run(HogwartsartifactonlineApplication.class, args);
    }
    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1,1);
    }
}
