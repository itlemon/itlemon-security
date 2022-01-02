package cn.itlemon.spring.security.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author itlemon <lemon_jiang@aliyun.com>
 * Created on 2022-01-01
 */
@RequestMapping
public class HtmlController {

    @RequestMapping("/myLogin")
    public String myLogin() {
        return "myLogin";
    }

}
