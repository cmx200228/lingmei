package com.cmx.lingmei.model.pojo;

import java.util.Date;

public class SysNewsList {
    /**
     * 新闻id
     */
    private Integer newsId;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 封面图片列表
     */
    private String imgList;

    /**
     * 新闻来源
     */
    private String source;

    /**
     * 新闻摘要
     */
    private String digest;

    /**
     * 发布时间
     */
    private Date postTime;

    /**
     * 视频列表
     */
    private String videoList;

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgList() {
        return imgList;
    }

    public void setImgList(String imgList) {
        this.imgList = imgList;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public String getVideoList() {
        return videoList;
    }

    public void setVideoList(String videoList) {
        this.videoList = videoList;
    }
}

