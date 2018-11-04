package com.stu.springcloud.dao;

import com.stu.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @description:
 * @author:
 * @create: 2018-11-04 22:35
 **/
@Mapper
public interface DeptDao
{
    public boolean addDept(Dept dept);

    public Dept findById(Long id);


    public List<Dept> findAll();
}
