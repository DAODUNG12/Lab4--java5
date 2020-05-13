package com.java5.slide4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.java5.slide4.*;

@Controller
public class StudentController {
	@Autowired
	ServletContext application;

	@RequestMapping("/index")
	public String index(HttpServletRequest request, HttpSession session) {
		application.setAttribute("name1", "Đào Văn Dũng");
		application.setAttribute("level1", 2);
		session.setAttribute("name2", "Đào Cả Gốc");
		session.setAttribute("level2", 3);
		request.setAttribute("name3", "Chặt Cả Ngọn");
		request.setAttribute("level3", 4);
		session.setAttribute("salary", 1000);
		request.setAttribute("photo", "images/ok.jpg");
		return "student/index";
	}
/*
	@RequestMapping("/index2")
	public String index2(ModelMap modelMap, Student student) {
		Student sv1 = new Student("Đào Văn Dũng", 5.0, "AA");
		Student sv2 = new Student("Đào Cả Gốc", 6.0, "BB");
		Student sv3 = new Student("Chặt Cả Ngọn", 7.0, "XX");
		List<Student> list = new ArrayList<>();
		list.add(sv2);
		list.add(sv3);
		Map<String, Student> map = new HashMap<>();
		map.put("Goccd", sv2);
		map.put("Ngoncc", sv3);
		modelMap.addAttribute("bean", sv1);
		modelMap.addAttribute("list", list);
		modelMap.addAttribute("map", map);
		return "student/index2";
	}
	*/
}
