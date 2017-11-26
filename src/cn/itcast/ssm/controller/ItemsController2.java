package cn.itcast.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import cn.itcast.ssm.po.Items;

public class ItemsController2 implements HttpRequestHandler {

	@Override
	public void handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
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
		
		arg0.setAttribute("itemsList", itemsList);
		arg0.getRequestDispatcher("/WEB-INF/jsp/Items/itemsList.jsp").forward(arg0, arg1);
	}


//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		List<Items> itemsList = new ArrayList<Items>();
//		
//		Items items_1 = new Items();
//		items_1.setName("����ʼǱ�");
//		items_1.setPrice(6000f);
//		items_1.setDetail("ThinkPad T430 ����ʼǱ����ԣ�");
//		
//		Items items_2 = new Items();
//		items_2.setName("ƻ���ֻ�");
//		items_2.setPrice(5000f);
//		items_2.setDetail("iphone6ƻ���ֻ���");
//		
//		itemsList.add(items_1);
//		itemsList.add(items_2);
//		
//		ModelAndView modelAndView = new ModelAndView();
//		
//		//�൱��setAttribute
//		modelAndView.addObject("itemsList", itemsList);
//		modelAndView.setViewName("/WEB-INF/jsp/Items/itemsList.jsp");
//		
//		return modelAndView;
//	}

}
