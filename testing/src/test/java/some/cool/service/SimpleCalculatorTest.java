package some.cool.service;

import com.payu.ratel.Discover;
import com.payu.ratel.tests.RatelTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import some.cool.stuff.CalculatorService;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@RatelTest(registerServices = CalcConf.class)
public class SimpleCalculatorTest {

    @Discover
    private CalculatorService calculatorService;

    @Test
    public void shouldCalculateSum() {
        //given
        final SumGame sumGame = new SumGame(calculatorService);

        //when
        final int sum = sumGame.simpleSum(4, 5);

        //then
        assertThat(sum).isEqualTo(9);
    }
}