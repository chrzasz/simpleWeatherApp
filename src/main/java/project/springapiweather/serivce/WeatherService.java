package project.springapiweather.serivce;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import project.springapiweather.model.WeatherForCity;


@Service
public class WeatherService {

    public final String GET_ALL_URL = "http://api.openweathermap.org/data/2.5/weather?q=Warszawa&APPID=1b1d36fed375cf4d9a6718186114d158";

    private static RestTemplate restTemplate = new RestTemplate();

    public WeatherForCity getWeather() {
        return restTemplate.getForObject(GET_ALL_URL, WeatherForCity.class);
    }

}

