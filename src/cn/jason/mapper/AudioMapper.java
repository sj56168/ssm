package cn.jason.mapper;

import cn.jason.pojo.Music;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 我不管我最帅 on 2018/12/23.
 */
@Repository
public interface AudioMapper {
    List<Music> getMusics();
}
