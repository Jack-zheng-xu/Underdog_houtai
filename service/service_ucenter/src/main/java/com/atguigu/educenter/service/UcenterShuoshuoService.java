package com.atguigu.educenter.service;

import com.atguigu.educenter.entity.UcenterShuoshuo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Zhang zhengxu
 * @since 2021-05-20
 */
public interface UcenterShuoshuoService extends IService<UcenterShuoshuo> {

    List<UcenterShuoshuo> getShuoshuoById(String id);
}
