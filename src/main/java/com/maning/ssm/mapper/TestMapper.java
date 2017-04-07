package com.maning.ssm.mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public interface TestMapper {

    public List<Map<String, Object>> findUser();

    public void outMoney(Map<String, Object> map);

    public void inMoney(Map<String, Object> map);
}
