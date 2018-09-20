package com.example.esdemo.service;

import com.example.esdemo.dao.ArticleSearchDao;
import com.example.esdemo.pojo.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author wuyizhe
 * @ProjectName esdemo
 * @Description: TODO
 * @date 2018/9/1822:14
 */
@Service
public class ArticleSearchService {

    @Autowired
    private ArticleSearchDao articleSearchDao;

    /**
     * @Desc:
     * @Param 增加文章
     * @Author wuyz@huayingcul.com
     * @Date   2018/9/18 22:18
     * @return
     */

    public void add(Article article){
        articleSearchDao.save(article);
    }
    /**
     * @Desc: 查询
     * @Param
     * @Author wuyz@huayingcul.com
     * @Date   2018/9/19 22:53
     * @return
     */

    public Page<Article> findArticleByUser(String keyword, int page, int size){
        PageRequest pageRequest =PageRequest.of(page,size);
        return articleSearchDao.findArticleByUser(keyword,pageRequest);
    }
}
