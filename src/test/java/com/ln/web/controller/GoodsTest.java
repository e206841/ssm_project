package com.ln.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.ln.web.db2.model.GoodTable;
import com.ln.web.model.User;
import com.ln.web.service.GoodService;
import com.ln.web.service.UserService;

public class GoodsTest extends TestBase{
	@Resource
	private GoodService goodService;
	@Test
	public void getGoodsTest(){
		List<GoodTable> goods = goodService.getGoods();
		for (GoodTable good : goods) {
			System.out.println(good.getGoodname());
			System.out.println(good.getGoodprice());
		}
	}
	
}
