package com.briup.cms.dao;

import com.briup.cms.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticledao extends JpaRepository<Article, Integer> {
}
