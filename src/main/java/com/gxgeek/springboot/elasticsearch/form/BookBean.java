package com.gxgeek.springboot.elasticsearch.form;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 
 * @author yujiansong
 *	  @date 2017年12月3日
 */
@Data
public class BookBean {

    private String id;
    private String title;
    private String author;
    private Integer word_count;
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date public_date;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Integer getWord_count() {
        return word_count;
    }
    public void setWord_count(Integer word_count) {
        this.word_count = word_count;
    }
    public Date getPublic_date() {
        return public_date;
    }
    public void setPublic_date(Date public_date) {
        this.public_date = public_date;
    }

    
}
