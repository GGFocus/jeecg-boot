package org.jeecg;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 系统用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,classes = JeecgSystemApplication.class)
public class MqTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 测试用例：查询记录
     */
    @Test
    public void testMq() {
        for (int i = 0; i < 100; i++) {
            rabbitTemplate.convertAndSend("ggf-exchange", "ggf-queue", "message:" + i);
        }
    }
}
