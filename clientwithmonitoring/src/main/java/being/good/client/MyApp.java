package being.good.client;

import com.payu.ratel.config.EnableServiceDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableServiceDiscovery
public class MyApp {

    public static void main(final String[] args) {
        final SpringApplication app = new SpringApplication(MyApp.class);
        app.setWebEnvironment(false);
        final ConfigurableApplicationContext ctx = app.run(args);

        final SumGame sumGame = ctx.getBean(SumGame.class);
        sumGame.playConsoleGame();

        ctx.close();
    }

}
