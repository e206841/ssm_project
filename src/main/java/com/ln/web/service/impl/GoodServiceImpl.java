package com.ln.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ln.web.db2.dao.GoodTableMapper;
import com.ln.web.db2.model.GoodTable;
import com.ln.web.service.GoodService;
@Service
public class GoodServiceImpl implements GoodService{
	@Resource
	private GoodTableMapper goodTableMapper;
	@Override
	public List<GoodTable> getGoods() {
		return goodTableMapper.getGoods();
	}

}
