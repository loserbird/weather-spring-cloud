package com.loserbird.spring.cloud.weather.service;

import java.util.List;

import com.loserbird.spring.cloud.weather.vo.City;

/**
 * City Data Service.
 * 
 */
public interface CityDataService {

	/**
	 * 获取City列表
	 * @return
	 * @throws Exception
	 */
	List<City> listCity() throws Exception;
}
