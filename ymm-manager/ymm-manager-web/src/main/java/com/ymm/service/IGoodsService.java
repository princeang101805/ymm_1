package com.ymm.service;

import com.ymm.com.ymm.pojo.po.Goods;

import java.util.List;

public interface IGoodsService {
    List<Goods> listGoods(Goods goods);
    void removeById(Goods goods);
    void updateById(Goods goods);
}
