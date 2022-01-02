package cn.itlemon.spring.security.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-01-01
 */
@RestController
@SpringBootApplication
public class SpringSecurityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityDemoApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello Spring Security!";
    }

}
