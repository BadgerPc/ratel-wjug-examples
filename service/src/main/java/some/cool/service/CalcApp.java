package some.cool.service;

import com.payu.ratel.config.EnableServiceDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceDiscovery
public class CalcApp {

    public static void main(final String[] args) {
        SpringApplication.run(CalcApp.class, args);
    }

}
