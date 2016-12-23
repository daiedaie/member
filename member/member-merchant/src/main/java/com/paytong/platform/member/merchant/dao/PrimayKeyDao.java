package com.paytong.platform.member.merchant.dao;

import com.paytong.platform.member.merchant.pojo.PojoPrimayKey;
import com.zlebank.zplatform.member.commons.dao.BaseDAO;

public interface PrimayKeyDao extends BaseDAO<PojoPrimayKey>{

	/**
	 * 
	 * 查询主键值
	 * **/
	PojoPrimayKey getNextID(String keyname);
	
	/**
	 * 
	 * 更新主键
	 * 
	 * **/
	void updateNest(long nextId,long increment,String keyname);
}
