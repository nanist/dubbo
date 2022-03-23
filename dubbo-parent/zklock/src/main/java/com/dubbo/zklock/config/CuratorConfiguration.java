package com.dubbo.zklock.config;

/**
 * @author : lgn
 * @date : 2022/3/23
 */
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryNTimes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CuratorConfiguration {

    private int retryCount=5;
    private int elapsedTimeMs=5000;
    private String connectString="192.168.2.31:2181";
    private int sessionTimeoutMs=60000;
    private int connectionTimeoutMs=5000;

    @Bean(initMethod = "start")
    public CuratorFramework curatorFramework() {
        return CuratorFrameworkFactory.newClient(
                connectString,
                sessionTimeoutMs,
                connectionTimeoutMs,
                new RetryNTimes(retryCount, elapsedTimeMs));
    }
}

