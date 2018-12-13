package com.hero.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hero.entity.Product;
import com.hero.entity.ProductCategory;
import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.ProductQuery;
import com.hero.service.ProductCategoryService;
import com.hero.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductCategoryService productCategoryService;
	
	/**
	 * 多条件分页查询商品信息(rfy)
	 * @param pquery
	 * @return
	 */
	@RequestMapping(value="/queryProByQuery")
	public Object queryProByQuery(ProductQuery pquery,Integer spcid) {
		System.out.println("条件参数>>>>>>>"+pquery);
		Map<String, Object> map = new HashMap<String, Object>();
		String str="";
		ProductCategory cate=productCategoryService.selectByPrimaryKey(spcid);
		if(cate!=null&&cate.getPcParentid()==0) {//查询的是所有商品的信息
			pquery.setSpcid("");
		}else {
			List<Integer> iidlist=productCategoryService.getChildrenIdByPid(spcid);//查询其所有孩子的编号
			if (iidlist.size()>0) {
				List<String> sidlist = new ArrayList<String>();
				for (Integer id:iidlist) {
				   sidlist.add(id.toString());
				}
				sidlist.add(spcid.toString());
				str=String.join(",", sidlist);
				System.out.println("类型ids>>>>>>>>>>>"+str);
				pquery.setSpcid(str);
			} 
		}
		
		
		
		List<Product> list=productService.selectProByQuery(pquery);
		int total=productService.selectCountByQuery(pquery);
		map.put("total", total);
		map.put("rows",list);
		return map;
	}
	
	
}
