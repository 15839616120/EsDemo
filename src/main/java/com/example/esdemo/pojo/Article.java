package com.example.esdemo.pojo;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.io.Serializable;

/**
 * @Desc: 文章实体
 * @Company: 聚优福利
 * @Author  wuyz@huayingcul.com
 * @Date  2018/9/18 22:05
 */
@Document(indexName = "tensquare",type = "article")
public class Article implements Serializable {

    private String id;
    private String columnid;
    @Field(index = true,analyzer = "ik_smart",searchAnalyzer = "ik_smart")
    private String user;

    public String getId() {
        return id;
    }

    public String getColumnid() {
        return columnid;
    }

    public String getUser() {
        return user;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setColumnid(String columnid) {
        this.columnid = columnid;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Article() {
    }

    public Article(String id, String columnid, String user) {
        this.id = id;
        this.columnid = columnid;
        this.user = user;
    }
}
