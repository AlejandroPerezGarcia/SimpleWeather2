package cl.desafiolatam.simpleweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import cl.desafiolatam.simpleweather.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        DailyWeather dailyWeather = new DailyWeather("Santiago","20/10/2020","","39","ªC");
        mainBinding.setDailyWeather(dailyWeather);
    }
}
