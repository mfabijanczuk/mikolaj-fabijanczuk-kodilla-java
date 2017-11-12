package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.ShapeFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTest = factory.makeTask(TaskFactory.DRIVINGTASK);
        drivingTest.executeTask();
        //Then
        Assert.assertEquals("Jazda do dom za pomocą auto", drivingTest.toString());
        Assert.assertTrue(drivingTest.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertEquals("Sklep monopolowy - kupuję 3.0x piwo", shoppingTask.toString());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTest = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTest.executeTask();
        //Then
        Assert.assertEquals("Obraz : czarny słoń", paintingTest.toString());
        Assert.assertTrue(paintingTest.isTaskExecuted());
    }
}
