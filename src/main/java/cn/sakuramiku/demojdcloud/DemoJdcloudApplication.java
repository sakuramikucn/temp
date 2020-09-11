package cn.sakuramiku.demojdcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.sakuramiku.demojdcloud.dao")
@SpringBootApplication
public class DemoJdcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJdcloudApplication.class, args);
    }

}
