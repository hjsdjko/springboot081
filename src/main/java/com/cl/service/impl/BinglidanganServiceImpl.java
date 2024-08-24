package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.BinglidanganDao;
import com.cl.entity.BinglidanganEntity;
import com.cl.service.BinglidanganService;
import com.cl.entity.view.BinglidanganView;

@Service("binglidanganService")
public class BinglidanganServiceImpl extends ServiceImpl<BinglidanganDao, BinglidanganEntity> implements BinglidanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BinglidanganEntity> page = this.selectPage(
                new Query<BinglidanganEntity>(params).getPage(),
                new EntityWrapper<BinglidanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BinglidanganEntity> wrapper) {
		  Page<BinglidanganView> page =new Query<BinglidanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<BinglidanganView> selectListView(Wrapper<BinglidanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BinglidanganView selectView(Wrapper<BinglidanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<BinglidanganEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<BinglidanganEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<BinglidanganEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
