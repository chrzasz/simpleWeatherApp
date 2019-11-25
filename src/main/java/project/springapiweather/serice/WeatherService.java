package project.springapiweather.serice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import project.springapiweather.model.Weather;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class WeatherService {

    public final String GET_ALL_URL ="http://api.openweathermap.org/data/2.5/weather?q=Poland&APPID=1b1d36fed375cf4d9a6718186114d158";

    private static RestTemplate restTemplate = new RestTemplate();

    public List<Weather> getAll(){
        return Arrays.stream(restTemplate.getForObject(GET_ALL_URL, Weather[].class))
                .collect(Collectors.toList());
    }

    }

