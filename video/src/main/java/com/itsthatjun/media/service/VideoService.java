package com.itsthatjun.media.service;

import com.itsthatjun.media.DTO.VideoDTO;

public interface VideoService {

    VideoDTO getVideo(Long id);

    VideoDTO postVideo(VideoDTO video);

}
