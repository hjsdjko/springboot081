package com.cl.dao;

import com.cl.entity.BinglidanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BinglidanganView;


/**
 * 病历档案
 * 
 * @author 
 * @email 
 * @date 2024-04-02 20:25:26
 */
public interface BinglidanganDao extends BaseMapper<BinglidanganEntity> {
	
	List<BinglidanganView> selectListView(@Param("ew") Wrapper<BinglidanganEntity> wrapper);

	List<BinglidanganView> selectListView(Pagination page,@Param("ew") Wrapper<BinglidanganEntity> wrapper);
	
	BinglidanganView selectView(@Param("ew") Wrapper<BinglidanganEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BinglidanganEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BinglidanganEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<BinglidanganEntity> wrapper);



}
