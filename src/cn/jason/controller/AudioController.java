package cn.jason.controller;

import cn.jason.pojo.Music;
import cn.jason.service.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.List;


/**
 * Created by 我不管我最帅 on 2018/12/23.
 */
@Controller
@RequestMapping(value = "/audio")
public class AudioController {
    @Autowired
    AudioService audioService;

    @RequestMapping("/getMusic")
    @ResponseBody
    public List  getMusics(){
        System.out.println("aaaaaaaaaaaaaaa");
        List<Music> list=audioService.getMusics();
        System.out.println(list);
        Iterator<Music> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getPath());
        }
        return list;
    }
}
