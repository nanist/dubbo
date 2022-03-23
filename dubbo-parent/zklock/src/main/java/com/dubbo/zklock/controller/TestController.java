package com.dubbo.zklock.controller;

import com.dubbo.zklock.config.DistributedLockByCurator;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ljl
 * @date : 2019/9/20
 */
@RestController
@RequestMapping("/zklock")
public class TestController {

    @Autowired
    DistributedLockByCurator distributedLockByCurator;

    String path = "testlock";

    @RequestMapping("/lock1")
    public Object test1() throws InterruptedException {

        distributedLockByCurator.acquireDistributedLock(path);

        long d1=System.currentTimeMillis();
        int i=0;
        while (i<10){
            Thread.sleep(1000);
            i++;
            System.out.println("lock1---i="+i);
        }

        distributedLockByCurator.releaseDistributedLock(path);
        return "1";
    }

    @RequestMapping("/lock2")
    public Object test2() throws InterruptedException {
        distributedLockByCurator.acquireDistributedLock(path);

        int i=0;
        while (i<5){
            Thread.sleep(1000);
            i++;
            System.out.println("lock2---i="+i);
        }

        distributedLockByCurator.releaseDistributedLock(path);
        return "2";
    }
}
