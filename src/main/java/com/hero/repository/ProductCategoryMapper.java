package com.hero.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hero.entity.ProductCategory;

public interface ProductCategoryMapper {
	//根据id删除商品类别(rfy)
    int deleteByPrimaryKey(Integer pcId);
    //判断商品类别是否存在商品关联(rfy)
    public int isExitProById(Integer pcId);
    
    int insert(ProductCategory record);
    
    //添加商品类别(rfy)
    int insertSelective(ProductCategory record);
    //根据类别名称和父id查询类别是否存在(rfy)
    public int isExitByPcnameAndPid(@Param("pcname")String pcname,@Param("pid")Integer pid);
    
    //根据id查询商品类别信息(rfy)
    ProductCategory selectByPrimaryKey(Integer pcId);
    //修改商品类别信息(rfy)
    int updateByPrimaryKeySelective(ProductCategory record);

    int updateByPrimaryKey(ProductCategory record);
    
    //根据供应商编号查询出所拥有的商品分类编号(rfy)
  	public List<Integer> selectPcidBySid(Integer sid);
    //查询出父模块对应的子模块(rfy)
  	public List<ProductCategory> queryChildrenById(Integer parentId);
  	
  	//根据父id查询其孩子的编号(rfy)
  	public List<Integer> getChildrenIdByPid(Integer pid);
  	
  	//根据商品类别编号删除供应商商品类别中间表(rfy)
  	public int delSuProCateByPCid(Integer pcid);
  	
}