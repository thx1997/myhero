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
	
	/**
	 * 设置商品的类别(rfy)
	 * @param product
	 * @return
	 */
	@RequestMapping(value="/updateProCate")
	public Object updateProCate(Product product) {
		Map<String, Object> map = new HashMap<String, Object>();
		int n=productService.updateByPrimaryKeySelective(product);
		if (n>0) {
			map.put("success", true);
			map.put("message", "修改成功");
		} else {
			map.put("success", false);
			map.put("message", "修改失败");
		}
		return map;
	}
	
	
	/**
	 * 添加商品信息
	 * @param product
	 * @param spec
	 * @param sid
	 * @return
	 */
	@RequestMapping(value="/insertProAndSpec")
	public Object insertProAndSpec(Product product,ProductSpec spec,Integer sid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int n=productService.insertSelective(product);//先添加商品信息
		if (n>0) {//添加成功时
			int pid=productService.selectNewPId();//查询刚添加的商品的id
			int sp=productService.insertProSupplier(sid, pid);//添加供货商商品表信息
			if (sp>0) {
				spec.setPsPId(pid);
				int spe=productSpecService.insertSelective(spec);//添加商品的规格信息
				if (spe>0) {
					map.put("success", true);
					map.put("message", "添加成功");
				} else {
					map.put("success", false);
					map.put("message", "添加失败");
				}
			} else {
				map.put("success", false);
				map.put("message", "添加失败");
			}
		} else {
			map.put("success", false);
			map.put("message", "添加失败");
		}
		return map;
	}
	
	/**
	 * 删除商品及规格信息(rfy)
	 * @param pid
	 * @param psid
	 * @param spid
	 * @return
	 */
	@RequestMapping(value="/deleteProAndSpec")
	public Object deleteProAndSpec(Integer pid,Integer psid,Integer spid) {
		Map<String, Object> map = new HashMap<String, Object>();
		int sp=productService.delProSupplier(spid);//先删除商品供应商
		if (sp>0) {
			int ps=productSpecService.deleteByPrimaryKey(psid);//再删除商品规格
			if (ps>0) {
				int p=productService.deleteByPrimaryKey(pid);//最后删除商品
				if (p>0) {
					map.put("success", true);
					map.put("message", "删除成功");
				} else {
					map.put("success", false);
					map.put("message", "删除失败");
				}
			} else {
				map.put("success", false);
				map.put("message", "删除失败");
			}
		} else {
			map.put("success", false);
			map.put("message", "删除失败");
		}
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
