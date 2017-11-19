package com.kodilla.kodillahibernate.tasklist.dao;

import com.kodilla.kodillahibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "In Progress";



    @Test
    public void testTaskDaoFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "Zadanie w trakcie wykonywania");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasks = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals("In Progress", readTasks.get(0).getListName());

        //CleanUp
        //int id = readTasks.get(0).getId();
        //taskList.delete(id);
    }
}


