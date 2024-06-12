package com.itsthatjun.media.repository;

import com.itsthatjun.media.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {

}
