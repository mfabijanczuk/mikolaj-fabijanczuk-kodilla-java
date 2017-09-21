package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public final List<ForumUser> listOfUsers = new ArrayList<>();

    public Forum(){
        listOfUsers.add(new ForumUser(001,"Mikołaj",'M', LocalDate.of(1989,3,9), 100 ));
        listOfUsers.add(new ForumUser(002,"Paweł",'M', LocalDate.of(2000,3,9), 100 ));
        listOfUsers.add(new ForumUser(003,"Justyna",'F', LocalDate.of(1999,3,9), 100 ));
        listOfUsers.add(new ForumUser(004,"Asia",'F', LocalDate.of(1999,3,9), 0 ));
        listOfUsers.add(new ForumUser(005,"Piotr",'M', LocalDate.of(1985,3,9), 100 ));
        listOfUsers.add(new ForumUser(006,"Kasia",'F', LocalDate.of(2000,3,9), 100 ));
        listOfUsers.add(new ForumUser(007,"Basia",'F', LocalDate.of(1997,3,9), 100 ));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfUsers);
    }
}
