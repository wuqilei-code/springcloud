package com.offcn.userweb01.util;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

   @Bean
    public Logger.Level getLoggerLevel(){

        return Logger.Level.FULL;
    }
}
