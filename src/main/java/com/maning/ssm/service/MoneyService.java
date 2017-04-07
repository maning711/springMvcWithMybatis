package com.maning.ssm.service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @author maning
 * @create
 */
public interface MoneyService {

    public void transfer(String out, String in, Double money);

    public void outMoney(Map<String, Object> map);

    public void inMoney(Map<String, Object> map);

    public void changeMoney(Map<String, Object> map);
}
