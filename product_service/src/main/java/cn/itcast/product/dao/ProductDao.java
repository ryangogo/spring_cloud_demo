package cn.itcast.product.dao;

import cn.itcast.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * describe：
 * Created with IDEA
 *
 * @author ryan
 * Date:2020/2/25
 * Time:下午2:18
 */

public interface ProductDao extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {
}
