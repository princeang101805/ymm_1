package com.ymm.web;

import com.ymm.com.ymm.pojo.po.Goods;
import com.ymm.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class GoodsAction {
    @Autowired
    IGoodsService iGoodsService;
    @RequestMapping(value = "/showGoods.do")
    public String showGoods(Goods goods, Model model){
        List<Goods> listGoods = iGoodsService.listGoods(goods);
        model.addAttribute("listGoods",listGoods);
        return "showGoods";
    }
    @RequestMapping(value = "/removeById")
    public String removeById(Goods goods){
        return "redirect:/showGoods.do";
    }
    @RequestMapping(value = "/updateById")
    public String updateById(Goods goods){
        return "redirect:/showGoods.do";
    }
}
