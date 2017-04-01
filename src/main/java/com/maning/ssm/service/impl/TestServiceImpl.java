package com.maning.ssm.service.impl;

import com.maning.ssm.mapper.TestMapper;
import com.maning.ssm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author maning
 * @create
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestMapper testMapper;

    public List<Map<String, Object>> getUsers() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        list = testMapper.findUser();
        return list;
    }
}
