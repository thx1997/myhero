package com.hero.service;

import java.util.List;

import com.hero.entity.ProductUnit;

public interface ProductUnitService {
	/**
	 * 跟据规格单位编号查询规格单位名
	 * @author thx
	 * @param puId 规格单位编号
	 * @return
	 */	
	String selectPuNameBypuid(Integer puId);
	//查询所有单位(rfy)
    public List<ProductUnit> queryAllUnit();
  //多条件分页查询(rfy)
    public List<ProductUnit> queryByNamePage(ProductUnit record);
    //查询总条数(rfy)
    public int queryCountByName(ProductUnit record);
    
    //删除单位(rfy)
    int deleteByPrimaryKey(Integer puId);
    //添加单位(rfy)
    int insertSelective(ProductUnit record);
    //修改单位(rfy)
    int updateByPrimaryKeySelective(ProductUnit record);
    //根据名称判断是否存在(rfy)
    public int isExitByName(String puname);
    //根据单位编号查询单位信息(rfy)
    ProductUnit selectByPrimaryKey(Integer puId);
    
}
