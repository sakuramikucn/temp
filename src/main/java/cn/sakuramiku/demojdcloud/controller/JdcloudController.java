package cn.sakuramiku.demojdcloud.controller;

import cn.sakuramiku.demojdcloud.config.ClientConfig;
import cn.sakuramiku.demojdcloud.service.impl.ImageServiceImpl;
import cn.sakuramiku.demojdcloud.utils.ImageUtil;
import com.google.gson.Gson;
import com.jdcloud.sdk.service.charge.model.ChargeSpec;
import com.jdcloud.sdk.service.vm.model.*;
import com.jdcloud.sdk.service.vpc.model.NetworkInterfaceSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @author lyy
 * @date 2020/9/10
 */

@Controller
@RequestMapping("/api")
public class JdcloudController {

    @Autowired
    ImageServiceImpl imageService;

    @Autowired
    private ClientConfig client;


    /**
     * 获取 区域id 为cn-north-1的公共镜像
     * @return String
     */
    @GetMapping("/image/list")
    public String images(Model model) {
        DescribeImagesRequest request = new DescribeImagesRequest();
        request.setRegionId("cn-north-1");
        request.setImageSource("public");
        request.setPageSize(30);
        List<Image> images = client.getClient().describeImages(request).getResult().getImages();
        model.addAttribute("imageList",images);
        if (images.size() > 0){
            // 保存到数据库，存在则更新
            imageService.saveBatchImages(ImageUtil.convertToImageVoList(images));
        }
        return "image_list";
    }

    /**
     * 简单创建一个虚拟主机
     * @return
     */
    @ResponseBody
    @GetMapping("/instance/create")
    public String createVm() {
        InstanceSpec instanceSpec = new InstanceSpec();
        instanceSpec.setAz("cn-north-1c");
        instanceSpec.setInstanceType("g.s2.micro");
        instanceSpec.setImageId("img-ix4782iy3c");
        instanceSpec.setName("sdk-test");
        instanceSpec.setDescription("sdk测试");

        // 主网卡
        NetworkInterfaceSpec networkInterfaceSpec = new NetworkInterfaceSpec();
        networkInterfaceSpec.setSubnetId("subnet-iiuw4fmk8b");
        InstanceNetworkInterfaceAttachmentSpec instanceNetworkInterfaceAttachmentSpec = new InstanceNetworkInterfaceAttachmentSpec();
        instanceNetworkInterfaceAttachmentSpec.setNetworkInterface(networkInterfaceSpec);
        instanceSpec.setPrimaryNetworkInterface(instanceNetworkInterfaceAttachmentSpec);

        // 系统盘
        InstanceDiskAttachmentSpec systemDisk = new InstanceDiskAttachmentSpec();
        systemDisk.setDiskCategory("cloud");
        instanceSpec.setSystemDisk(systemDisk);


        // 计费方式
        ChargeSpec chargeSpec = new ChargeSpec();
        chargeSpec.setChargeMode("postpaid_by_duration");

        // 请求创建
        CreateInstancesRequest request = new CreateInstancesRequest();
        request.setRegionId("cn-north-1");
        request.setInstanceSpec(instanceSpec);
        request.setMaxCount(2);
        CreateInstancesResponse response = client.getClient().createInstances(request);
        return new Gson().toJson(response);
    }
}
