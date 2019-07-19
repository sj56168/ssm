package cn.jason.controller;

import cn.jason.pojo.Bill;
import cn.jason.service.BillServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by 我不管我最帅 on 2018/11/7.
 */
@Controller
public class BillController {
    @Autowired
    BillServices billServices;


public void execute(){
/*    List<Bill> billList= billServices.getProducts("",1,1);
    for(Bill bill:billList){
        System.out.println(bill);
    }
    billServices.deleteBill(19);*/

    List<Bill> billList = billServices.findProduct();
    for(Bill bill:billList){
        System.out.println(bill);
    }
}
@RequestMapping("/hello")
public ModelAndView hello(){
    System.out.println("执行了。。。。。。。。。。。。");
 ModelAndView modelAndView=new ModelAndView();
    List<Bill> billList = billServices.findProduct();
    modelAndView.addObject("message",billList);
 modelAndView.setViewName("WEB-INF/hello.jsp");
 return modelAndView;
}
}
