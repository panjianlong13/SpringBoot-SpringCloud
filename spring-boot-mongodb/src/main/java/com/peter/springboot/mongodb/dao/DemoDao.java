package com.peter.springboot.mongodb.dao;

import com.peter.springboot.mongodb.entity.DemoEntity;

/**
 * 描述: 提供增删改查 MongoDB 接口
 *
 * @author Peter Pan
 * @create 2018-02-03 16:56
 **/
public interface DemoDao {

    void saveDemo(DemoEntity demoEntity);

    void removeDemo(Long id);

    void updateDemo(DemoEntity demoEntity);

    DemoEntity findDemoById(Long id);
}
