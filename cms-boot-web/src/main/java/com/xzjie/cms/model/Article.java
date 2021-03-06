package com.xzjie.cms.model;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "cms_article")
public class Article extends BaseEntity<Article> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long categoryId;

    private String title;

    private String url;

    private String image;

    private String keywords;

    private String description;

    private Long author;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    private Integer countRead;

    private Integer countComment;

    private Integer sort;

    private Integer state;

    private Integer approveStatus;

    private Date publishDate;

    private Long publishAuthor;

    private Date startTime;

    private Date endTime;

    private String remarks;

    private Integer recommendStat;

    @Column(name = "content", columnDefinition = "text")
    private String content;

    private Integer showState;

    @Transient
    private String authorName;

    @Transient
    private String categoryName;

    @Transient
    private String name;

    @Transient
    private String nickName;

    @Transient
    private String avatar;

    @Override
    public void copy(Article article) {
        BeanUtils.copyProperties(article, this, getIgnoreProperty(article));
    }
}
