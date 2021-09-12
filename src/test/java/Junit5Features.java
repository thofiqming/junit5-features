import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Junit5Features {

    @BeforeAll
    static public void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static public void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void setUp() {
        System.out.println("before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after each");
    }

    // exception scenario
    @Test()
    void whenInvalidArgumentThrowException() {
        MathUtil mathUtil = new MathUtil();
        assertThrows(ArithmeticException.class, () -> mathUtil.divide(1, 0), "Exception divide by 0");
    }

    // pass supplier in case of hard coded string error message
    @Test()
    void usingSupplierInAssertTest() {
        MathUtil mathUtil = new MathUtil();
        assertEquals(1, mathUtil.divide(2, 2), () -> "error message");
    }

    //can group similar test in one class
    @Nested
    class NestedClass {
        @Test
        public void test1(){}
    }

    //repeating test for multiple times with repetition info
    @RepeatedTest(2)
    public void repeatedTest(RepetitionInfo repetitionInfo){
        System.out.println(repetitionInfo.getCurrentRepetition());
    }

}
