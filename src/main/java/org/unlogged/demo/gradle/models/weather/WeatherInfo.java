package org.unlogged.demo.gradle.models.weather;

import lombok.Data;

@Data
public class WeatherInfo {
    public Location location;
    public Current current;
}
