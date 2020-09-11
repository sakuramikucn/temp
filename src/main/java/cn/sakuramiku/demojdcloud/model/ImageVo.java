package cn.sakuramiku.demojdcloud.model;


import java.io.Serializable;
import java.util.Objects;

/**
 * image
 */
@SuppressWarnings("all")
public class ImageVo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 镜像ID
     */
    private String imageId;

    /**
     * 镜像名称
     */
    private String name;

    /**
     * 镜像的操作系统发行版。取值：Ubuntu,CentOS,Windows Server
     */
    private String platform;

    /**
     * 镜像的操作系统版本。
     */
    private String osVersion;

    /**
     * 镜像架构。取值：i386,x86_64
     */
    private String architecture;

    /**
     * 镜像系统盘大小
     */
    private Integer systemDiskSizeGB;

    /**
     * 镜像来源。取值：jcloud：官方镜像；marketplace：镜像市场镜像；self：用户自己的镜像；shared：其他用户分享的镜像
     */
    private String imageSource;

    /**
     * 镜像的操作系统类型。取值：windows,linux
     */
    private String osType;

    /**
     * &lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/image_status&quot;&gt;参考镜像状态&lt;/a&gt;
     */
    private String status;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 镜像描述
     */
    private String desc;

    /**
     * 创建云盘系统盘所使用的云硬盘快照ID。系统盘类型为本地盘的镜像，此参数为空。
     */
    private String snapshotId;

    /**
     * 镜像支持的系统盘类型。取值：localDisk：本地盘系统盘；cloudDisk：云盘系统盘。
     */
    private String rootDeviceType;

    /**
     * 镜像复制和转换时的进度，仅显示数值，单位为百分比
     */
    private String progress;

    @Override
    public String toString() {
        return "ImageVo{" +
                "imageId='" + imageId + '\'' +
                ", name='" + name + '\'' +
                ", platform='" + platform + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", architecture='" + architecture + '\'' +
                ", systemDiskSizeGB=" + systemDiskSizeGB +
                ", imageSource='" + imageSource + '\'' +
                ", osType='" + osType + '\'' +
                ", status='" + status + '\'' +
                ", createTime='" + createTime + '\'' +
                ", desc='" + desc + '\'' +
                ", snapshotId='" + snapshotId + '\'' +
                ", rootDeviceType='" + rootDeviceType + '\'' +
                ", progress='" + progress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageVo imageVo = (ImageVo) o;
        return Objects.equals(imageId, imageVo.imageId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId);
    }

    /**
     * get 镜像ID
     *
     * @return
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * get 镜像名称
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set 镜像名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 镜像的操作系统发行版。取值：Ubuntu,CentOS,Windows Server
     *
     * @return
     */
    public String getPlatform() {
        return platform;
    }

    /**
     * set 镜像的操作系统发行版。取值：Ubuntu,CentOS,Windows Server
     *
     * @param platform
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * get 镜像的操作系统版本。
     *
     * @return
     */
    public String getOsVersion() {
        return osVersion;
    }

    /**
     * set 镜像的操作系统版本。
     *
     * @param osVersion
     */
    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    /**
     * get 镜像架构。取值：i386,x86_64
     *
     * @return
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * set 镜像架构。取值：i386,x86_64
     *
     * @param architecture
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * get 镜像系统盘大小
     *
     * @return
     */
    public Integer getSystemDiskSizeGB() {
        return systemDiskSizeGB;
    }

    /**
     * set 镜像系统盘大小
     *
     * @param systemDiskSizeGB
     */
    public void setSystemDiskSizeGB(Integer systemDiskSizeGB) {
        this.systemDiskSizeGB = systemDiskSizeGB;
    }

    /**
     * get 镜像来源。取值：jcloud：官方镜像；marketplace：镜像市场镜像；self：用户自己的镜像；shared：其他用户分享的镜像
     *
     * @return
     */
    public String getImageSource() {
        return imageSource;
    }

    /**
     * set 镜像来源。取值：jcloud：官方镜像；marketplace：镜像市场镜像；self：用户自己的镜像；shared：其他用户分享的镜像
     *
     * @param imageSource
     */
    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    /**
     * get 镜像的操作系统类型。取值：windows,linux
     *
     * @return
     */
    public String getOsType() {
        return osType;
    }

    /**
     * set 镜像的操作系统类型。取值：windows,linux
     *
     * @param osType
     */
    public void setOsType(String osType) {
        this.osType = osType;
    }

    /**
     * get &lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/image_status&quot;&gt;参考镜像状态&lt;/a&gt;
     *
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * set &lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/image_status&quot;&gt;参考镜像状态&lt;/a&gt;
     *
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get 创建时间
     *
     * @return
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * get 镜像描述
     *
     * @return
     */
    public String getDesc() {
        return desc;
    }

    /**
     * set 镜像描述
     *
     * @param desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }


    /**
     * get 创建云盘系统盘所使用的云硬盘快照ID。系统盘类型为本地盘的镜像，此参数为空。
     *
     * @return
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * set 创建云盘系统盘所使用的云硬盘快照ID。系统盘类型为本地盘的镜像，此参数为空。
     *
     * @param snapshotId
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * get 镜像支持的系统盘类型。取值：localDisk：本地盘系统盘；cloudDisk：云盘系统盘。
     *
     * @return
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }

    /**
     * set 镜像支持的系统盘类型。取值：localDisk：本地盘系统盘；cloudDisk：云盘系统盘。
     *
     * @param rootDeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    /**
     * get 镜像复制和转换时的进度，仅显示数值，单位为百分比
     *
     * @return
     */
    public String getProgress() {
        return progress;
    }

    /**
     * set 镜像复制和转换时的进度，仅显示数值，单位为百分比
     *
     * @param progress
     */
    public void setProgress(String progress) {
        this.progress = progress;
    }


    /**
     * set 镜像ID
     *
     * @param imageId
     */
    public ImageVo imageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * set 镜像名称
     *
     * @param name
     */
    public ImageVo name(String name) {
        this.name = name;
        return this;
    }

    /**
     * set 镜像的操作系统发行版。取值：Ubuntu,CentOS,Windows Server
     *
     * @param platform
     */
    public ImageVo platform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * set 镜像的操作系统版本。
     *
     * @param osVersion
     */
    public ImageVo osVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * set 镜像架构。取值：i386,x86_64
     *
     * @param architecture
     */
    public ImageVo architecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * set 镜像系统盘大小
     *
     * @param systemDiskSizeGB
     */
    public ImageVo systemDiskSizeGB(Integer systemDiskSizeGB) {
        this.systemDiskSizeGB = systemDiskSizeGB;
        return this;
    }

    /**
     * set 镜像来源。取值：jcloud：官方镜像；marketplace：镜像市场镜像；self：用户自己的镜像；shared：其他用户分享的镜像
     *
     * @param imageSource
     */
    public ImageVo imageSource(String imageSource) {
        this.imageSource = imageSource;
        return this;
    }

    /**
     * set 镜像的操作系统类型。取值：windows,linux
     *
     * @param osType
     */
    public ImageVo osType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * set &lt;a href&#x3D;&quot;http://docs.jdcloud.com/virtual-machines/api/image_status&quot;&gt;参考镜像状态&lt;/a&gt;
     *
     * @param status
     */
    public ImageVo status(String status) {
        this.status = status;
        return this;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public ImageVo createTime(String createTime) {
        this.createTime = createTime;
        return this;
    }


    /**
     * set 镜像描述
     *
     * @param desc
     */
    public ImageVo desc(String desc) {
        this.desc = desc;
        return this;
    }


    /**
     * set 创建云盘系统盘所使用的云硬盘快照ID。系统盘类型为本地盘的镜像，此参数为空。
     *
     * @param snapshotId
     */
    public ImageVo snapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * set 镜像支持的系统盘类型。取值：localDisk：本地盘系统盘；cloudDisk：云盘系统盘。
     *
     * @param rootDeviceType
     */
    public ImageVo rootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }

    /**
     * set 镜像复制和转换时的进度，仅显示数值，单位为百分比
     *
     * @param progress
     */
    public ImageVo progress(String progress) {
        this.progress = progress;
        return this;
    }



}
