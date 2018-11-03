package cn.leyou.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("cn.leyou.user.mapper")
@EnableEurekaClient
@EnableDiscoveryClient//开启eureka客户端功能
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
