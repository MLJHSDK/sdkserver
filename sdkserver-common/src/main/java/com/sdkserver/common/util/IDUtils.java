package com.sdkserver.common.util;

import com.sdkserver.common.log.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.Random;

/**
 * 各种id生成策略
 * <p>Title: IDUtils</p>
 * <p>Description: </p>
 * @author	Eric Chan
 * @date	2018年9月12日下午2:32:10
 * @version 1.0
 */

public class IDUtils {

	@Value("${define.generator.game}")
	private String CHANNEL_ID;
	/**
	 * @Description 用单机Redis生成id，相关配置参数
	 * @Date 2018/9/14 21:42
	 */

	//开始计数的number
	private static final Integer number = 1;
    //ip
	private static final String URL = "172.16.20.140";
    //端口
	private static final Integer port =6379;

	/**
	 * 图片名生成
	 */
	public static String getImageName() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime();
		//加上三位随机数
		Random random = new Random();
		int end3 = random.nextInt(999);
		//如果不足三位前面补0
		String str = millis + String.format("%03d", end3);
		
		return str;
	}
	
	/**
	 * 时间戳id生成
	 */
	public static long TID() {
		//取当前时间的长整形值包含毫秒
		long millis = System.currentTimeMillis();
		//long millis = System.nanoTime();
		//加上两位随机数
		Random random = new Random();
		int end2 = random.nextInt(99);
		//如果不足两位前面补0
		String str = millis + String.format("%02d", end2);
		long id = new Long(str);
		return id;
	}

	/**
	 * Redis 生成的Id
	 */
	public static long RID(String str){

		//连接本地的 Redis 服务
		Jedis jedis = new Jedis(URL,port);

		jedis.incrBy(str,number);
		String rid = jedis.get(str);

		return new Long(rid);

	}


	public String cs(){
		return CHANNEL_ID;
	}
	public static void main(String[] args) {
		for(int i=0;i< 100;i++)

		Log.d("generator: "+RID("GAME_ID"));
	}
}
