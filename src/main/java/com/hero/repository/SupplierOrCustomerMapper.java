package com.hero.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.SupplierOrCustomerQuery;

public interface SupplierOrCustomerMapper {
    int deleteByPrimaryKey(Integer sId);
    
    int insert(SupplierOrCustomer record);
    //添加（rfy）
    int insertSelective(SupplierOrCustomer record);

    SupplierOrCustomer selectByPrimaryKey(Integer sId);
    //修改（rfy）
    int updateByPrimaryKeySelective(SupplierOrCustomer record);

    int updateByPrimaryKey(SupplierOrCustomer record);
    
    //多条件分页查询供应商客户信息(rfy)
    public List<SupplierOrCustomer> selectAllByCount(SupplierOrCustomerQuery scquery);
    //查询分页总记录数(rfy)
    public int selectCount(SupplierOrCustomerQuery scquery);
    //软删（rfy）
    public int updexit(Integer sId);
    //根据名称查询是否已存在(rfy)
    public int isExitByName(String name);
    //根据名称和类型查询是否已存在(rfy)
    public int isExitByNameAndType(String name,Integer stype);
    //批量修改供应商、客户的类别（rfy）
    public int updBatch(@Param("cateid")int cateid,@Param("list")List<Integer> sid);
    
    //根据编号查询供货商客户信息（rfy）
  	public List<SupplierOrCustomer> getSupplierOrCustomerBySid(@Param("list")List<Integer> sList);
    //多条件查询供货商客户的编号(导出当前加载数据中的所有供货商客户的信息时使用)(rfy)
  	public List<Integer> getIdsByQuery(SupplierOrCustomerQuery scquery);
  	
    //导入供货商客户信息（rfy）
  	public int importSupplierOrCustomer(@Param("list")List<SupplierOrCustomer> scu);
    //删除供货商的商品类别（rfy）
  	public int delProCateBySid(Integer sid);
  	//添加供货商的商品类别（rfy）
  	public int insertSupplierProCate(@Param("sid")Integer sid,@Param("pcids")List<Integer> pcids);
  	
  	//查询所有供应商信息（rfy）
  	public List<SupplierOrCustomer> getAllSupplier();
  	
  	
}