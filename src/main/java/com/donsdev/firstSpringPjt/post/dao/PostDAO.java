package com.donsdev.firstSpringPjt.post.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.donsdev.firstSpringPjt.AbstractDAO;
import com.donsdev.firstSpringPjt.common.common.CommandMap;

// ORM 처럼 쓰기 위해 AbstractDAO 상속받음 
@Repository("postDAO")
public class PostDAO extends AbstractDAO{
 
    @SuppressWarnings("unchecked")
    public List<Map<String, Object>> selectPostList(CommandMap commandMap) {
        // post_SQL file 잠조하는데, post 가 name space 이고 selectPostList 가 select 의 ID 이다.
        return (List<Map<String,Object>>)selectList("post.selectPostList", commandMap);
    }
 
}

