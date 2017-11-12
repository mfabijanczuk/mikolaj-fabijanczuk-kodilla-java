package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean isTaskExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        this.isTaskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskExecuted;
    }

    @Override
    public String toString() {
        return taskName + " - kupuję " + quantity + "x " + whatToBuy;
    }
}
