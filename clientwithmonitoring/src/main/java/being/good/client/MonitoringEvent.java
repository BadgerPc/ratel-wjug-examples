package being.good.client;

import com.payu.ratel.context.RemoteServiceCallEvent;
import com.payu.ratel.context.RemoteServiceCallListener;
import com.payu.ratel.context.RemoteServiceResponseEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MonitoringEvent implements RemoteServiceCallListener {

    private static final Logger logger = LoggerFactory.getLogger(MonitoringEvent.class);

    @Override
    public void remoteServiceCalled(final RemoteServiceCallEvent event) {
        logger.info("{}", event.toString());
    }

    @Override
    public void remoteServiceResponded(final RemoteServiceResponseEvent event) {
        logger.info("{}", event.toString());
    }

}
