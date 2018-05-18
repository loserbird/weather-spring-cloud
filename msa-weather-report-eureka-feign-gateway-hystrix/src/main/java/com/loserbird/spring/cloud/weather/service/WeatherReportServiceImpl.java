package com.loserbird.spring.cloud.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loserbird.spring.cloud.weather.vo.Weather;
import com.loserbird.spring.cloud.weather.vo.WeatherResponse;

/**
 * Weather Report Service.
 * 
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
	@Autowired
	private DataClient dataClient;
	@Override
	public Weather getDataByCityId(String cityId) {
		
		// 由天气数据API微服务来提供
		WeatherResponse resp = dataClient.getDataByCityId(cityId);
		Weather data = null;
		if (resp != null ) {
			resp.getData();
		}
		return data;
	}

}
