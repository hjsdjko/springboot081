package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.BinglidanganEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.BinglidanganView;


/**
 * 病历档案
 *
 * @author 
 * @email 
 * @date 2024-04-02 20:25:26
 */
public interface BinglidanganService extends IService<BinglidanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BinglidanganView> selectListView(Wrapper<BinglidanganEntity> wrapper);
   	
   	BinglidanganView selectView(@Param("ew") Wrapper<BinglidanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BinglidanganEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<BinglidanganEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<BinglidanganEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<BinglidanganEntity> wrapper);



}

