package com.dao;

import com.pojo.Blog;

import java.util.List;
import java.util.Map;

//动态sql：为了解决 根据不同条件拼接 SQL 语句
public interface BlogMapper {

    public Blog getBlog(int id);

    //查询时判断字段是否为空
    List<Blog> queryBlogIf(Map map);

    //更新时判断字段是否为空
    public int updateBlog(Map map);

    //使用多个条件中的一个
    //为什么使用where：如果不使用，则多条件中的第一个没有成立，and字符就成了第判断条件的第一个
    //where 元素只会在子元素返回任何内容的情况下才插入 “WHERE” 子句。而且，若子句的开头为 “AND” 或 “OR”，where 元素也会将它们去除。
    public  Blog queryBlog(Map map);
}

