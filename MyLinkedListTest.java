
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *
 */
public class MyLinkedListTest {

    public MyLinkedListTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    /**
     * Test of next method, of class MyLinkedList.
     */
    @Test
    public void testNext() {
        System.out.println("next");
        MyLinkedList test = new MyLinkedList(3);
        int expecteds = 3;
        test.next();
        assertEquals(expecteds, test.get());
    }

    /**
     * Test of last method, of class MyLinkedList.
     */
    @Test
    public void testLast() {
        System.out.println("last");
        MyLinkedList test = new MyLinkedList(3);
        int expecteds = 3;
        test.last();
        assertEquals(expecteds, test.get());

    }

    /**
     * Test of after method, of class MyLinkedList.
     */
    @Test
    public void testAfter() {
        System.out.println("after");
        MyLinkedList test = new MyLinkedList(3);
        int expecteds = 3;
        test.after(6);
        assertEquals(expecteds, test.get());
    }

    /**
     * Test of detach method, of class MyLinkedList.
     */
    @Test
    public void testDetach() {
        System.out.println("detach");
        MyLinkedList test = new MyLinkedList(3);
        int expecteds = 3;
        test.detach();
        assertEquals(expecteds, test.get());
    }

    /**
     * Test of get method, of class MyLinkedList.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        MyLinkedList test = new MyLinkedList(3);
        int expecteds = 3;
        assertEquals(expecteds, test.get());
    }

    /**
     * Test of set method, of class MyLinkedList.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        MyLinkedList test = new MyLinkedList();
        int expected = 6;
        test.set(6);
        assertEquals(expected, test.get());
    }

    /**
     * Test of setNext method, of class MyLinkedList.
     */
    @Test
    public void testSetNext_ILinkedList() {
        System.out.println("setNext");
        MyLinkedList test = new MyLinkedList(4);
        int expecteds = 4;
         test.setNext(test);
         assertEquals(expecteds, test.get());
    }

    /**
     * Test of append method, of class MyLinkedList.
     */
    @Test
    public void testAppend() {
        System.out.println("append");
        MyLinkedList test = new MyLinkedList(3);
        int expecteds = 3;
        test.append(test);
        assertEquals(expecteds, test.get());

    }

    /**
     * Test of insert method, of class MyLinkedList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        MyLinkedList test = new MyLinkedList(3);
        int expecteds = 3;
        test.insert(test);
        assertEquals(expecteds, test.get());


    }

    /**
     * Test of setNext method, of class MyLinkedList.
     */
    @Test
    public void testSetNext_int() {
        System.out.println("setNext");
        MyLinkedList test = new MyLinkedList(3);
        test.setNext(test);
        int expecteds = 3;
        assertEquals(expecteds, test.get());
    }

}
