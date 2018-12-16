package com.hero.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.Product;
import com.hero.entity.query.ProductQuery;
import com.hero.entity.query.StorehousePro;

public interface ProductService {
	/**
	 * 根据仓库编号和商品类别编号查询商品
	 * @author thx
	 * @param storehousePro 条件封装的实体类
	 * @return 商品集合
	 */
	List<Product> queryProBYPcidAndSid(StorehousePro storehousePro);
	/**
	 * 根据仓库编号和商品类别编号查询商品
	 * @author thx
	 * @param storehousePro 条件封装的实体类
	 * @return 商品集合的总条数
	 */
	int queryProBYPcidAndSidCount(StorehousePro storehousePro);
	//多条件分页查询商品(rfy)
    public List<Product> selectProByQuery(ProductQuery pquery);
    //查询总条数(rfy)
    public int selectCountByQuery(ProductQuery pquery);
    
     //修改商品信息(rfy)
    int updateByPrimaryKeySelective(Product record);
    
    //添加商品的供货商(rfy)
    public int insertProSupplier(@Param("sid")Integer sid,@Param("pid")Integer pid);
    //修改商品的供货商(rfy)
    public int updProSupplier(@Param("sid")Integer sid,@Param("spid")Integer spid);
}
