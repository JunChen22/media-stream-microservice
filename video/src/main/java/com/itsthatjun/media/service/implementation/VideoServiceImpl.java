package com.itsthatjun.media.service.implementation;

import com.itsthatjun.media.DTO.VideoDTO;
import com.itsthatjun.media.entity.Video;
import com.itsthatjun.media.mapper.VideoMapper;
import com.itsthatjun.media.repository.VideoRepository;
import com.itsthatjun.media.service.VideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {

    private static final Logger LOG = LoggerFactory.getLogger(VideoServiceImpl.class);

    private final VideoRepository videoRepository;

    private final VideoMapper videoMapper;

    @Autowired
    public VideoServiceImpl(VideoRepository videoRepository, VideoMapper videoMapper) {
        this.videoRepository = videoRepository;
        this.videoMapper = videoMapper;
    }

    @Override
    public VideoDTO getVideo(Long id) {
        Video video = videoRepository.getReferenceById(id);
        VideoDTO dto = videoMapper.videoToVideoDTO(video);
        return dto;
    }

    @Override
    public VideoDTO postVideo(VideoDTO newVideo) {
        Video video = videoMapper.videoDTOToVideo(newVideo);
        videoRepository.save(video);
        return newVideo;
    }
}
