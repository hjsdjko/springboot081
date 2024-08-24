package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussyishengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussyishengView;


/**
 * 医生评论表
 *
 * @author 
 * @email 
 * @date 2024-04-02 20:25:27
 */
public interface DiscussyishengService extends IService<DiscussyishengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyishengView> selectListView(Wrapper<DiscussyishengEntity> wrapper);
   	
   	DiscussyishengView selectView(@Param("ew") Wrapper<DiscussyishengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyishengEntity> wrapper);
   	

}

