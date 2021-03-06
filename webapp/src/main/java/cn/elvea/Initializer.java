package cn.elvea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 应用初始化类
 */
@SpringBootApplication
public class Initializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Initializer.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Initializer.class, args);
    }
}
