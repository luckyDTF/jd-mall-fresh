package com.jd.serviceImpl;

import com.jd.pojo.TbItem;
import com.jd.service.ItemService;
import com.jd.mapper.TbItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author tengfei.dong
 * @date 2018/11/15 20:21
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long id) {
        return itemMapper.selectByPrimaryKey(id);
    }
}
