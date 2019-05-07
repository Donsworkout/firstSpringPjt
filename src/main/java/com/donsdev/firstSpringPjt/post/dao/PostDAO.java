package com.donsdev.firstSpringPjt.post.dao;

import org.springframework.stereotype.Repository;

import com.donsdev.firstSpringPjt.AbstractDAO;

// ORM 처럼 쓰기 위해 AbstractDAO 상속받음 
@Repository("postDAO")
public class PostDAO extends AbstractDAO{

}
