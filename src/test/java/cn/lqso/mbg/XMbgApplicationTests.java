package cn.lqso.mbg;

import cn.lqso.mbg.mapper.AlarmMapper;
import cn.lqso.mbg.model.Alarm;
import cn.lqso.mbg.model.AlarmExample;
import cn.lqso.mbg.service.AlarmService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class XMbgApplicationTests {

    @Resource
    private AlarmService alarmService;

    @Resource
    private AlarmMapper alarmMapper;

    @Test
    void testService() {
        AlarmExample example = new AlarmExample();
        example.setLimit(10);
        example.createCriteria().andUserNameEqualTo("admin");

        List<Alarm> alarms = alarmService.selectByExample(example);
        System.out.println(alarms.size());

        System.out.println(alarmService.count());
    }

    @Test
    void testMapper() {
        AlarmExample example = new AlarmExample();
        example.setLimit(15);
        example.createCriteria().andUserNameEqualTo("admin");
        List<Alarm> alarms = alarmMapper.selectByExample(example);
        System.out.println(alarms.size());

        example.setLimit(null);
        long count = alarmMapper.countByExample(example);
        System.out.println(count);
    }
}
