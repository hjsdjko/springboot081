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

import com.cl.entity.LiulangdongwuxinxiEntity;
import com.cl.entity.view.LiulangdongwuxinxiView;

import com.cl.service.LiulangdongwuxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 流浪动物信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-02 20:25:26
 */
@RestController
@RequestMapping("/liulangdongwuxinxi")
public class LiulangdongwuxinxiController {
    @Autowired
    private LiulangdongwuxinxiService liulangdongwuxinxiService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LiulangdongwuxinxiEntity liulangdongwuxinxi,
		HttpServletRequest request){
        EntityWrapper<LiulangdongwuxinxiEntity> ew = new EntityWrapper<LiulangdongwuxinxiEntity>();

		PageUtils page = liulangdongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liulangdongwuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LiulangdongwuxinxiEntity liulangdongwuxinxi, 
		HttpServletRequest request){
        EntityWrapper<LiulangdongwuxinxiEntity> ew = new EntityWrapper<LiulangdongwuxinxiEntity>();

		PageUtils page = liulangdongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liulangdongwuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LiulangdongwuxinxiEntity liulangdongwuxinxi){
       	EntityWrapper<LiulangdongwuxinxiEntity> ew = new EntityWrapper<LiulangdongwuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( liulangdongwuxinxi, "liulangdongwuxinxi")); 
        return R.ok().put("data", liulangdongwuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LiulangdongwuxinxiEntity liulangdongwuxinxi){
        EntityWrapper< LiulangdongwuxinxiEntity> ew = new EntityWrapper< LiulangdongwuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( liulangdongwuxinxi, "liulangdongwuxinxi")); 
		LiulangdongwuxinxiView liulangdongwuxinxiView =  liulangdongwuxinxiService.selectView(ew);
		return R.ok("查询流浪动物信息成功").put("data", liulangdongwuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LiulangdongwuxinxiEntity liulangdongwuxinxi = liulangdongwuxinxiService.selectById(id);
		liulangdongwuxinxi.setClicktime(new Date());
		liulangdongwuxinxiService.updateById(liulangdongwuxinxi);
		liulangdongwuxinxi = liulangdongwuxinxiService.selectView(new EntityWrapper<LiulangdongwuxinxiEntity>().eq("id", id));
        return R.ok().put("data", liulangdongwuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LiulangdongwuxinxiEntity liulangdongwuxinxi = liulangdongwuxinxiService.selectById(id);
		liulangdongwuxinxi.setClicktime(new Date());
		liulangdongwuxinxiService.updateById(liulangdongwuxinxi);
		liulangdongwuxinxi = liulangdongwuxinxiService.selectView(new EntityWrapper<LiulangdongwuxinxiEntity>().eq("id", id));
        return R.ok().put("data", liulangdongwuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LiulangdongwuxinxiEntity liulangdongwuxinxi, HttpServletRequest request){
    	liulangdongwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(liulangdongwuxinxi);
        liulangdongwuxinxiService.insert(liulangdongwuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LiulangdongwuxinxiEntity liulangdongwuxinxi, HttpServletRequest request){
    	liulangdongwuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(liulangdongwuxinxi);
        liulangdongwuxinxiService.insert(liulangdongwuxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody LiulangdongwuxinxiEntity liulangdongwuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(liulangdongwuxinxi);
        liulangdongwuxinxiService.updateById(liulangdongwuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        liulangdongwuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,LiulangdongwuxinxiEntity liulangdongwuxinxi, HttpServletRequest request,String pre){
        EntityWrapper<LiulangdongwuxinxiEntity> ew = new EntityWrapper<LiulangdongwuxinxiEntity>();
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
		PageUtils page = liulangdongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liulangdongwuxinxi), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 按收藏推荐
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,LiulangdongwuxinxiEntity liulangdongwuxinxi, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "chongwuzhuangtai";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "liulangdongwuxinxi").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<LiulangdongwuxinxiEntity> liulangdongwuxinxiList = new ArrayList<LiulangdongwuxinxiEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                liulangdongwuxinxiList.addAll(liulangdongwuxinxiService.selectList(new EntityWrapper<LiulangdongwuxinxiEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<LiulangdongwuxinxiEntity> ew = new EntityWrapper<LiulangdongwuxinxiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = liulangdongwuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liulangdongwuxinxi), params), params));
        List<LiulangdongwuxinxiEntity> pageList = (List<LiulangdongwuxinxiEntity>)page.getList();
        if(liulangdongwuxinxiList.size()<limit) {
            int toAddNum = (limit-liulangdongwuxinxiList.size())<=pageList.size()?(limit-liulangdongwuxinxiList.size()):pageList.size();
            for(LiulangdongwuxinxiEntity o1 : pageList) {
                boolean addFlag = true;
                for(LiulangdongwuxinxiEntity o2 : liulangdongwuxinxiList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    liulangdongwuxinxiList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(liulangdongwuxinxiList.size()>limit) {
            liulangdongwuxinxiList = liulangdongwuxinxiList.subList(0, limit);
        }
        page.setList(liulangdongwuxinxiList);
        return R.ok().put("data", page);
    }







}
