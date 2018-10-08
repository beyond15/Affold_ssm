package com.scaffold.ssm.dao;

import com.scaffold.ssm.entity.Boy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by xiaohu.zheng on 2018/9/29.
 */
public class BoyMapperTest {
    private ApplicationContext applicationContext;

    @Autowired
    private BoyMapper mapper;

    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(BoyMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        System.out.println("kaishi11111111111111111111111111");
        Boy boy = new Boy();
//        boy.setId(1);
        boy.setAge(18);
        boy.setBoyName("小虎");
        int result = mapper.insert(boy);
        System.out.println(result);
        assert (result ==  1);
    }

}