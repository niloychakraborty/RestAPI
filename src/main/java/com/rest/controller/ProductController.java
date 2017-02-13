package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Product;
import com.rest.model.outbound.ProductOutBound;
import com.rest.services.ProductServiceImpl;

@RestController
@ComponentScan(basePackages = {"com.rest.services"})
public class ProductController {
	@Autowired
	private ProductServiceImpl  productService;
	
    @RequestMapping("/product/{id}")
	public ProductOutBound getProduct( @PathVariable String id){
		return productService.getProduct(id);
	}
    
    @RequestMapping(method=RequestMethod.PUT, value="/product")
	public void updateProduct( @RequestBody ProductOutBound product){
    	productService.updateProductCost(product);
	}
}
