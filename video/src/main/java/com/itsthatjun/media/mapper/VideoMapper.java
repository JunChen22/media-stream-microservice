package com.itsthatjun.media.mapper;

import com.itsthatjun.media.DTO.VideoDTO;
import com.itsthatjun.media.entity.Video;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface VideoMapper {

    VideoMapper INSTANCE = Mappers.getMapper(VideoMapper.class);

    VideoDTO videoToVideoDTO(Video video);

    @Mapping(target = "id", ignore = true)
    Video videoDTOToVideo(VideoDTO videoDTO);
}
