package com.nuist.service.impl;

import com.nuist.service.TickerService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/5/17 18:25
 * @Description
 */

//服务注册与发现
@Service
@Component   // 使用了dubbo之后尽量不要使用service
public class TicketServiceImpl implements TickerService {
    @Override
    public String sellTicket() {
        return "java天下无敌";
    }
}
