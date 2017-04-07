package com.maning.ssm.controller;

import com.maning.ssm.service.MoneyService;
import com.maning.ssm.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author maning
 * @create
 */
// 注解标注此类为springmvc的controller，url映射为"/home"
@Controller
@RequestMapping("/")
public class HomeController {
    //添加一个日志器
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @Autowired
    TestService testService;

    @Autowired
    MoneyService moneyService;

    //映射一个action
    @RequestMapping("/index")
    public String index(Model model){
        //输出日志文件
        logger.info("the first jsp pages");

        //返回一个index.jsp这个视图
        Map<String, Object> map = new HashMap<String, Object>();
        List<Map<String, Object>> list = testService.getUsers();
        map.put("title", "maning");
        map.put("list", list);
        model.addAttribute("data", map);
        return "userList";
    }

    @RequestMapping("/outMoney")
    public String outMoney(Model model){
        //输出日志文件
        logger.info("执行取款处理");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("count", "100000");
        map.put("money", "200");
        moneyService.outMoney(map);

        return "index";
    }

    @RequestMapping("/inMoney")
    public String inMoney(Model model){
        //输出日志文件
        logger.info("执行存款处理");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("count", "100000");
        map.put("money", "200");
        moneyService.inMoney(map);

        return "index";
    }

    @RequestMapping("/changeMoney")
    public String changeMoney(Model model){
        //输出日志文件
        logger.info("执行两部操作");

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("count", "100000");
        map.put("money", "200");
        moneyService.changeMoney(map);
        return "showMoney";
    }
}
