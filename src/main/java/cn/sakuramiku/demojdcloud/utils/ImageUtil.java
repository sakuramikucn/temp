package cn.sakuramiku.demojdcloud.utils;

import cn.sakuramiku.demojdcloud.model.ImageVo;
import com.jdcloud.sdk.service.vm.model.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyy
 * @date 2020/9/11
 */
public class ImageUtil {

    public static ImageVo convertToImageVo(Image image){
        ImageVo imageVo = new ImageVo();
        imageVo.setImageId(image.getImageId());
        imageVo.setName(image.getName());
        imageVo.setPlatform(image.getPlatform());
        imageVo.setOsVersion(image.getOsVersion());
        imageVo.setArchitecture(image.getArchitecture());
        imageVo.setSystemDiskSizeGB(image.getSystemDiskSizeGB());
        imageVo.setImageSource(image.getImageSource());
        imageVo.setOsType(image.getOsType());
        imageVo.setStatus(image.getStatus());
        imageVo.setCreateTime(image.getCreateTime());
        imageVo.setSnapshotId(image.getSnapshotId());
        imageVo.setRootDeviceType(image.getRootDeviceType());
        imageVo.setProgress(image.getProgress());
        imageVo.setDesc(image.getDesc());
        return imageVo;
    }

    public static List<ImageVo> convertToImageVoList(List<Image> images){
        List<ImageVo> imageVos = new ArrayList<>();
        for (Image image:images){
            imageVos.add(ImageUtil.convertToImageVo(image));
        }
        return imageVos;
    }
}
