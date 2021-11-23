package cn.lqso.mbg.service;

import cn.lqso.mbg.mapper.AlarmMapper;
import cn.lqso.mbg.model.Alarm;
import cn.lqso.mbg.model.AlarmExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * AlarmService
 *
 * @author luojie
 * @since 2021/11/23
 */
@Service
public class AlarmService {

    @Resource
    private AlarmMapper alarmMapper;

    public List<Alarm> selectByExample(AlarmExample example){
        return alarmMapper.selectByExample(example);
    }

    /**
     * 在生成的mapper中添加一个查询
     */
    public int count(){
        return alarmMapper.count();
    }
}
