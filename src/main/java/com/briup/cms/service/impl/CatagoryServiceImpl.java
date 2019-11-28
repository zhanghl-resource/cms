package com.briup.cms.service.impl;

import com.briup.cms.bean.Catagory;
import com.briup.cms.dao.ICatagorydao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.ICatagoryService;
import com.briup.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatagoryServiceImpl implements ICatagoryService {

    @Autowired
    private ICatagorydao catagorydao;
    @Override
    public void saveOrUpdate(Catagory catagory) throws CustomerException {
        if (catagory == null){
            throw new CustomerException(CodeUtil.Bad_CODE,"参数为空");
        }
        catagorydao.save(catagory);
    }
    @Override
    public void deleteById(int id) throws CustomerException {
        catagorydao.deleteById(id);
    }

    @Override
    public Catagory findById(int id) throws CustomerException {
        return catagorydao.queryById(id);
    }

    @Override
    public List<Catagory> findAll() throws CustomerException {
        return catagorydao.findAll();
    }
}
