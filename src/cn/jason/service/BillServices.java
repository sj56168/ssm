package cn.jason.service;

import cn.jason.pojo.Bill;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 我不管我最帅 on 2018/11/7.
 */
@Service
public interface BillServices {
    //查询商品
    List<Bill> getProducts(String productName, Integer providerId, int isPayment);
    //删除订单
    void deleteBill(Integer id);
    //查询
    List<Bill> findProduct();

}
