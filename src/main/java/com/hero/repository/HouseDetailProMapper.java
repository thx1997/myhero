package com.hero.repository;

import java.util.List;

import com.hero.entity.HouseDetailPro;
import com.hero.entity.query.HouseDetailProQuery;
import com.hero.entity.query.HouseDetailProQuery1;

public interface HouseDetailProMapper {
    /**
     * 根据仓库编号和商品类别编号查询商品
     * @author thx
     * @param query
     * @return
     */
    public List<HouseDetailPro> queryProBYPcidAndSid(HouseDetailProQuery1 query);
    /**
     * 根据仓库编号和商品类别编号查询商品
     * @author thx
     * @param query
     * @return
     */
    public int queryProBYPcidAndSidCount(HouseDetailProQuery1 query);
	
    
	
    int insert(HouseDetailPro record);

    int insertSelective(HouseDetailPro record);
    
    //多条件分页查询(rfy)
    public List<HouseDetailPro> queryPage(HouseDetailProQuery query);
    //查询总条数(rfy)
    public int queryCountPage(HouseDetailProQuery query);
    
    
}