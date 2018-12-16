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
import com.hero.entity.ProductSpec;
import com.hero.entity.SupplierOrCustomer;
import com.hero.entity.query.ProductQuery;
import com.hero.service.ProductCategoryService;
import com.hero.service.ProductService;
import com.hero.service.ProductSpecService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private ProductCategoryService productCategoryService;
	@Autowired
	private ProductSpecService productSpecService;
	
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
	
	/**
	 * 修改商品信息，包括商品基本信息、商品的规格信息，商品的供应商
	 * @param product
	 * @param spec
	 * @param sid
	 * @param spid
	 * @return
	 */
	@RequestMapping(value="/updateProAndSpec")
	public Object updateProAndSpec(Product product,ProductSpec spec,Integer sid,Integer spid) {
		System.out.println("pro》》》》》"+product.toString());
		System.out.println("spec>>>>>"+spec.toString());
		System.out.println("供应商"+sid+"    供应商商品"+spid);
		Map<String, Object> map = new HashMap<String, Object>();
		if (spid==null) {//如果商品还没有供应商，先添加商品的供应商
			int sn=productService.insertProSupplier(sid, product.getpId());
		}else {
			int su=productService.updProSupplier(sid, spid);//修改商品供应商
		}
		if (spec.getPsId()==null) {//如果商品还没有规格，先添加商品的规格
			int specn=productSpecService.insertSelective(spec);
		} else {
			
			int specu=productSpecService.updateByPrimaryKeySelective(spec);//修改商品规格
		}
		int n=productService.updateByPrimaryKeySelective(product);//修改商品信息
		if (n>0) {
			map.put("success", true);
			map.put("message", "修改成功");
		} else {
			map.put("success", false);
			map.put("message", "修改失败");
		}
		
		return map;
	}
	
}
