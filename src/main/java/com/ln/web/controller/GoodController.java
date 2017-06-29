package com.ln.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ln.web.db2.model.GoodTable;
import com.ln.web.service.GoodService;

@Controller
@RequestMapping(value="/good")
public class GoodController {
	
	@Resource
	private GoodService goodService;
	
	public Object getGoods(){
		List<GoodTable> goods=goodService.getGoods();
		return goods;
	}
	
	
}
