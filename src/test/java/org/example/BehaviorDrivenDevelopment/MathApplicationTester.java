package org.example.BehaviorDrivenDevelopment;

import static org.mockito.BDDMockito.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {
    private MathApplication mathApplication;
    private CalculatorService calcService;

    @Before
    public void setUp(){
        mathApplication = new MathApplication();
        calcService = mock(CalculatorService.class);
        mathApplication.setCalculatorService(calcService);
    }

    @Test
    public void testAdd(){

        //Given
        given(calcService.add(20.0,10.0)).willReturn(30.0);

        //when
        double result = calcService.add(20.0,10.0);

        //then
        Assert.assertEquals(result,30.0,0);
    }
}
