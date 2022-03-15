package com.melprobe.tdd;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.melprobe.tdd.calculator.CalculatorTest;
import com.melprobe.tdd.hello.HelloWorldTest;
import com.melprobe.tdd.hello.StringUtilsTest;

@RunWith(Suite.class)
@SuiteClasses({
    CalculatorTest.class,
    HelloWorldTest.class,
    StringUtilsTest.class
})
public class AllTests {

}
