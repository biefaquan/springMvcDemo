package com.bfq.mvc.service.impl;

import com.bfq.mvc.annotation.Service;
import com.bfq.mvc.service.service.ModifyService;
@Service
public class ModifyServiceImpl implements ModifyService {

	@Override
	public String add(String name, String addr) {
		return "invoke add name = " + name + " addr = " + addr;
	}

	@Override
	public String remove(Integer id) {
		return "remove id = " + id;
	}

}
