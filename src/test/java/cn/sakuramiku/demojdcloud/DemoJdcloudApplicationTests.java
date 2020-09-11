package cn.sakuramiku.demojdcloud;

import cn.sakuramiku.demojdcloud.config.ClientConfig;
import com.google.gson.Gson;
import com.jdcloud.sdk.JdcloudSdkException;
import com.jdcloud.sdk.auth.CredentialsProvider;
import com.jdcloud.sdk.auth.StaticCredentialsProvider;
import com.jdcloud.sdk.service.common.model.Filter;
import com.jdcloud.sdk.service.vm.client.VmClient;
import com.jdcloud.sdk.service.vm.model.*;
import com.jdcloud.sdk.service.vpc.client.VpcClient;
import com.jdcloud.sdk.service.vpc.model.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;

@SpringBootTest
class DemoJdcloudApplicationTests {

    @Autowired
    private ClientConfig client;


    @Test
    void contextLoads() {
    }

    @Test
    public void DescribInstanceTypes() {
        Filter filter = new Filter();
        filter.setName("instanceTypes");
        DescribeInstanceTypesRequest request = new DescribeInstanceTypesRequest();
        request.setRegionId("cn-north-1");
        request.setFilters(Arrays.asList(filter));
        DescribeInstanceTypesResponse response = client.getClient().describeInstanceTypes(request);
        System.out.println(new Gson().toJson(response));
    }

    @Test
    public void test01()  {
        String accessKeyId = "413DB6F3EBC59B0297E761E7104FE3A0";
        String secretAccessKey = "BC87E4EFF05EC92DF8E162CF558785E9";
        CredentialsProvider credentialsProvider = new StaticCredentialsProvider(accessKeyId, secretAccessKey);
        VpcClient vpcClient = VpcClient.builder()
                .credentialsProvider(credentialsProvider)
                .build();
        DescribeVpcsRequest request = new DescribeVpcsRequest();
        request.setRegionId("cn-north-1");
        DescribeVpcsResponse response = vpcClient.describeVpcs(request);
        System.out.println(new Gson().toJson(response));
    }

    @Test
    public void test02(){
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setRegionId("cn-north-1");
        DescribeInstancesResponse response = client.getClient().describeInstances(request);
        System.out.println(new Gson().toJson(response));
    }

}
