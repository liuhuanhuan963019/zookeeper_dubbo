package com.nuist;

import com.nuist.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsumerServiceApplicationTests {
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        userService.getTicket();
    }

}
