package com.itsthatjun.media.service.implementation;

import com.itsthatjun.media.entity.Video;
import com.itsthatjun.media.repository.VideoRepository;
import com.itsthatjun.media.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;

    @Autowired
    public VideoServiceImpl(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public Video getVideo(Long id) {
        return videoRepository.getReferenceById(id);
    }

    @Override
    public Video postVideo(Video video) {
        videoRepository.save(video);
        return video;
    }
}
