package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdate(){
        //Given
        TaskQueue taskQueue1 = new TaskQueue("Java");
        TaskQueue taskQueue2 = new TaskQueue("Spring");
        TaskQueue taskQueue3 = new TaskQueue("Patterns");
        Mentor adrian = new Mentor("Adrian");
        Mentor paweł = new Mentor("Paweł");
        taskQueue1.registerObserver(adrian);
        taskQueue2.registerObserver(adrian);
        taskQueue3.registerObserver(adrian);
        taskQueue1.registerObserver(paweł);
        taskQueue2.registerObserver(paweł);

        //When
        taskQueue1.addTask("Task 1");
        taskQueue1.addTask("Task 2");
        taskQueue1.addTask("Task 3");
        taskQueue2.addTask("Task 1");
        taskQueue2.addTask("Task 2");
        taskQueue2.addTask("Task 3");
        taskQueue2.addTask("Task 4");
        taskQueue3.addTask("Task 1");
        taskQueue3.addTask("Task 2");

        //Then
        assertEquals(9, adrian.getUpdateCount());
        assertEquals(7, paweł.getUpdateCount());
    }
}
