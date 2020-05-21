package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	
	@GetMapping(value="/getproduct" ,consumes= MediaType.TEXT_HTML_VALUE)
	public Product getproduct() {
	return new Product("stivale","nike",999.99f);	
	}
	
	@PostMapping("/addproduct")
	public void addproduct(@RequestBody Product product) {
	System.out.println(product);	
	}
	
	
	
	
	@GetMapping("/getproducts")
	public List<Product> getproducts() {
	List<Product> listProducts=new ArrayList<Product>();	
	listProducts.add(new Product("scarpa","reebok",19.99f));
	listProducts.add(new Product("scarpa","adidas",19.99f));
	listProducts.add(new Product("stivale","lotto",19.99f));
	return listProducts;	
	}
	
	
}
