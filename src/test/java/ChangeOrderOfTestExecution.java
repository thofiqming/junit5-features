import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// By Default alphanumeric
// if 2 or more methods has same order then fall back to alphanumeric test execution for those methods
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ChangeOrderOfTestExecution {

    @Test
    public void testMethodWhichRunAtLastDueToOrder(){

    }

    @Test
    @Order(2)
    public void method1(){

    }

    @Test
    @Order(3)
    public void method2(){

    }

    @Test
    @Order(1)
    public void method3(){

    }

}
