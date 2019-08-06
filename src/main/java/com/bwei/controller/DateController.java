package com.bwei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.Service;
import java.util.ArrayList;
import java.util.List;


@Controller
public class DateController {

    @RequestMapping("list")
    public String getDate(Model model){
        List<String> list = new ArrayList<String>();
        list.add("张三1");
        list.add("张三2");
        list.add("张三3");
        list.add("张三4");
        list.add("张三5");
        model.addAttribute("name","张三");
        model.addAttribute("list",list);
        return "Test1";
    }




}
