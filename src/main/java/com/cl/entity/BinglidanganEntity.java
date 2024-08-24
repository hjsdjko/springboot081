package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病历档案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-02 20:25:26
 */
@TableName("binglidangan")
public class BinglidanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BinglidanganEntity() {
		
	}
	
	public BinglidanganEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 宠物名称
	 */
					
	private String chongwumingcheng;
	
	/**
	 * 动物种类
	 */
					
	private String dongwuzhonglei;
	
	/**
	 * 动物病征
	 */
					
	private String dongwubingzheng;
	
	/**
	 * 是否打过狂犬疫苗
	 */
					
	private String shifoudaguokuangquanyimiao;
	
	/**
	 * 诊断结果
	 */
					
	private String zhenduanjieguo;
	
	/**
	 * 回访结果
	 */
					
	private String huifangjieguo;
	
	/**
	 * 医生账号
	 */
					
	private String yishengzhanghao;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：宠物名称
	 */
	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}
	/**
	 * 获取：宠物名称
	 */
	public String getChongwumingcheng() {
		return chongwumingcheng;
	}
	/**
	 * 设置：动物种类
	 */
	public void setDongwuzhonglei(String dongwuzhonglei) {
		this.dongwuzhonglei = dongwuzhonglei;
	}
	/**
	 * 获取：动物种类
	 */
	public String getDongwuzhonglei() {
		return dongwuzhonglei;
	}
	/**
	 * 设置：动物病征
	 */
	public void setDongwubingzheng(String dongwubingzheng) {
		this.dongwubingzheng = dongwubingzheng;
	}
	/**
	 * 获取：动物病征
	 */
	public String getDongwubingzheng() {
		return dongwubingzheng;
	}
	/**
	 * 设置：是否打过狂犬疫苗
	 */
	public void setShifoudaguokuangquanyimiao(String shifoudaguokuangquanyimiao) {
		this.shifoudaguokuangquanyimiao = shifoudaguokuangquanyimiao;
	}
	/**
	 * 获取：是否打过狂犬疫苗
	 */
	public String getShifoudaguokuangquanyimiao() {
		return shifoudaguokuangquanyimiao;
	}
	/**
	 * 设置：诊断结果
	 */
	public void setZhenduanjieguo(String zhenduanjieguo) {
		this.zhenduanjieguo = zhenduanjieguo;
	}
	/**
	 * 获取：诊断结果
	 */
	public String getZhenduanjieguo() {
		return zhenduanjieguo;
	}
	/**
	 * 设置：回访结果
	 */
	public void setHuifangjieguo(String huifangjieguo) {
		this.huifangjieguo = huifangjieguo;
	}
	/**
	 * 获取：回访结果
	 */
	public String getHuifangjieguo() {
		return huifangjieguo;
	}
	/**
	 * 设置：医生账号
	 */
	public void setYishengzhanghao(String yishengzhanghao) {
		this.yishengzhanghao = yishengzhanghao;
	}
	/**
	 * 获取：医生账号
	 */
	public String getYishengzhanghao() {
		return yishengzhanghao;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}

}
