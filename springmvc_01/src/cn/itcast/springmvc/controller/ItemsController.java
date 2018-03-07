package cn.itcast.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.pojo.Items;

@Controller 
public class ItemsController {
	
	@RequestMapping("/list.action")
	public ModelAndView list(){
		System.out.println("找到了111");
		List<Items> itemsList = new ArrayList<Items>();
		
		//商品列表
		Items items_1 = new Items();
		items_1.setName("联想笔记本");
		items_1.setPrice(6000f);
		items_1.setDetail("联想笔记本电脑！");
		
		Items items_2 = new Items();
		items_2.setName("苹果手机");
		items_2.setPrice(5000f);
		items_2.setDetail("iphone6苹果手机！");
		
		itemsList.add(items_1);
		itemsList.add(items_2);
		
		ModelAndView modelAndView = new ModelAndView();
		//相当于把数据放在request域中的
		modelAndView.addObject("itemList", itemsList);
		modelAndView.setViewName("itemList");
		return modelAndView;

	}
}
