package com.donsdev.firstSpringPjt.post.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.donsdev.firstSpringPjt.common.common.CommandMap;
import com.donsdev.firstSpringPjt.post.dao.PostDAO;

@Service("postService")
public class PostServiceImpl implements PostService {
    
    Logger log = Logger.getLogger(this.getClass());
    
    @Resource(name="postDAO")
    private PostDAO postDAO;
 
    @Override
    public List<Map<String, Object>> selectPostList(CommandMap commandMap) {
        // TODO Auto-generated method stub
        return postDAO.selectPostList(commandMap);
    }
 
}