package cn.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by 我不管我最帅 on 2018/11/14.
 */
@Controller
public class IndexController {
    @RequestMapping(value="/hello.html")
    public ModelAndView hello(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("message","helloworld");
        modelAndView.setViewName("index");
        return modelAndView;
    }
    //params  使用的名称 必须与方法参数名一致 且跟前台的参数name属性值保持一致
    @RequestMapping(value = "/login",method = {RequestMethod.POST},params = {"username","password"})
    public ModelAndView login(String username, String password){
        ModelAndView modelAndView=new ModelAndView();
        System.out.println("接收前台数据："+username+"---"+password);
        modelAndView.addObject("message",username);
        modelAndView.addObject("password",password);
        modelAndView.setViewName("success");
        return modelAndView;
    }
    @RequestMapping("/record.html")
    public String record(){
        return "/record";
    }
    @RequestMapping("/record2.html")
    public String record2(){
        return "/record2";
    }

    @RequestMapping("/showRecord.html")
    public String showRecord(){
        return "/WEB-INF/jsp/audio/showRecord.jsp";
    }
}
