package com.ml.springcloud;

import com.sdkserver.log.Log_StartSDKApp;
import com.sdkserver.log.Service.IMessageProvider;
import com.sdkserver.log.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Log_StartSDKApp.class)
@WebAppConfiguration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class AppTest {

    @Resource
    private IMessageProvider messageProvider;

    @Test
    public void testSend() {
        User user = new User();
        user.setId(222);
        user.setName("zwjwd");
        user.setNumber("sss");
        this.messageProvider.send(user);
    }
}
