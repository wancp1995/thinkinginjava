package com.example.demo;

import com.example.demo.bean.WebSiteProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WebSitePropertiesTest {

    @Autowired
    private WebSiteProperties webSiteProperties;

    @Test
    void getProperties() {
        System.out.println(webSiteProperties.getName());
        System.out.println(webSiteProperties.getWebsite());
        System.out.println(webSiteProperties.getLanguage());
    }

}
