package com.dubbo.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

/**
 * @author : lgn
 * @date : 2022/3/23
 */
@SpringBootApplication
@Slf4j
public class ProviderApplication {

    public static void main(String[] args) throws Exception{

        ConfigurableApplicationContext application = SpringApplication.run(ProviderApplication.class, args);

        Environment env = application.getEnvironment();
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '{}' is running! Access URLs:\n\t" +
                        "Login: \thttp://{}:{}/SingleCell\n\t" +
                        "Doc: \thttp://{}:{}/SingleCell/swagger-ui.html\n" +
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));

        log.info("(♥◠‿◠)ﾉﾞ  启动成功！   ლ(´ڡ`ლ)ﾞ ");
    }

}
