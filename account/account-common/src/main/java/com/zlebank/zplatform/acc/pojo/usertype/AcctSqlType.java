/* 
 * AcctSqlType.java  
 * 
 * version TODO
 *
 * 2015年8月24日 
 * 
 * Copyright (c) 2015,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.acc.pojo.usertype;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;

import com.paytong.platform.acc.bean.enums.AcctElementType;
import com.paytong.platform.acc.bean.enums.AcctType;
import com.zlebank.zplatform.member.commons.enums.BaseEnumSqlType;

/**
 * Class Description
 *
 * @author Luxiaoshuai
 * @version
 * @date 2015年8月24日 下午6:10:00
 * @since 
 */
public class AcctSqlType extends BaseEnumSqlType<AcctElementType>{
    @Override
    public Object nullSafeGet(ResultSet rs, String[] names, SessionImplementor arg2,Object owner)
            throws HibernateException, SQLException {
        return AcctType.fromValue(rs.getString(names[0]));
    }

    @Override
    public void nullSafeSet(PreparedStatement st, Object value, int index,SessionImplementor arg2)
            throws HibernateException, SQLException {
        AcctType status = value!=null?(AcctType)value:AcctType.UNKNOW;
        st.setString(index, status.getCode());
    }
}
