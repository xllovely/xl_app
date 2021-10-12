package com.xiaoling;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * @className:XiaoLingApplication
 * @discription:
 * @author:小凌
 * @crateTime:2021-10-11 21:09
 */
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class})
public class XiaoLingApplication {
    public static void main(String[] args) {
        SpringApplication.run(XiaoLingApplication.class,args);
        System.out.println("小凌软件启动中......");
        System.out.println();
    }
}
