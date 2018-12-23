package com.hero.service;

import java.util.List;

import com.hero.entity.Employee;
import com.hero.entity.StoreHouse;
import com.hero.entity.query.StoreHouseQuery;

public interface StoreHouseServer {
	/**
	 * 查询所有正常的仓库（除去停用的）
	 * @return 可用仓库集合
	 */
	List<StoreHouse> queryAllInvoicing();
	
	int deleteByPrimaryKey(Integer sId);

    int insertSelective(StoreHouse record);

    StoreHouse selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(StoreHouse record);

    List<StoreHouse> selectByStoreHouseQuery(StoreHouseQuery storeHouseQuery);
    
    int selectCountByStoreHouseQuery(StoreHouseQuery storeHouseQuery);
    
    List<Employee> selEctemplByStoreHouse();
    
    int lockStoreHouse(int sid,int status);
    
    //根据用户编号查询仓库编号(rfy)
    public int selSidByEid(Integer eid);
}
