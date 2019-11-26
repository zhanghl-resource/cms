package com.briup.cms.service;

import com.briup.cms.bean.Catagory;
import com.briup.cms.exception.CustomerException;

import java.util.List;
import java.util.Optional;

public interface ICatagoryService {
    void saveOrUpdate(Catagory catagory) throws CustomerException;
    void deleteById(int id) throws CustomerException;
    Catagory findById(int id) throws CustomerException;
    List<Catagory> findAll() throws CustomerException;
}
