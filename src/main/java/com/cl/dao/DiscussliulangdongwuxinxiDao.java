package com.cl.dao;

import com.cl.entity.DiscussliulangdongwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussliulangdongwuxinxiView;


/**
 * 流浪动物信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-02 20:25:27
 */
public interface DiscussliulangdongwuxinxiDao extends BaseMapper<DiscussliulangdongwuxinxiEntity> {
	
	List<DiscussliulangdongwuxinxiView> selectListView(@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);

	List<DiscussliulangdongwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
	
	DiscussliulangdongwuxinxiView selectView(@Param("ew") Wrapper<DiscussliulangdongwuxinxiEntity> wrapper);
	

}
