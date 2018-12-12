package com.hero.service;

import java.util.List;

import com.hero.entity.Product;
import com.hero.entity.query.ProductQuery;

public interface ProductService {
	//多条件分页查询商品(rfy)
    public List<Product> selectProByQuery(ProductQuery pquery);
    //查询总条数(rfy)
    public int selectCountByQuery(ProductQuery pquery);
}
