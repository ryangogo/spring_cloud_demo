package cn.itcast.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.persistence.Entity;

/**
 * describe：
 * Created with IDEA
 *
 * @author ryan
 * Date:2020/2/25
 * Time:下午2:40
 */
@SpringBootApplication
@EntityScan("cn.itcast.product.entity")
//激活eurekaClient注册中心
//@EnableEurekaClient
//@EnableDiscoveryClient
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class);
    }
}
