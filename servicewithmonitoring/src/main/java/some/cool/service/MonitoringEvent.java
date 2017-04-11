package some.cool.service;

import com.payu.ratel.context.ServiceInstanceCallEvent;
import com.payu.ratel.context.ServiceInstanceCallListener;
import com.payu.ratel.context.ServiceInstanceResponseEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MonitoringEvent implements ServiceInstanceCallListener {

    private static final Logger logger = LoggerFactory.getLogger(MonitoringEvent.class);

    @Override
    public void serviceInstanceCalled(final ServiceInstanceCallEvent event) {
        logger.info("{}", event.toString());
    }

    @Override
    public void serviceInstanceResponded(final ServiceInstanceResponseEvent event) {
        logger.info("{}", event.toString());
    }
}
