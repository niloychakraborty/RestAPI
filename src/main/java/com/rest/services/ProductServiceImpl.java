package com.rest.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rest.model.Cost;
import com.rest.model.Item;
import com.rest.model.Product;
import com.rest.model.Products;
import com.rest.model.outbound.CostOutBound;
import com.rest.model.outbound.ProductOutBound;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements restServiceInterface{
	Logger logger = Logger.getLogger(ProductServiceImpl.class.getName());
	@Autowired
	CostServiceImpl costService;
	public ProductOutBound getProduct(String id){
		
		Products products = null;
		ProductOutBound productOutBound = null;
		URL callBackURL = null;
		try {
			 callBackURL = new URL("http://redsky.target.com/v1/pdp/tcin/"+id+"?excludes=taxonomy,price,promotion,bulk_ship,rating_and_review_reviews,rating_and_review_statistics,question_answer_statistics");
			 ObjectMapper mapper = new ObjectMapper();
			 products = mapper.readValue(callBackURL, Products.class);
			 Cost cost = costService.getCost(id);
			 if(cost != null) {
				 CostOutBound costOutBound = new CostOutBound(cost.getCost(),cost.getCurrencyCode());
				 productOutBound = new ProductOutBound(Double.parseDouble(id),products.getProduct().getItem().getProductDescription().getTitle(),costOutBound);
			 }
			 
		} catch (MalformedURLException e) {
			logger.error(e.toString());
		}
		catch(IOException e) {
			logger.error(e.toString());
		}
		return productOutBound;
	}

	public void updateProductCost(ProductOutBound product) {
		Cost cost = costService.getCost(String.valueOf(product.getId()));
		if(cost != null) {
			cost.setCost(product.getCurrent_price().getCost());
			operations.save(cost);
		}
	}
}
