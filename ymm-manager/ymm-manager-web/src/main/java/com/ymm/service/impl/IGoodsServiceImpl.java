package com.ymm.service.impl;

import com.ymm.com.ymm.pojo.po.Goods;
import com.ymm.dao.IGoodsMapper;
import com.ymm.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IGoodsServiceImpl implements IGoodsService {
    @Autowired
    IGoodsMapper iGoodsMapper;

    @Override
    public List<Goods> listGoods(Goods goods) {
        List<Goods> listGoods = iGoodsMapper.listGoods(goods);
        return listGoods;
    }

    @Override
    public void removeById(Goods goods) {
        iGoodsMapper.removeById(goods);
    }

    @Override
    public void updateById(Goods goods) {
        iGoodsMapper.updateById(goods);
    }
}
