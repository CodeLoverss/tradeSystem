package com.example.trade.config;

import com.example.trade.provider.Item;
import com.example.trade.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyInterceptor implements HandlerInterceptor {
    @Autowired
    ItemService itemService;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
 //       ArrayList itemList=new ArrayList();
//        Item item=new Item();
//        item.setId(1);
//        item.setCategory("phone");
//        item.setDescription("iphone is pretty nice");
//        item.setItemName("iphone12 128GB black");
//        item.setPrice((float) 9999.9);
//        itemList.add(item);

//        ArrayList<Item> itemList=itemService.getItemList();
//        System.out.println(itemList.get(0).toString());
//        if(itemList!=null)request.getSession().setAttribute("itemList",itemList);
//            System.out.println("预处理");

            return true;

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        //System.out.println("处理完毕");

    }

}
