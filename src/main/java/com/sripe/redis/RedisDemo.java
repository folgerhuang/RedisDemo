package com.sripe.redis;

import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by SHIYU on 2016/9/5.
 */
public class RedisDemo {
    @Test
    public void searchDemo() {
        //single node
        /*Jedis jedis = new Jedis("n1");
//        jedis.auth("foobared");
        jedis.set("name", "石宇");
        jedis.set("java", "Java hello world");
        String name = jedis.get("name");
        System.out.println(name);*/

        //search cluster

        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        HostAndPort node1 = new HostAndPort("n1",7000);
        nodes.add(node1);
        HostAndPort node2 = new HostAndPort("n1",7001);
        nodes.add(node2);
        HostAndPort node3 = new HostAndPort("n1",7002);
        nodes.add(node3);
        HostAndPort node4 = new HostAndPort("n1",7003);
        nodes.add(node4);
        HostAndPort node5 = new HostAndPort("n1",7004);
        nodes.add(node5);
        HostAndPort node6 = new HostAndPort("n1",7005);
        nodes.add(node6);
        JedisCluster jedisCluster = new JedisCluster(nodes,5000,10000);//解决redis.clients.jedis.exceptions.JedisClusterMaxRedirectionsException: Too many Cluster redirections
//        jedisCluster.auth("foobared");
        jedisCluster.set("xxx", "bar");
        String foo = jedisCluster.get("xxx");
        System.out.println(foo);

       /* Set<HostAndPort> jedisClusterNodes = new HashSet<HostAndPort>();
//Jedis Cluster will attempt to discover cluster nodes automatically
        HostAndPort node1 = new HostAndPort("n1",7000);
        jedisClusterNodes.add(node1);
        HostAndPort node2 = new HostAndPort("n1",7001);
        jedisClusterNodes.add(node2);
        HostAndPort node3 = new HostAndPort("n1",7002);
        jedisClusterNodes.add(node3);
        HostAndPort node4 = new HostAndPort("n1",7003);
        jedisClusterNodes.add(node4);
        HostAndPort node5 = new HostAndPort("n1",7004);
        jedisClusterNodes.add(node5);
        HostAndPort node6 = new HostAndPort("n1",7005);
        jedisClusterNodes.add(node6);
        JedisCluster jc = new JedisCluster(jedisClusterNodes);
        //jc.set("foo", "bar");
        String value = jc.get("name");
        System.out.println(value);*/
    }



}
