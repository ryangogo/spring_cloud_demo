package cn.itcast.order.fegin;

import cn.itcast.order.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * describe：声明需要调用的额微服务名称
 * @FeignClient
 *      * name：服务提供者的名称
 *
 * Created with IDEA
 *
 * @author ryan
 * Date:2020/3/17
 * Time:上午9:29
 */
@FeignClient(name = "service-product")
public interface ProductFeignClient {

    /**
     * 配置需要掉用的微服务接口
     */
    @RequestMapping(value = "/product/{id}",method = RequestMethod.GET)
    Product findById(@PathVariable("id") Long id);

}
