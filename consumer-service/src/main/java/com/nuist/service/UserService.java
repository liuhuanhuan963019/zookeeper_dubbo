package com.nuist.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


/**
 * @author liuhuanhuan
 * @version 1.0
 * @date 2022/5/17 18:27
 * @Description
 */
@Service  // 放入容器中
public class UserService {
    // 想拿到provider-service里面的数据
    // 需要去注册中心拿取数据
    @Reference // 引用  pom坐标，可以定义路径相同接口名
    TickerService tickerService;

    public void getTicket() {
        String s = tickerService.sellTicket();
        System.out.println(s);
    }

}
