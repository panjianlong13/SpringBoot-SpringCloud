package io.ymq.example.mongodb;

import com.alibaba.fastjson.JSONObject;
import com.peter.springboot.mongodb.SpringBootMongodbApplication;
import com.peter.springboot.mongodb.dao.DemoDao;
import com.peter.springboot.mongodb.entity.DemoEntity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 描述: 单元测试
 *
 * @author: yanpenglei
 * @create: 2018/2/5 13:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootMongodbApplication.class)
public class SpringBootMongodbApplicationTests {

    @Autowired
    private DemoDao demoDao;

    @Test
    public void saveDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("Peter Share");
        demoEntity.setBy("Peter");
        demoEntity.setUrl("https://blog.csdn.net/panjianlongWUHAN");

        demoDao.saveDemo(demoEntity);

        demoEntity = new DemoEntity();
        demoEntity.setId(2L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("Peter Pan Share");
        demoEntity.setBy("Peter Pan");
        demoEntity.setUrl("https://blog.csdn.net/panjianlongWUHAN");

        demoDao.saveDemo(demoEntity);
    }

    @Test
    public void removeDemoTest() {
        demoDao.removeDemo(1L);
    }

    @Test
    public void updateDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB 更新数据");
        demoEntity.setDescription("更新MongoDB");
        demoEntity.setBy("Peter Pan");
        demoEntity.setUrl("https://github.com/panjianlong13/SpringBoot-SpringCloud");

        demoDao.updateDemo(demoEntity);
    }

    @Test
    public void findDemoByIdTest() {

        DemoEntity demoEntity = demoDao.findDemoById(1L);

        System.out.println(JSONObject.toJSONString(demoEntity));
    }

}
