package com.bfq.mvc.comtroller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bfq.mvc.annotation.Autowired;
import com.bfq.mvc.annotation.Controller;
import com.bfq.mvc.annotation.RequestMapping;
import com.bfq.mvc.annotation.RequestParam;
import com.bfq.mvc.service.service.ModifyService;
import com.bfq.mvc.service.service.QueryService;

@Controller
@RequestMapping("/web")
public class WebController {
	@Autowired("myQueryService")  
    private QueryService queryService;  
    @Autowired  
    private ModifyService modifyService; 
    
    @RequestMapping("/search")  
    public void search(@RequestParam("name") String name, HttpServletRequest request, HttpServletResponse response) {  
        String result = queryService.search(name);  
        out(response, result);  
    }  
  
    @RequestMapping("/add")  
    public void add(@RequestParam("name") String name,  
                    @RequestParam("addr") String addr,  
                    HttpServletRequest request, HttpServletResponse response) {  
        String result = modifyService.add(name, addr);  
        out(response, result);  
    }  
  
    @RequestMapping("/remove")  
    public void remove(@RequestParam("name") Integer id,  
                       HttpServletRequest request, HttpServletResponse response) {  
        String result = modifyService.remove(id);  
        out(response, result);  
    }  
  
    private void out(HttpServletResponse response, String str) {  
        try {  
            response.setContentType("application/json;charset=utf-8");  
            response.getWriter().print(str);  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    } 
}
