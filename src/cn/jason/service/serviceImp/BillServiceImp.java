package cn.jason.service.serviceImp;

import cn.jason.mapper.BillMapper;
import cn.jason.pojo.Bill;
import cn.jason.service.BillServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 我不管我最帅 on 2018/11/7.
 */
@Service
@Transactional  //注解版 此处不再进行创建SqlSession和提交事务 事务交由spring管理
public class BillServiceImp  implements BillServices {
    @Autowired
    BillMapper billMapper;
    @Override
    @Transactional(propagation= Propagation.NEVER,rollbackForClassName = {"RuntimeException"}, noRollbackForClassName = {"SecurityException","IOException"})
    public List<Bill> getProducts(String productName, Integer providerId, int isPayment) {
    List<Bill> billList=billMapper.getProducts(productName,providerId,isPayment);
    return billList;
    }

    @Override
    public void deleteBill(Integer id) {
        billMapper.deleteBill(id);
    }

    @Override
    public List<Bill> findProduct() {
       return billMapper.findProduct();
    }

}
