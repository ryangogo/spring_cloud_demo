package cn.itcast.product.service;

import cn.itcast.product.entity.Product;

/**
 * describe：
 * Created with IDEA
 *
 * @author ryan
 * Date:2020/2/25
 * Time:下午2:21
 */

public interface ProductService {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Product findById(Long id);

    /**
     * 保存
     * @param product
     */
    void save(Product product);

    /**
     * 更新
     * @param product
     */
    void update(Product product);

    /**
     * 删除
     * @param id
     */
    void delete(Long id);

}
