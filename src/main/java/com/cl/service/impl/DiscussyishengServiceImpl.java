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


import com.cl.dao.DiscussyishengDao;
import com.cl.entity.DiscussyishengEntity;
import com.cl.service.DiscussyishengService;
import com.cl.entity.view.DiscussyishengView;

@Service("discussyishengService")
public class DiscussyishengServiceImpl extends ServiceImpl<DiscussyishengDao, DiscussyishengEntity> implements DiscussyishengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyishengEntity> page = this.selectPage(
                new Query<DiscussyishengEntity>(params).getPage(),
                new EntityWrapper<DiscussyishengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyishengEntity> wrapper) {
		  Page<DiscussyishengView> page =new Query<DiscussyishengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussyishengView> selectListView(Wrapper<DiscussyishengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyishengView selectView(Wrapper<DiscussyishengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
