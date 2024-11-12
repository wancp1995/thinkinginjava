package com.example.demo;

import com.example.demo.bean.ConfigRandomValue;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConfigRandomValueTest {

    @Autowired
    private ConfigRandomValue configRandomValue;

    @Test
    void getRandom()
    {
        System.out.println(configRandomValue.getSecret());
        System.out.println(configRandomValue.getUuid());
        System.out.println(configRandomValue.getBigNumber());
        System.out.println(configRandomValue.getNumber());
        System.out.println(configRandomValue.getNumber2());
        System.out.println(configRandomValue.getNumber3());
    }

}
