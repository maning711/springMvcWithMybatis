package com.maning.ssm.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author maning
 * @create
 */
public interface TestService {

    public List<Map<String, Object>> getUsers();
}
