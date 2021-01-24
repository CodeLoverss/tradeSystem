package com.example.trade.mapper;

import com.example.trade.provider.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface ItemMapper {

    @Select("select * from item_info")
    ArrayList<Item> getItemList();

    @Select("select * from item_info where category like #{category} or itemName like #{category}")
    ArrayList<Item> getItemListByCate(String category);

}
