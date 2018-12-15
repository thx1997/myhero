package com.hero.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hero.entity.ProductCategory;
import com.hero.entity.ProductCommodity;
import com.hero.entity.query.ProductCommodityQuery;
import com.hero.service.ProductCategoryService;
import com.hero.service.ProductCommodityService;

@RestController
@RequestMapping("/productCommodity")
public class ProductCommodityController {
	@Autowired
	private ProductCommodityService productCommodityService;
	@Autowired
	private ProductCategoryService productCategoryService;
	
	
	/**
	 * 多条件分页查询商品属性(rfy)
	 * @param pquery
	 * @return
	 */
	@RequestMapping(value="/queryAllByQuery")
	public Object queryAllByQuery(ProductCommodityQuery pcquery,Integer pcid) {
		System.out.println("初次条件参数>>>>>>>"+pcquery);
		Map<String, Object> map = new HashMap<String, Object>();
		String str="";
		ProductCategory cate=productCategoryService.selectByPrimaryKey(pcid);
		if(cate!=null&&cate.getPcParentid()==0) {//查询所有商品的信息
			pcquery.setPcid("");
		}else {
			List<Integer> iidlist=productCategoryService.getChildrenIdByPid(pcid);//查询其所有孩子的编号
			if (iidlist.size()>0) {
				List<String> sidlist = new ArrayList<String>();
				for (Integer id:iidlist) {
				   sidlist.add(id.toString());
				}
				sidlist.add(pcid.toString());
				str=String.join(",", sidlist);
				System.out.println("类型ids>>>>>>>>>>>"+str);
				pcquery.setPcid(str);
			} 
		}
		
		System.out.println("放入sql里的条件参数>>>>>>>"+pcquery);
		
		List<ProductCommodity> list=productCommodityService.queryAllByQuery(pcquery);
		int total=productCommodityService.queryCountByQuery(pcquery);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
	
	
	
}
