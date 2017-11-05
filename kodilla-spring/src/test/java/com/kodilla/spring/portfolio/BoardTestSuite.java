package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().getTasks().add("Task to do");
        board.getInProgressList().getTasks().add("Task in progress");
        board.getDoneList().getTasks().add("Task done");

        //When
        String nameToDo = board.getToDoList().tasks.get(0);
        String nameInProgress = board.getInProgressList().tasks.get(0);
        String nameDone = board.getDoneList().tasks.get(0);

        //Then
        Assert.assertEquals("Task to do", nameToDo);
        Assert.assertEquals("Task in progress", nameInProgress);
        Assert.assertEquals("Task done", nameDone);
    }

}
