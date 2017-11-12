package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVINGTASK = "DRIVING";
    public static final String PAINTINGTASK = "PAINTING";
    public static final String SHOPPINGTASK = "SHOPPING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Jazda", "dom", "auto");
            case PAINTINGTASK:
                return new PaintingTask("Obraz", "czarny", "słoń");
            case SHOPPINGTASK:
                return new ShoppingTask("Sklep monopolowy","piwo",3);
            default:
                return null;
        }
    }

}
