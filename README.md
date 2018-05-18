### pratise spring cloud with a small project that get some weather information.
### learn from imooc website
### project structure

- micro-weather-report: a complete project include a page to search the weather.
- msa-weather-city-eureka: a microservice project to provide city data service.
- msa-weather-collection-eureka-feign: a microservice project to sync data to redis at fixed period
- msa-weather-data-eureka: a microservice project to obtain weather data
- msa-weather-eureka-client-zuul: a microservice gateway to expose some url as a facade.
- msa-weather-report-eureka-feign-gateway-hystrix: a microservice client to get weather information by call msa-weather-eureka-client-zuul.
- micro-weather-config-server: a microservice config server
- micro-weather-config-client: a microservice config client demo.
- config-repo: a config directory

