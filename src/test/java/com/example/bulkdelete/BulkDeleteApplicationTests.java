package com.example.bulkdelete;

import com.example.bulkdelete.entity.Demo;
import com.example.bulkdelete.entity.DemoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BulkDeleteApplicationTests {

    @Autowired
    private DemoRepository demoRepository;
    private Demo savedDemo;

    @Test
    public void deleteById() {
        createTestData();

        demoRepository.deleteById(savedDemo.getId());
        demoRepository.flush();
    }

    private void createTestData() {
        Demo demo = new Demo();
        demo.setName("abc");

        savedDemo = demoRepository.saveAndFlush(demo);
    }

}
