/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: controllertest
 * Author:   1
 * Date:     2019/4/21 18:19
 * Description: controllertest
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.java.spring.controls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈controllertest〉
 *
 * @author 1
 * @create 2019/4/21
 * @since 1.0.0
 */
@Controller
@RequestMapping("/b")
public class controllertest {

     final static String  s="success2";
    @RequestMapping("testa")
    public String testa(){
        System.out.println("测试 requestMapping的修饰符范围！！！");
        return "success2";
    }

    @RequestMapping(value = "/tetsb",params = {"username","age!=10"})
    public String tetsb(@RequestParam(value="username") String name , @RequestParam(value = "age") Integer age){
        System.out.println("Sucess");
        System.out.println("name="+name+"  age="+age);
        return s;
    }

}
