import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.relex.MyArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyArrayListTest {
    MyArrayList myArrayList;

    @BeforeEach
    void prepareData(){
        myArrayList = new MyArrayList();
    }

    @Test
    public void testAddMethod(){
        myArrayList.add(10);
        myArrayList.add(20);


        assertEquals(10,myArrayList.list[0]);
        assertEquals(20,myArrayList.list[1]);
        assertEquals(2,myArrayList.size);
    }
    @Test
    public void testRemoveMethod(){
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(30);


        myArrayList.remove(1);

        assertEquals(10,myArrayList.list[0]);
        assertEquals(30,myArrayList.list[1]);

    }
}
