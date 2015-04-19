package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ITest.class, VTest.class, XTest.class, LTest.class, CTest.class, DTest.class, MTest.class, GivenTest.class})
public class AllTests {

}
