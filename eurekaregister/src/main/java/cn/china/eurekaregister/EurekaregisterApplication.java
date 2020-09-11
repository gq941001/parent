package cn.china.eurekaregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//表示当前项目是eureka注册中心
@EnableEurekaServer
public class EurekaregisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaregisterApplication.class, args);

    }

}
