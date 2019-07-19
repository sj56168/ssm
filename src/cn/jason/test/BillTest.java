package cn.jason.test;

import cn.jason.controller.BillController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 我不管我最帅 on 2018/11/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:applicationContext.xml")
public class BillTest {
  /*  @Autowired
    BillController billController;*/
    @Test
    public void getProc(){
    // billController.execute();

    }
}
