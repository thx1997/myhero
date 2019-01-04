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
	 * 根据单位类型查询单位(rfy)
	 * @return
	 */
	@RequestMapping("/queryUnitByStype")
	public Object queryUnitByStype(String sstype) {
		List<ProductUnit> list = productUnitService.queryUnitByType(sstype);
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
		int e=productUnitService.isExitByName(unit.getPuName());//判断单位名是否已存在
		if (e>0) {
			map.put("success", false);
			map.put("message", "该单位已存在");
		} else {
			int n=productUnitService.insertSelective(unit);
			if (n>0) {
				map.put("success", true);
				map.put("message", "添加成功");
			} else {
				map.put("success", false);
				map.put("message", "添加失败");
			}
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
		ProductUnit u=productUnitService.selectByPrimaryKey(unit.getPuId());
		int n=0;
		System.out.println(u.getPuName().equals(unit.getPuName()));
		if (u.getPuName().equals(unit.getPuName())) {//判断是否更改了名称
			n=productUnitService.updateByPrimaryKeySelective(unit);
			if (n>0) {
				map.put("success", true);
				map.put("message", "修改成功");
			} else {
				map.put("success", false);
				map.put("message", "修改失败");
			}
		} else {//若修改了名称，则判断名称是否存在
			int e=productUnitService.isExitByName(unit.getPuName());//判断单位名是否已存在
			if (e>0) {
				map.put("success", false);
				map.put("message", "该单位已存在");
			} else {
				n=productUnitService.updateByPrimaryKeySelective(unit);
				if (n>0) {
					map.put("success", true);
					map.put("message", "修改成功");
				} else {
					map.put("success", false);
					map.put("message", "修改失败");
				}
			}
		}
		
		return map;
	}
	
	/**
	 * 删除单位(rfy)
	 * @param puid
	 * @return
	 */
	@RequestMapping(value="/delete")
	@ResponseBody
	public Object deleteUnit(Integer puid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int n;
		try {
			n = productUnitService.deleteByPrimaryKey(puid);
			if (n>0) {
				map.put("success", true);
				map.put("message", "删除成功");
			} else {
				map.put("success", false);
				map.put("message", "删除失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("success", false);
			map.put("message", "删除失败，该单位已被引用");
		}
		
		return map;
	}
	
}
