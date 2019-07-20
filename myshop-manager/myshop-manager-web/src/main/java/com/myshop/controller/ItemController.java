package com.myshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myshop.pojo.TbItem;
import com.myshop.service.ItemService;

/**
 * 商品查询Controller
 * @author 27147
 *
 */
@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;
    
    @RequestMapping("/item/{itemId}")
    @ResponseBody
    private TbItem getItemById(@PathVariable Long itemId) {
        TbItem item = itemService.getItemById(itemId);
        return item;
    }

}


