package com.girl.controller;

import com.girl.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by John on 2017/6/1.
 */
@RestController
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${content}")
    private String content;

    @Autowired
    private GirlProperties girlProperties;

  //  @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping(value = "/hello")
    public String say(){
        return girlProperties.getCupSize();
    }
}
