package cn.itcast.order.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * describe：
 * Created with IDEA
 *
 * @author ryan
 * Date:2020/2/25
 * Time:下午2:11
 */
@Data
public class Product {

    private Long id;

    private String productName;

    private Integer status;

    private BigDecimal price;

    private String productDesc;

    private String caption;

    private Integer inventory;
}
