package com.briup.cms.service.impl;

import com.briup.cms.bean.Article;
import com.briup.cms.dao.IArticledao;
import com.briup.cms.exception.CustomerException;
import com.briup.cms.service.IArticleService;
import com.briup.cms.util.CodeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ArticleServiceImpl implements IArticleService {

    @Autowired
    private IArticledao articledao;
    @Override
    public void addArticle(Article article) throws CustomerException {
        if (article == null){
            throw new CustomerException(CodeUtil.Bad_CODE,"参数为空");
        }
        article.setClickTimes(0);
        article.setPublishDate(new Date());
        articledao.save(article);
    }

    @Override
    public void deleteById(int id) throws CustomerException {
        articledao.deleteById(id);
    }

    @Override
    public Article findById(int id) throws CustomerException {
        return articledao.queryById(id);
    }
}
