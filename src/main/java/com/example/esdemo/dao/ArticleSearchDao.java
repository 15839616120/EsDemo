package com.example.esdemo.dao;

import com.example.esdemo.pojo.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Desc: dao接口
 * @Company: 聚优福利
 * @Author  wuyz@huayingcul.com
 * @Date  2018/9/18 22:11
 */
public interface ArticleSearchDao extends ElasticsearchRepository<Article,String> {

    /**
     * @Desc: 查询文章（按照标题和内容）
     * @Param user 用户
     * @Param pageable 分页
     * @Author wuyz@huayingcul.com
     * @Date   2018/9/19 22:49
     * @return
     */
    public Page<Article> findArticleByUser(String user, Pageable pageable);
}
