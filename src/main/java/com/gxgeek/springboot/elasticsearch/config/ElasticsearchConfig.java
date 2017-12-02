package com.gxgeek.springboot.elasticsearch.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author yujiansong
 *	  @date 2017年12月3日
 */
@Configuration
public class ElasticsearchConfig {

    @Bean
    public TransportClient client() throws UnknownHostException {
        Settings settings = Settings.builder()
                .put("cluster.name", "sun").build();
        TransportClient client = new PreBuiltTransportClient(settings)
                .addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));
        
        return client;
    }
//    @Bean
//    public FilterRegistrationBean someFilterRegistration() {
//        FilterRegistrationBean registration = new FilterRegistrationBean();
//        registration.setFilter(new HttpPutFormContentFilter());
//        registration.addUrlPatterns("/*");
//        registration.setName("HttpMethodFilter");
//        return registration;
//    }



}
