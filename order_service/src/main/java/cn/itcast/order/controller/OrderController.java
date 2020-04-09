package cn.itcast.order.controller;

import cn.itcast.order.entity.Product;
import cn.itcast.order.fegin.ProductFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * describe：
 * Created with IDEA
 *
 * @author ryan
 * Date:2020/2/25
 * Time:下午3:23
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private ProductFeignClient productFeignClient;


    @RequestMapping(value = "/buy/{id}",method = RequestMethod.GET)
    public Product findById(@PathVariable Long id){
        return productFeignClient.findById(id);

    }

}
