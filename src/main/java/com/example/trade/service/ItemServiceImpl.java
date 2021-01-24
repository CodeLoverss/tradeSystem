package com.example.trade.service;

import com.example.trade.mapper.ItemMapper;
import com.example.trade.provider.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class ItemServiceImpl implements ItemService{

    @Resource
    ItemMapper itemMapper;
    @Override
    public ArrayList<Item> getItemList() {
        System.out.println("pppp");
        return itemMapper.getItemList();
    }

    @Override
    public ArrayList<Item> getItemListByCate(String category) {
        System.out.println(category);
        return itemMapper.getItemListByCate(category);
    }
}
