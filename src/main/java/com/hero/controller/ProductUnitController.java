package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.Product;
import com.hero.entity.ProductUnit;
import com.hero.entity.query.ProductQuery;
import com.hero.service.ProductUnitService;

@RestController
@RequestMapping("/productUnitController")
public class ProductUnitController {
	@Autowired
	private ProductUnitService productUnitService;
	
	/**
	 * 查询所有单位(rfy)
	 * @return
	 */
	@RequestMapping("/queryAllUnit")
	public Object queryAllUnit() {
		List<ProductUnit> list = productUnitService.queryAllUnit();
		return list;
	}
	
	/**
	 * 多条件分页查询(rfy)
	 * @param unit
	 * @return
	 */
	@RequestMapping(value="/queryAllPage")
	public Object queryAllPage(ProductUnit unit) {
		System.out.println("条件参数>>>>>>>"+unit);
		Map<String, Object> map = new HashMap<String, Object>();
		List<ProductUnit> list=productUnitService.queryByNamePage(unit);
		int total=productUnitService.queryCountByName(unit);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
	/**
	 * 添加单位
	 * @param unit
	 * @return
	 */
	@RequestMapping(value="/insert")
	@ResponseBody
	public Object insertUnit(ProductUnit unit) {
		Map<String, Object> map = new HashMap<String, Object>();
		int n=productUnitService.insertSelective(unit);
		if (n>0) {
			map.put("success", true);
			map.put("message", "添加成功");
		} else {
			map.put("success", false);
			map.put("message", "添加失败");
		}
		return map;
	}
	/**
	 * 修改单位
	 * @param unit
	 * @return
	 */
	@RequestMapping(value="/update")
	@ResponseBody
	public Object updateUnit(ProductUnit unit) {
		Map<String, Object> map = new HashMap<String, Object>();
		int n=productUnitService.updateByPrimaryKeySelective(unit);
		if (n>0) {
			map.put("success", true);
			map.put("message", "修改成功");
		} else {
			map.put("success", false);
			map.put("message", "修改失败");
		}
		return map;
	}
	@RequestMapping(value="/delete")
	@ResponseBody
	public Object deleteUnit(Integer puid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int n=productUnitService.deleteByPrimaryKey(puid);
		if (n>0) {
			map.put("success", true);
			map.put("message", "删除成功");
		} else {
			map.put("success", false);
			map.put("message", "删除失败");
		}
		return map;
	}
	
}
