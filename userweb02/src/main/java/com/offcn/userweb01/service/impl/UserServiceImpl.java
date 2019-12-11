package com.offcn.userweb01.service.impl;

import com.offcn.userweb01.pojo.User;
import com.offcn.userweb01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    //远程服务调用客户端
    @Autowired
    RestTemplate restTemplate;

    String url="http://PROVIDER01/user";
  /*  //Eureka客户端
    @Autowired
    LoadBalancerClient loadBalancerClient;
    *//***
     * 通过客户端负载均衡器获取生产者服务器基础地址
     * @return
     *//*
    public String url {
        //通过客户端调用器查找指定服务
        ServiceInstance inst = loadBalancerClient.choose("PROVIDER01");
        //获取第一个服务器

        //获取服务提供者服务器ip、端口号
        String ip = inst.getHost();
        int port = inst.getPort();
        //拼接调用地址
        String url="http://"+ip+":"+port+"/user";
        return url;
    }*/
    @Override
    public Map getUserMap() {
        Map map = restTemplate.getForObject(url+"/getall", Map.class);
        return map;
    }

    @Override
    public void createUser(User user) {

        restTemplate.postForObject(url+"/save", user,String.class);

    }

    @Override
    public User getUser(Long id) {

        return restTemplate.getForObject(url+"/get/"+id, User.class);
    }

    @Override
    public void updateUser(Long id, User user) {
        restTemplate.put(url+"/update/"+id, user);

    }

    @Override
    public void deleteUser(Long id) {
        restTemplate.delete(url+"/delete/"+id);
    }
}
