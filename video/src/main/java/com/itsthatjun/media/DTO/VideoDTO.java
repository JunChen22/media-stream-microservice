package com.itsthatjun.media.DTO;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class VideoDTO implements Serializable {

    private String title;

    private String description;

    private String url;

    private String thumbnailUrl;

    private LocalDateTime uploadDate;

}
