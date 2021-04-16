import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class Task1Test extends TestCase {
    private Task1 task1;
    @Test
    public void test1Method1() {
        task1 = new Task1();
        int[] mas = {1 , 2 , 3 , 4 , 5 , 6};
        int[] expected = {5 , 6};
        Assert.assertArrayEquals( expected, task1.method1(mas));
    }
    @Test
    public void test2Method1() {
        task1 = new Task1();
        int[] mas = {1 , 2 , 3 , 9 , 3 , 6};
        int[] expected = {3 , 6};
        Assert.assertArrayEquals( expected, task1.method1(mas));
    }
    @Test
    public void test3Method1() {
        task1 = new Task1();
        int[] mas = {1 , 4 , 4 , 4 , 5 , 6};
        int[] expected = {5 , 6};
        Assert.assertArrayEquals( expected, task1.method1(mas));
    }

}