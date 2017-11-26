package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;

//使用Controller标识 它是一个控制器
@Controller
public class ItemsController3 {
	
	//@RequestMapping实现 对queryItems方法和url进行映射，一个方法对应一个url
	//一般建议将url和方法写成一样
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception {
		
	List<Items> itemsList = new ArrayList<Items>();
	
	Items items_1 = new Items();
	items_1.setName("联想笔记本");
	items_1.setPrice(6000f);
	items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
	
	Items items_2 = new Items();
	items_2.setName("苹果手机");
	items_2.setPrice(5000f);
	items_2.setDetail("iphone6苹果手机！");
	
	itemsList.add(items_1);
	itemsList.add(items_2);
	
	ModelAndView modelAndView = new ModelAndView();
	
	//相当于setAttribute
	modelAndView.addObject("itemsList", itemsList);
	modelAndView.setViewName("/WEB-INF/jsp/Items/itemsList.jsp");
	
	return modelAndView;
	} 
}
