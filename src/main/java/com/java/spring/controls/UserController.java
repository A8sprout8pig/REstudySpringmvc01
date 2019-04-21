/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserController
 * Author:   1
 * Date:     2019/4/21 12:32
 * Description: UserController
 * History:
 * <author>          <time>          <version>          <desc>
 * 宋晓锋          2019/4/21          1.00              SpringMVC 的初步上手练习
 */
package com.java.spring.controls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈UserController〉
 *
 * @author 1
 * @create 2019/4/21
 * @since 1.0.0
 */
@Controller
@RequestMapping("/")
public class UserController {
    @RequestMapping("test1")
    public  String test1(){
        System.out.println("找到 第一个 controller 控制器，返回viewResorve地址 ");
        return "success";
    }
    @RequestMapping("test2")
    public  String test2(){

        System.out.println("这是第二个 试图解析 返回对应的url给view试图");

        return "success2";
    }

    @RequestMapping("test3")
    public  String test3(){
        System.out.println("这是 服务器上的test3");
        return  "success";
    }

}
