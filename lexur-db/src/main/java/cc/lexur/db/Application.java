package cc.lexur.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cc.lexur.db")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
