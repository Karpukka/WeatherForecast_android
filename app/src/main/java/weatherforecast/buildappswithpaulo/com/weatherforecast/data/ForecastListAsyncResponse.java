package weatherforecast.buildappswithpaulo.com.weatherforecast.data;

import java.util.ArrayList;

import weatherforecast.buildappswithpaulo.com.weatherforecast.model.Forecast;

/**
 * Created by paulodichone on 11/17/17.
 */

public interface ForecastListAsyncResponse {
    void processFinished(ArrayList<Forecast> forecastArrayList);
}
