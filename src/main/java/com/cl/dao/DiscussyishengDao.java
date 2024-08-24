package com.cl.dao;

import com.cl.entity.DiscussyishengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussyishengView;


/**
 * 医生评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-02 20:25:27
 */
public interface DiscussyishengDao extends BaseMapper<DiscussyishengEntity> {
	
	List<DiscussyishengView> selectListView(@Param("ew") Wrapper<DiscussyishengEntity> wrapper);

	List<DiscussyishengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyishengEntity> wrapper);
	
	DiscussyishengView selectView(@Param("ew") Wrapper<DiscussyishengEntity> wrapper);
	

}
