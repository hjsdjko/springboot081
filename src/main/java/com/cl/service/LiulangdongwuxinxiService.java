package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.LiulangdongwuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LiulangdongwuxinxiView;


/**
 * 流浪动物信息
 *
 * @author 
 * @email 
 * @date 2024-04-02 20:25:26
 */
public interface LiulangdongwuxinxiService extends IService<LiulangdongwuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiulangdongwuxinxiView> selectListView(Wrapper<LiulangdongwuxinxiEntity> wrapper);
   	
   	LiulangdongwuxinxiView selectView(@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiulangdongwuxinxiEntity> wrapper);
   	

}

