package com.liusir;

import com.liusir.mcms.McmsApplication;
import javafx.application.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by Administrator on 2018-11-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = McmsApplication.class)
//@ActiveProfiles("test")
@WebAppConfiguration
public abstract class AbstractSpringTest {
}
