package com.cl.entity.view;

import com.cl.entity.DongwuzhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 动物种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-02 20:25:26
 */
@TableName("dongwuzhonglei")
public class DongwuzhongleiView  extends DongwuzhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DongwuzhongleiView(){
	}
 
 	public DongwuzhongleiView(DongwuzhongleiEntity dongwuzhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, dongwuzhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
