package com.briup.cms.service.impl;

import com.briup.cms.bean.Link;
import com.briup.cms.dao.ILinkdao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.ILinkService;
import com.briup.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkServiceImpl implements ILinkService {
    @Autowired
    private ILinkdao linkdao;

    @Override
    public void saveOrUpdate(Link link) throws CustomerException {
        if(link == null){
            throw new CustomerException(CodeUtil.Bad_CODE,"参数为空");
        }
        linkdao.save(link);
    }

    @Override
    public void deleteById(int id) throws CustomerException {
        linkdao.deleteById(id);
    }

    @Override
    public Link findById(int id) throws CustomerException {
        linkdao.queryById(id);
        return null;
    }

    @Override
    public List<Link> findAll() throws CustomerException {
        return linkdao.findAll();
    }

}
