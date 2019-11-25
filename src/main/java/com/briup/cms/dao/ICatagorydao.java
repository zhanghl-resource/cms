package com.briup.cms.dao;

import com.briup.cms.bean.Catagory;
import com.briup.cms.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICatagorydao extends JpaRepository<Catagory, Integer> {
}
