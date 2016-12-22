/* 
 * CheckAccount.java  
 * 
 * version v.1.2
 *
 * 2016年1月12日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.paytong.platform.acc.service;

import com.paytong.platform.acc.bean.ChannelBean;
import com.paytong.platform.acc.exception.InvalidChannelData;
import com.paytong.platform.acc.exception.SaveChannelDataException;

/**
 * 
 * 通道服务类
 *
 * @author Luxiaoshuai yangying
 * @version
 * @date 2016年1月12日 下午1:14:42
 * @since
 */
public interface ChannelService {
    /**
     *  Open account for channel and convert persist channel.
     * @param channel
     * @return the channel id
     * @throws InvalidChannelData
     * @throws SaveChannelDataException
     */
    public long addChannel(ChannelBean channel) throws InvalidChannelData, SaveChannelDataException;
}
