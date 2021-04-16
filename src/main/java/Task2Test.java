import junit.framework.TestCase;
import org.junit.Assert;

public class Task2Test extends TestCase {
    private Task2 task2;
    public void test1Method2() {
        task2 = new Task2();
        int[] mas = {1 , 1 , 1 , 4 , 4 , 1 , 4 , 4};
        Assert.assertEquals(true , task2.method2(mas));
    }
    public void test2Method2() {
        task2 = new Task2();
        int[] mas = {1 , 1 , 1 };
        Assert.assertEquals(false , task2.method2(mas));
    }
    public void test3Method2() {
        task2 = new Task2();
        int[] mas = {4 , 4 , 4 , 4};
        Assert.assertEquals(false , task2.method2(mas));
    }
}