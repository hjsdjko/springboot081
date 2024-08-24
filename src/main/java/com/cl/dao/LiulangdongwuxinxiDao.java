package com.cl.dao;

import com.cl.entity.LiulangdongwuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.LiulangdongwuxinxiView;


/**
 * 流浪动物信息
 * 
 * @author 
 * @email 
 * @date 2024-04-02 20:25:26
 */
public interface LiulangdongwuxinxiDao extends BaseMapper<LiulangdongwuxinxiEntity> {
	
	List<LiulangdongwuxinxiView> selectListView(@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);

	List<LiulangdongwuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);
	
	LiulangdongwuxinxiView selectView(@Param("ew") Wrapper<LiulangdongwuxinxiEntity> wrapper);
	

}
