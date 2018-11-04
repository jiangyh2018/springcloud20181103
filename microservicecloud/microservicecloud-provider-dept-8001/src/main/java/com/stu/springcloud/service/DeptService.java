package com.stu.springcloud.service;

import com.stu.springcloud.entities.Dept;

import java.util.List;

/**
 * @description:
 * @author:
 * @create: 2018-11-04 22:39
 **/
public interface DeptService {
    public boolean add(Dept dept);

    public Dept get(Long id);

    public List<Dept> list();
}
