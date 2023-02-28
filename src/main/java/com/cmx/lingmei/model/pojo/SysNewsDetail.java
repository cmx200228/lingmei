package com.cmx.lingmei.model.pojo;

import java.util.Date;

/**
 *
 * @author 陈蒙欣
 * @date 2023/2/27
 */

public class SysNewsDetail {
    /**
     * 新闻详情id
     */
    private Integer detailId;

    /**
     * 新闻详情标题
     */
    private String title;

    /**
     * 新闻来源
     */
    private String source;

    /**
     * 新闻详情内容
     */
    private String content;

    /**
     * 新闻发布时间
     */
    private Date ptime;

    /**
     * 新闻唯一id
     */
    private String docid;

    /**
     * 新闻封面图片
     */
    private String cover;

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
    }

    public String getDocid() {
        return docid;
    }

    public void setDocid(String docid) {
        this.docid = docid;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}

