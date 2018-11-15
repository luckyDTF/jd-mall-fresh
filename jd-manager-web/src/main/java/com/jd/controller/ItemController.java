package com.jd.controller;

import com.jd.pojo.TbItem;
import com.jd.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tengfei.dong
 * @date 2018/11/15 20:23
 */
@RestController()
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping(value = "/item/{id}")
    public TbItem getItemById(@PathVariable long id){
        return itemService.getItemById(id);
    }
}
