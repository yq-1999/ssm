package cn.itcast.test;

import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 钦
 * @create 2019-08-18 6:19
 */
public class TestSpring {

    @Test
    public void test1(){
        // 加载配置文件
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 加载配置文件
        AccountService accountService = (AccountService) applicationContext.getBean("accountService");
        // 调用方法
        accountService.findAll();
    }

}
