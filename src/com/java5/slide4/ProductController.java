package com.java5.slide4;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@Transactional
@RequestMapping("/product")
public class ProductController {
@RequestMapping("list")
public String list(ModelMap modelMap) {
	List<Product> list= new ArrayList<>();
	list.add(new Product("ifone",9000.0,500.0));
	list.add(new Product("samsung",8000.0,50.0));
	modelMap.addAttribute("prods",list);
	return "student/index2";
	
}
}
