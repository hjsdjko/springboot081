package com.cl.entity.view;

import com.cl.entity.LiulangdongwuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 流浪动物信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-02 20:25:26
 */
@TableName("liulangdongwuxinxi")
public class LiulangdongwuxinxiView  extends LiulangdongwuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LiulangdongwuxinxiView(){
	}
 
 	public LiulangdongwuxinxiView(LiulangdongwuxinxiEntity liulangdongwuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, liulangdongwuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
