package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.SupplierOrCustomerQuery;
import com.hero.repository.SupplierOrCustomerMapper;
import com.hero.service.SupplierOrCustomerService;
@Service
public class SupplierOrCustomerServiceImpl implements SupplierOrCustomerService {
	@Autowired
	private SupplierOrCustomerMapper supplierOrCustomerMapper;

	@Override
	public List<SupplierOrCustomer> selectAllByCount(SupplierOrCustomerQuery scquery) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.selectAllByCount(scquery);
	}

	@Override
	public int selectCount(SupplierOrCustomerQuery scquery) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.selectCount(scquery);
	}

	@Override
	public int insertSelective(SupplierOrCustomer record) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(SupplierOrCustomer record) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updexit(Integer sId) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.updexit(sId);
	}

	@Override
	public int isExitByName(String name) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.isExitByName(name);
	}

	@Override
	public int updBatch(int cateid, List<Integer> sid) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.updBatch(cateid, sid);
	}

	@Override
	public List<SupplierOrCustomer> getSupplierOrCustomerBySid(List<Integer> sList) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.getSupplierOrCustomerBySid(sList);
	}

	@Override
	public List<Integer> getIdsByQuery(SupplierOrCustomerQuery scquery) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.getIdsByQuery(scquery);
	}

	@Override
	public int isExitByNameAndType(String name, Integer stype) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.isExitByNameAndType(name, stype);
	}

	@Override
	public int importSupplierOrCustomer(List<SupplierOrCustomer> scu) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.importSupplierOrCustomer(scu);
	}

	@Override
	public int delProCateBySid(Integer sid) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.delProCateBySid(sid);
	}

	@Override
	public int insertSupplierProCate(Integer sid, List<Integer> pcids) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.insertSupplierProCate(sid, pcids);
	}
	
	
}
