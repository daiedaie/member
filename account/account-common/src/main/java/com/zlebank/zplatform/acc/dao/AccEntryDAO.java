/* 
 * AccEntryDAO.java  
 * 
 * version TODO
 *
 * 2015年8月31日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.acc.dao;
import java.util.HashMap;
import java.util.List;

import com.paytong.platform.acc.bean.AccEntryQuery;
import com.paytong.platform.acc.bean.enums.EntryEvent;
import com.zlebank.zplatform.acc.pojo.PojoAccEntry;
import com.zlebank.zplatform.member.commons.dao.BasePagedQueryDAO;

/**
 * Class Description
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年8月31日 下午5:12:00
 * @since 
 */
public interface AccEntryDAO  extends BasePagedQueryDAO<PojoAccEntry,AccEntryQuery> {
	/**
	 * 得到指定主键的记录
	 * @param id
	 * @return
	 */
	public PojoAccEntry get(long id);

	/**得到锁定的记录
	 * @param fetchSize 一次锁定的条数
	 * @return 锁定记录的所有id
	 */
	public List<PojoAccEntry> getLockRecords(int fetchSize);

	/**
	 * 锁定指定记录
	 * @param fetchSize
	 * @return 
	 */
	public PojoAccEntry getByIdForUpdate(long voucherCode);

   /**
    * 根据交易流水号,交易类型,分录事件得到分录流水
    * @param txnseqno
    * @param busiCode
    * @param entryEvent
    * @return
    */
    public List<PojoAccEntry> getByTxnNo(String txnseqno, String busiCode, EntryEvent entryEvent);

    /**条件分页查询
     * @param offset
     * @param pageSize
     * @param example
     * @return
     */
    public List<HashMap<String, Object>> getItem(int offset,
            int pageSize,
            AccEntryQuery example);

    /**
     * 条件分页查询
     * @param example
     * @return
     */
    public long total(AccEntryQuery example);
    
}
