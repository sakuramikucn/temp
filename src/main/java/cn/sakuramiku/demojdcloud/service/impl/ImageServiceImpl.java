package cn.sakuramiku.demojdcloud.service.impl;

import cn.sakuramiku.demojdcloud.dao.ImageMapper;
import cn.sakuramiku.demojdcloud.model.ImageVo;
import cn.sakuramiku.demojdcloud.service.ImageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lyy
 * @date 2020/9/10
 */

@Service
public class ImageServiceImpl implements ImageService {

    private static final Logger LOG = LoggerFactory.getLogger(ImageServiceImpl.class);

    @Autowired
    private ImageMapper imageMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveBatchImages(List<ImageVo> imageVos) {
        imageMapper.saveBatchImages(imageVos);
    }
}
