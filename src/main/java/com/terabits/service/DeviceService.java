package com.terabits.service;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public interface DeviceService {
	
	/**
	 * 获取用户可管理的设备id
	 * @param name
	 * @param type
	 * @return
	 */
	public List<String> getDisplayIdByAdmin(String name, int type);
	
	/**
	 * 获取设备信息，包括设备数，当日（月）供水总量，当日（月）收入
	 * @param name 用户账号名
	 * @param type 用户类型
	 * @return
	 */
	public JSONObject getDeviceInfo(String name, int type);
	
	/**
	 * 获取设备供水信息，包括设备编号，设备位置，取水金额，取水量，取水时间
	 * @param name
	 * @param type
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	public JSONArray getDeviceSupplyRecord(String name, int type, String beginTime, String endTime);
	
	/**
	 * 获取设备断线报警信息，包括设备编号，设备位置，sim卡号，imei卡号，最后连接时刻，断线时长
	 * @param name
	 * @param type
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	public JSONArray getDeviceOfflineAlarm(String name, int type, String beginTime, String endTime);
	
}