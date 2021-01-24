package com.example.trade.controller;

import com.example.trade.provider.Item;
import com.example.trade.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
public class IndexController {
    @Autowired
    ItemService itemService;

    //默认首页
    @RequestMapping("/")
    public String index(Model model, HttpServletRequest request){

        ArrayList<Item> itemList=itemService.getItemList();
        //System.out.println(itemList.get(0).toString());
        if(itemList!=null) {
            //request.getSession().setAttribute("itemList",itemList);
            model.addAttribute("itemList",itemList);
        }
        return "index";
    }

    @RequestMapping("/searchByCategory")
    public String searchByCategory(@RequestParam("category")String category,Model model){
        //System.out.println("ppppp"+category);
        category="%"+category+"%";
        ArrayList<Item> itemList=itemService.getItemListByCate(category);
        if(itemList!=null) {
            model.addAttribute("itemList",itemList);
        }
        return "index::items_fragment";
    }




}
