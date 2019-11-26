package com.xupt.ff.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author cc_ff
 * @create 2019-11-26 下午4:17
 * @action
 */
@Controller
@RequestMapping("/param")
public class paramController {

    @RequestMapping("/date")
    public void StringToDate(@RequestBody String body,Date date){
        System.out.println(date);
        System.out.println(body);
    }
}
