package project.z_v;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ZVApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZVApplication.class, args);
    }

}
