package com.maning.ssm.service.impl;

import com.maning.ssm.mapper.TestMapper;
import com.maning.ssm.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author maning
 * @create
 */
@Service
@Transactional
public class MoneyServiceImpl implements MoneyService {

    @Autowired
    TestMapper testMapper;

    public void transfer(String out, String in, Double money) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list = testMapper.findUser();
    }

    public void outMoney(Map<String, Object> map) {
        testMapper.outMoney(map);
    }

    public void inMoney(Map<String, Object> map) {
        testMapper.inMoney(map);
    }

    public void changeMoney(Map<String, Object> map) {
        testMapper.outMoney(map);
        int i = 1 / 0;
        testMapper.inMoney(map);
    }
}
