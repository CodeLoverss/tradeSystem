package com.example.trade.service;

import com.example.trade.provider.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public interface ItemService {
    ArrayList<Item> getItemList();

    ArrayList<Item> getItemListByCate(String category);
}
