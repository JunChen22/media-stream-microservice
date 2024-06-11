package com.itsthatjun.media.controller;

import com.itsthatjun.media.entity.Video;
import com.itsthatjun.media.service.VideoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/video")
public class VideoController {

    private static final Logger LOG = LoggerFactory.getLogger(VideoController.class);

    private final VideoService videoService;

    @Autowired
    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/{id}")
    public Video getVideo(@PathVariable Long id) {
        return videoService.getVideo(id);
    }

    @PostMapping
    public Video postVideo(@RequestBody Video newVideo) {
        videoService.postVideo(newVideo);
        return newVideo;
    }
}
