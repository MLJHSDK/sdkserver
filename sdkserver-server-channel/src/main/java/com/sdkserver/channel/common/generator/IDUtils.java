package com.sdkserver.channel.common.generator;

import com.sdkserver.channel.common.redis.RedisTemplateUtil;
import com.sdkserver.common.log.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
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
@Component
public class IDUtils {

	@Value("${define.id.name}")
	private String CHANNEL_ID;

	@Value("${define.id.number}")
	private Integer NUMBER;

	@Resource
	private RedisTemplateUtil redisTemplateUtil;
	/**
	 * @Description 用单机Redis生成id，相关配置参数
	 * @Date 2018/9/14 21:42
	 */
	public synchronized long RID(){

		//连接本地的 Redis 服务
		redisTemplateUtil.incr(CHANNEL_ID,NUMBER);
		String rid = redisTemplateUtil.get(CHANNEL_ID).toString();

		return new Long(rid);

	}


}
