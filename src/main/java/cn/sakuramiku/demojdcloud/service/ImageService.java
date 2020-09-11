package cn.sakuramiku.demojdcloud.service;

import cn.sakuramiku.demojdcloud.model.ImageVo;

import java.util.List;

/**
 * @author lyy
 * @date 2020/9/10
 */
public interface ImageService {

    void saveBatchImages(List<ImageVo> imageVos);

}
