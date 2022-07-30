package org.jeecg.listen;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author gaoguofeng
 */
@Component
public class Consumer {

    @RabbitListener(queues = "ggf-queue")
    public void getMessage1(Object message) {
        System.out.println("接收的消息1：" + message);
    }

    @RabbitListener(queues = "ggf-queue")
    public void getMessage2(Object message) {
        System.out.println("接收的消息2：" + message);
    }

}
