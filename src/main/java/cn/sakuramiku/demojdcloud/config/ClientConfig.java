package cn.sakuramiku.demojdcloud.config;

import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.http.HttpRequestConfig;
import com.jdcloud.sdk.http.Protocol;
import com.jdcloud.sdk.service.vm.client.VmClient;
import org.springframework.stereotype.Component;

/**
 * @author lyy
 * @date 2020/9/11
 */
@Component
public class ClientConfig {

    public VmClient getClient(){
        String accessKeyId = "413DB6F3EBC59B0297E761E7104FE3A0";
        String secretAccessKey = "BC87E4EFF05EC92DF8E162CF558785E9";
        CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);

        //2. 创建XXXClient
        return VmClient.builder()
                .credentialsProvider(credentialsProvider)
                .httpRequestConfig(new HttpRequestConfig.Builder().protocol(Protocol.HTTPS).build()) //默认为HTTPS
                .build();
    }
}
