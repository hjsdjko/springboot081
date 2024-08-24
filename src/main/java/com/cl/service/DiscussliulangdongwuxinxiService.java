package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussliulangdongwuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussliulangdongwuxinxiView;


/**
 * 流浪动物信息评论表
 *
 * @author 
 * @email 
 * @date 2024-04-02 20:25:27
 */
public interface DiscussliulangdongwuxinxiService extends IService<DiscussliulangdongwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussliulangdongwuxinxiView> selectListView(Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
   	
   	DiscussliulangdongwuxinxiView selectView(@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
   	

}

