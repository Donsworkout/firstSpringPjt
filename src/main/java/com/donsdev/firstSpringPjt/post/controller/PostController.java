package com.donsdev.firstSpringPjt.post.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.donsdev.firstSpringPjt.common.common.CommandMap;
import com.donsdev.firstSpringPjt.post.service.PostService;

@Controller
public class PostController {
    Logger log = Logger.getLogger(this.getClass());
    
    @Resource(name="postService")
    private PostService postService;
    
    @RequestMapping(value="/post/postlist")
    public ModelAndView openPostList(CommandMap commandMap) throws Exception {
        
        ModelAndView mav = new ModelAndView("/post/postlist");
        
        List <Map<String,Object>> posts = postService.selectPostList(commandMap);
        mav.addObject("posts", posts);
        
        return mav;
        
    }
}
