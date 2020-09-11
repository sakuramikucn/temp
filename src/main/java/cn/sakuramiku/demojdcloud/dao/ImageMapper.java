package cn.sakuramiku.demojdcloud.dao;

import cn.sakuramiku.demojdcloud.model.ImageVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ImageMapper {

    boolean saveBatchImages(@Param("imageVos") List<ImageVo> imageVos);

}