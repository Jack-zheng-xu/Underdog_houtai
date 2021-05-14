package com.atguigu.eduservice.client;


import com.atguigu.commonutils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Component
@FeignClient(value = "service-vod",fallback = VodFileDegradeFeignClient.class)//fallback回调函数，当出现错误时候执行
public interface VodClient {

    //根据视频id删除阿里云视频  必须写完全路径  @PathVariable 必须只能参数名称
    @DeleteMapping("/eduvod/video/removeAlyVideo/{id}")
    public R removeAlyVideo(@PathVariable("id") String id);

    @DeleteMapping("/eduvod/video/delete-batch")
    public R deleteBantch(@RequestParam("videoIdList") List<String> videoIdList);

}