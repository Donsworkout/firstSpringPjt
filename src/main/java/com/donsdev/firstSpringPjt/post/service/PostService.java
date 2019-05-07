package com.donsdev.firstSpringPjt.post.service;

import java.util.List;
import java.util.Map;

import com.donsdev.firstSpringPjt.common.common.CommandMap;

public interface PostService {
	List<Map<String, Object>> selectPostList(CommandMap commandMap);
}
