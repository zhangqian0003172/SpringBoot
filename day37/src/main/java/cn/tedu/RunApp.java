package cn.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication

public class RunApp {
    public static void main(String[] args) {
        SpringApplication.run(RunApp.class);
    }
}
