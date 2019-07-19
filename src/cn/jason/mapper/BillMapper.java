package cn.jason.mapper;

import cn.jason.pojo.Bill;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 我不管我最帅 on 2018/11/7.
 */
@Repository
public interface BillMapper {
    //查询商品
    List<Bill> getProducts(@Param("productName") String productName, @Param("providerId") Integer providerId, @Param("isPayment") int isPayment);
    //删除订单
    void deleteBill(Integer id);
    List<Bill> findProduct();
}
