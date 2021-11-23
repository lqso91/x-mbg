package cn.lqso.mbg;

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

    @Test
    void test() {
        AlarmExample example = new AlarmExample();
        example.createCriteria().andUserNameEqualTo("luojie");

        List<Alarm> alarms = alarmService.selectByExample(example);
        System.out.println(alarms.size());

        System.out.println(alarmService.count());
    }
}
