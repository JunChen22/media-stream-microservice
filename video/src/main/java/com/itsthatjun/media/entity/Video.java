package com.itsthatjun.media.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "video")
@Getter
@Setter
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String url;

    private String thumbnailUrl;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime uploadDate;

    private int duration;

    @Column(columnDefinition = "bigint default 0")
    private Long views;

    @Column(columnDefinition = "bigint default 0")
    private Long likes;

    @Column(columnDefinition = "bigint default 0")
    private Long dislikes;

    /*
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private Category category;
     */

    private boolean isPublic;
    private Set<Tag> tags;

}
