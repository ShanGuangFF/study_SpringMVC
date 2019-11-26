package com.xupt.ff.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cc_ff
 * @create 2019-11-25 下午6:46
 * @action
 */
@Controller
public class helloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("hello");
        return "success";
    }


}
