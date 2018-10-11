package moh;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Muhammad Umair
 */

class ToDoTaskListTest {
    Date date;
    ToDoTaskList instance;

    public ToDoTaskListTest() {
    }


    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    /**
     * Test of getTaskList method, of class ToDoTaskList.
     */
    @Test
    public void testGetTaskList() {
        date = new Date();
        System.out.println("getNewProjectName");
        instance = new ToDoTaskList("My New Project", date, "project");
        String expResult = "My New Project";
        String result = instance.getTaskList();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProjectName method, of class ToDoTaskList.
     */
    @Test
    public void testGetProjectName() {
        System.out.println("getProjectName");
        date = new Date();
        instance = new ToDoTaskList("My New Project", date, "New Project");
        String expResult = "New Project";
        String result = instance.getProjectName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class ToDoTaskList.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getDate");
        date = new Date();
        instance = new ToDoTaskList("", date, "");
        boolean expResult = false;
        boolean result = instance.getStatus();
        assertEquals(expResult, result);
    }
}