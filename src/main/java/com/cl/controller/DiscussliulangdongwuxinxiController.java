package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.DiscussliulangdongwuxinxiEntity;
import com.cl.entity.view.DiscussliulangdongwuxinxiView;

import com.cl.service.DiscussliulangdongwuxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 流浪动物信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-02 20:25:27
 */
@RestController
@RequestMapping("/discussliulangdongwuxinxi")
public class DiscussliulangdongwuxinxiController {
    @Autowired
    private DiscussliulangdongwuxinxiService discussliulangdongwuxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxi,
		HttpServletRequest request){
        EntityWrapper<DiscussliulangdongwuxinxiEntity> ew = new EntityWrapper<DiscussliulangdongwuxinxiEntity>();

		PageUtils page = discussliulangdongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussliulangdongwuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscussliulangdongwuxinxiEntity> ew = new EntityWrapper<DiscussliulangdongwuxinxiEntity>();

		PageUtils page = discussliulangdongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussliulangdongwuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxi){
       	EntityWrapper<DiscussliulangdongwuxinxiEntity> ew = new EntityWrapper<DiscussliulangdongwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussliulangdongwuxinxi, "discussliulangdongwuxinxi")); 
        return R.ok().put("data", discussliulangdongwuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxi){
        EntityWrapper< DiscussliulangdongwuxinxiEntity> ew = new EntityWrapper< DiscussliulangdongwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussliulangdongwuxinxi, "discussliulangdongwuxinxi")); 
		DiscussliulangdongwuxinxiView discussliulangdongwuxinxiView =  discussliulangdongwuxinxiService.selectView(ew);
		return R.ok("查询流浪动物信息评论表成功").put("data", discussliulangdongwuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxi = discussliulangdongwuxinxiService.selectById(id);
		discussliulangdongwuxinxi = discussliulangdongwuxinxiService.selectView(new EntityWrapper<DiscussliulangdongwuxinxiEntity>().eq("id", id));
        return R.ok().put("data", discussliulangdongwuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxi = discussliulangdongwuxinxiService.selectById(id);
		discussliulangdongwuxinxi = discussliulangdongwuxinxiService.selectView(new EntityWrapper<DiscussliulangdongwuxinxiEntity>().eq("id", id));
        return R.ok().put("data", discussliulangdongwuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxi, HttpServletRequest request){
    	discussliulangdongwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussliulangdongwuxinxi);
        discussliulangdongwuxinxiService.insert(discussliulangdongwuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxi, HttpServletRequest request){
    	discussliulangdongwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussliulangdongwuxinxi);
        discussliulangdongwuxinxiService.insert(discussliulangdongwuxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    @IgnoreAuth
    public R update(@RequestBody DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussliulangdongwuxinxi);
        discussliulangdongwuxinxiService.updateById(discussliulangdongwuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussliulangdongwuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DiscussliulangdongwuxinxiEntity discussliulangdongwuxinxi, HttpServletRequest request,String pre){
        EntityWrapper<DiscussliulangdongwuxinxiEntity> ew = new EntityWrapper<DiscussliulangdongwuxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = discussliulangdongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussliulangdongwuxinxi), params), params));
        return R.ok().put("data", page);
    }








}
