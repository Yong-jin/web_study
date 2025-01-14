package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.dto.DrinkItem;

@Controller
public class JstlController {

	@GetMapping("/jstl1")
	public String jstl1(Model model) {
		
		model.addAttribute("msg", "이것은 메시지다");
		
		DrinkItem d1 = new DrinkItem();
		d1.setItem("아메리카노");
		d1.setType("커피");
		
		model.addAttribute("d1", d1);
		
		List<DrinkItem> drinkList = new ArrayList<DrinkItem>();
		drinkList.add(new DrinkItem("카페라떼", "커피"));
		drinkList.add(new DrinkItem("카페모카", "커피"));
		drinkList.add(new DrinkItem("카푸치노", "커피"));
		drinkList.add(new DrinkItem("아이스티", "차"));
		drinkList.add(new DrinkItem("레몬티", "차"));
		drinkList.add(new DrinkItem("얼그레이티", "차"));
		
		model.addAttribute("drinkList", drinkList);
		model.addAttribute("listSize", drinkList.size());
		
		//  ${listSize}
		
		// userType : "user" "admin"
		model.addAttribute("userType", "admin");  
		
		model.addAttribute("isLogin", true);	//true O  false X
		
		return "jstl/jstl1";
	}
	
	@GetMapping("/jstl2")
	public String jstl2(Model model) {
		
		//  안녕하세요~?
		//  안녕하세요~? (*빨간글자)
		//  <span class='fontred'>안녕하세요~?</span>
		
		model.addAttribute("msg1", "<부등호>");
		model.addAttribute("msg2", "&lt;부등호&gt;");
		
		
		model.addAttribute("msgXml", "<script>alert('경고')</script>");
		
		return "jstl/jstl2";
	}
	
}

