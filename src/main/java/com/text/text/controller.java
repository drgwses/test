package com.text.text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {
    @Autowired
    private Pojo pojo;
    @RequestMapping("/test2222")
    @ResponseBody
    public Pojo text(){
        System.out.println(123456789);
        pojo.setUsername("123");
        pojo.setPassword("123");
        return pojo;
    }
}
