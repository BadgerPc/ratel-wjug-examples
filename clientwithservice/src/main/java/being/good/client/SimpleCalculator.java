package being.good.client;

import com.payu.ratel.Publish;
import org.springframework.stereotype.Service;
import some.cool.stuff.CalculatorService;

@Publish @Service
public class SimpleCalculator implements CalculatorService {

    @Override
    public int add(final int a, final int b) {
        System.out.printf("calculating sum for numbers %d %d\n", a, b);
        return a+b;
    }

}
