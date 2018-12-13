package com.hero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.Module;
import com.hero.entity.ProductCategory;
import com.hero.service.ProductCategoryService;

@RestController
@RequestMapping("/productcategory")
public class ProductCategoryController {
	@Autowired
	private ProductCategoryService productCategoryService;
	
	
	/**
	 * 树形显示所有商品类别信息(rfy)
	 * @return
	 */
	@RequestMapping("/queryAllProCate")
	public Object queryAllProCate(){
		List<ProductCategory> list=productCategoryService.queryAllProCate();
		return list;
	}
	
	/**
	 * 添加商品类别(rfy)
	 * @param cate
	 * @param request
	 * @return 
	 */
	@RequestMapping(value="/insert")
	@ResponseBody
	public Object insertProCate(ProductCategory cate){
		Map<String, Object> map = new HashMap<String, Object>();
		int e=productCategoryService.isExitByPcnameAndPid(cate.getPcName(),cate.getPcParentid());
		System.out.println("是否存在"+e);
		if (e>0) {//判断同一父模块下新添加的模块是否存在
			map.put("success", false);
			map.put("message", "该类别已存在");
		} else {
			int n=productCategoryService.insertSelective(cate);
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
	 * 修改商品类别信息，同一个父节点下节点名称不能相同(rfy)
	 * @param cate
	 * @param 
	 * @return
	 */
	@RequestMapping(value="/update")
	@ResponseBody
	public Object updateProCateById(ProductCategory cate){
		Map<String, Object> map = new HashMap<String, Object>();
		ProductCategory c=productCategoryService.selectByPrimaryKey(cate.getPcId());
		int n=0;
		if (c.getPcName()==cate.getPcName()) {//先判断用户在页面是否修改了名称，若修改名称则需判断修改后的名称在同一父模块下是否存在
			n=productCategoryService.updateByPrimaryKeySelective(cate);
			if (n>0) {
				map.put("success", true);
				map.put("message", "修改成功");
			} else {
				map.put("success", false);
				map.put("message", "修改失败");
			}
		} else {//若修改名称则需判断修改后的名称在同一父模块下是否存在
			int e=productCategoryService.isExitByPcnameAndPid(cate.getPcName(), cate.getPcParentid());
			System.out.println("是否存在"+e);
			if (e>0) {
				map.put("success", false);
				map.put("message", "该节点已存在，请修改节点名称");
			} else {
				n=productCategoryService.updateByPrimaryKeySelective(cate);
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
	 * 删除商品类别信息，存在商品关联则不能删除成功
	 * @param pcid
	 * @return
	 */
	@RequestMapping(value="/delete")
	public Object deleteProCateById(int pcid){
		Map<String, Object> map = new HashMap<String, Object>();	
		
			int n=productCategoryService.delProCate(pcid);
			if (n>0) {
				map.put("success", true);
				map.put("message", "删除成功");
			} else {
				map.put("success", false);
				map.put("message", "暂不能删除,该类别存在商品关联");
			}	
		return map;
	}
	
	
	
}
