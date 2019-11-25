package com.briup.cms.service.impl;

import com.briup.cms.bean.Link;
import com.briup.cms.dao.ILinkdao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.ILinkService;
import com.briup.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LinkServiceImpl implements ILinkService {
    @Autowired
    private ILinkdao linkdao;
    @Override
    public void addLink(Link link) throws CustomerException {
        if(link == null){
            throw new CustomerException(CodeUtil.Bad_CODE,"参数为空");
        }
        linkdao.save(link);
    }
}
