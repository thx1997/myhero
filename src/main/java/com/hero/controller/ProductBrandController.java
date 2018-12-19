package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.ProductBrand;
import com.hero.entity.ProductUnit;
import com.hero.service.ProductBrandService;

@RestController
@RequestMapping("/productbrand")
public class ProductBrandController {

	@Autowired
	private ProductBrandService productBrandService;
	/**
	 * 查询所有品牌(rfy)
	 * @return
	 */
	@RequestMapping(value="/queryAll")
	public Object queryAll() {
		List<ProductBrand> list=productBrandService.queryAll();
		return list;
	}
	/**
	 * 多条件分页查询(rfy)
	 * @param brand
	 * @return
	 */
	@RequestMapping(value="/queryAllPage")
	public Object queryAllPage(ProductBrand brand) {
		System.out.println("条件参数>>>>>>>"+brand);
		Map<String, Object> map = new HashMap<String, Object>();
		List<ProductBrand> list=productBrandService.queryALLPage(brand);
		int total=productBrandService.queryCountPage(brand);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
	
	
	/**
	 * 添加品牌(rfy)
	 * @param brand
	 * @return
	 */
	@RequestMapping(value="/insert")
	@ResponseBody
	public Object insertBrand(ProductBrand brand) {
		Map<String, Object> map = new HashMap<String, Object>();
		int e=productBrandService.isExitByName(brand.getPbName());//判断品牌是否存在
		if (e>0) {
			map.put("success", false);
			map.put("message", "品牌已存在");
		} else {
			int n=productBrandService.insertSelective(brand);
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
	 * 修改品牌(rfy)
	 * @param brand
	 * @return
	 */
	@RequestMapping(value="/update")
	@ResponseBody
	public Object updateBrand(ProductBrand brand) {
		Map<String, Object> map = new HashMap<String, Object>();
		ProductBrand b=productBrandService.selectByPrimaryKey(brand.getPbId());
		int n=0;
		System.out.println(b.getPbName().equals(brand.getPbName()));
		if (b.getPbName().equals(brand.getPbName())) {//判断是否修改了名称，若没修改 ，则直接执行update
			n=productBrandService.updateByPrimaryKeySelective(brand);
			if (n>0) {
				map.put("success", true);
				map.put("message", "修改成功");
			} else {
				map.put("success", false);
				map.put("message", "修改失败");
			}
		} else {//若修改了名称，则需判断是否已存在
			int e=productBrandService.isExitByName(brand.getPbName());
			if (e>0) {
				map.put("success", false);
				map.put("message", "品牌已存在");
			} else {
				n=productBrandService.updateByPrimaryKeySelective(brand);
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
	 * 删除品牌(rfy)
	 * @param pbid
	 * @return
	 */
	@RequestMapping(value="/delete")
	@ResponseBody
	public Object deleteBrand(Integer pbid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int n;
		try {
			n = productBrandService.deleteByPrimaryKey(pbid);
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
			map.put("message", "删除失败，该品牌已被引用");
		}
		
		return map;
	}
	
	
	
	
}
