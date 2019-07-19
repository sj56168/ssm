package cn.jason.service.serviceImp;

import cn.jason.mapper.AudioMapper;
import cn.jason.pojo.Music;
import cn.jason.service.AudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 我不管我最帅 on 2018/12/23.
 */
@Service
public class AudioServiceImp implements AudioService {
    @Autowired
    AudioMapper audioMapper;
    @Override
    public List<Music> getMusics() {
        List<Music> list=audioMapper.getMusics();
        return list;
    }
}
