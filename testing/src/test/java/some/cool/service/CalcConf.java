package some.cool.service;

import com.payu.ratel.config.EnableServiceDiscovery;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.web.WebAppConfiguration;
import some.cool.stuff.CalculatorService;

@Configuration
@EnableAutoConfiguration
@EnableServiceDiscovery
@WebAppConfiguration
public class CalcConf {

    @Bean
    public CalculatorService calcService() {
        return new SimpleCalculator();
    }

}
