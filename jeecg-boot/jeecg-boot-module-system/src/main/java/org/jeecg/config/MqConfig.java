package org.jeecg.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMq配置文件
 */
@Slf4j
@Configuration
public class MqConfig {

    /**
     * 创建exchange
     *
     * @return
     */
    @Bean
    public TopicExchange getTopicExchange() {
        return new TopicExchange("ggf-exchange", true, false);
    }

    /**
     * 创建队列
     *
     * @return
     */
    @Bean
    public Queue getQueue() {
        return new Queue("ggf-queue");
    }

    /**
     * 绑定在一起
     *
     * @param topicExchange
     * @param queue
     * @return
     */
    @Bean
    public Binding getBinding(TopicExchange topicExchange, Queue queue) {
        return BindingBuilder.bind(queue).to(topicExchange).with(queue.getName());
    }

}
