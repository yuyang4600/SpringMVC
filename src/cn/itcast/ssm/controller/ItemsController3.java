package cn.itcast.ssm.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Items;

//ʹ��Controller��ʶ ����һ��������
@Controller
public class ItemsController3 {
	
	//@RequestMappingʵ�� ��queryItems������url����ӳ�䣬һ��������Ӧһ��url
	//һ�㽨�齫url�ͷ���д��һ��
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception {
		
	List<Items> itemsList = new ArrayList<Items>();
	
	Items items_1 = new Items();
	items_1.setName("����ʼǱ�");
	items_1.setPrice(6000f);
	items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");
	
	Items items_2 = new Items();
	items_2.setName("ƻ���ֻ�");
	items_2.setPrice(5000f);
	items_2.setDetail("iphone6ƻ���ֻ���");
	
	itemsList.add(items_1);
	itemsList.add(items_2);
	
	ModelAndView modelAndView = new ModelAndView();
	
	//�൱��setAttribute
	modelAndView.addObject("itemsList", itemsList);
	modelAndView.setViewName("/WEB-INF/jsp/Items/itemsList.jsp");
	
	return modelAndView;
	} 
}
