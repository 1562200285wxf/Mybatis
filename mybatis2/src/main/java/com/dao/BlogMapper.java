package com.dao;

import com.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    public Blog getBlog(int id);

    List<Blog> queryBlogIf(Map map);

    public int updateBlog(Map map);

    //只要符合一个条件就可以实现查找
    public  Blog queryBlog(Map map);
}

