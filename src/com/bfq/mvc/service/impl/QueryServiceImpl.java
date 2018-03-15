package com.bfq.mvc.service.impl;

import com.bfq.mvc.annotation.Service;
import com.bfq.mvc.service.service.QueryService;
@Service("myQueryService")
public class QueryServiceImpl implements QueryService {
	@Override
	 public String search(String name) {  
	        return "invoke search name = " + name;  
	    }  
}
