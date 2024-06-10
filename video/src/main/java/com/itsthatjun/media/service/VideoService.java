package com.itsthatjun.media.service;

import com.itsthatjun.media.entity.Video;

public interface VideoService {

    Video getVideo(Long id);

    Video postVideo(Video video);

}
