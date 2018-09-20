package com.example.esdemo.controller;

import com.example.esdemo.pojo.Article;
import com.example.esdemo.service.ArticleSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Desc:
 * @Company: 聚优福利
 * @Author  wuyz@huayingcul.com
 * @Date  2018/9/18 22:19
 */
@RestController
@CrossOrigin
@RequestMapping("article")
public class ArticleSearchController {

    @Autowired
    private ArticleSearchService articleSearchService;
/**
 * @Desc: 增加es数据
 * @Param article 文章实体
 * @Author wuyz@huayingcul.com
 * @Date   2018/9/18 22:35
 * @return
 */
    @RequestMapping("add")
    public ResponseEntity add(@RequestBody Article article){
        articleSearchService.add(article);
        return new ResponseEntity("增加成功",HttpStatus.OK);
    }
    @RequestMapping(value = "/search/{keywords}/{page}/{size}",method = RequestMethod.GET)
    public ResponseEntity findArticleByUser(@PathVariable String keywords,@PathVariable int page,@PathVariable int size){
        Page<Article> list = articleSearchService.findArticleByUser(keywords, page-1, size);
        return new ResponseEntity(list,HttpStatus.OK);
    }
}
