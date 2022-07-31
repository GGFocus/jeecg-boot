package org.jeecg.modules.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class MybatisTestRO {

    /**
     * 年纪
     */
    public Integer age;

    /**
     * 姓名
     */
    public String name;

    /**
     * 金额
     */
    public BigDecimal num;
}
