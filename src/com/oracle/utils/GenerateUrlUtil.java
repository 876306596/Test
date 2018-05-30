package com.oracle.utils;

import java.util.HashMap;
import java.util.Map;

import com.oracle.assistutils.MD5;

import net.sf.json.JSONObject;

/**
 * 生成测试URL
 * @author tongxingyi
 *
 */
public class GenerateUrlUtil {
	
	// 服务器IP地址和Tomcat端口
	private static final String IP = "http://117.36.53.108:8191/";
	
	// 接口访问路径
	private static String path = "JYAppServerNew/apps/queryxajj/queryVehicleOrDlicence";
	
	// 主方法，生成测试URL
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("JYBH", "610643");
		map.put("CXLB", "zhcx");
		map.put("CXTJ", "6042");
		JSONObject jsonStr = JSONObject.fromObject(map);
		String token = MD5.md5(jsonStr.toString());
		StringBuilder sb = new StringBuilder(IP);
		sb.append(path);
		sb.append("?jsonStr=" + jsonStr + "&token=" + token);
		System.out.println(sb.toString());

	}
	
	//新增方法

}
