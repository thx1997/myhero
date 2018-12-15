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

	@Override//(rfy)
	public List<SupplierOrCustomer> selectAllByCount(SupplierOrCustomerQuery scquery) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.selectAllByCount(scquery);
	}

	@Override//(rfy)
	public int selectCount(SupplierOrCustomerQuery scquery) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.selectCount(scquery);
	}

	@Override//(rfy)
	public int insertSelective(SupplierOrCustomer record) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.insertSelective(record);
	}

	@Override//(rfy)
	public int updateByPrimaryKeySelective(SupplierOrCustomer record) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.updateByPrimaryKeySelective(record);
	}

	@Override//(rfy)
	public int updexit(Integer sId) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.updexit(sId);
	}

	@Override//(rfy)
	public int isExitByName(String name) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.isExitByName(name);
	}

	@Override//(rfy)
	public int updBatch(int cateid, List<Integer> sid) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.updBatch(cateid, sid);
	}

	@Override//(rfy)
	public List<SupplierOrCustomer> getSupplierOrCustomerBySid(List<Integer> sList) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.getSupplierOrCustomerBySid(sList);
	}

	@Override//(rfy)
	public List<Integer> getIdsByQuery(SupplierOrCustomerQuery scquery) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.getIdsByQuery(scquery);
	}

	@Override//(rfy)
	public int isExitByNameAndType(String name, Integer stype) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.isExitByNameAndType(name, stype);
	}

	@Override//(rfy)
	public int importSupplierOrCustomer(List<SupplierOrCustomer> scu) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.importSupplierOrCustomer(scu);
	}

	@Override//(rfy)
	public int delProCateBySid(Integer sid) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.delProCateBySid(sid);
	}

	@Override//(rfy)
	public int insertSupplierProCate(Integer sid, List<Integer> pcids) {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.insertSupplierProCate(sid, pcids);
	}

	@Override//(rfy)
	public List<SupplierOrCustomer> getAllSupplier() {
		// TODO Auto-generated method stub
		return supplierOrCustomerMapper.getAllSupplier();
	}
	
	
}
