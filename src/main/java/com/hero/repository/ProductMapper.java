package com.hero.repository;

import java.util.List;

import com.hero.entity.Module;
import com.hero.entity.Product;
import com.hero.entity.query.ProductQuery;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
    //多条件分页查询商品(rfy)
    public List<Product> selectProByQuery(ProductQuery pquery);
    //查询总条数(rfy)
    public int selectCountByQuery(ProductQuery pquery);
    
}