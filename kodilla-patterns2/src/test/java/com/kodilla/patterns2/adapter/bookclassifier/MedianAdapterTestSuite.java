package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book bookA1 = new Book("Mikołaj", "Book1", 2000, "12345");
        Book bookA2 = new Book("Piotr" , "Book2", 2010, "12346");
        Book bookA3 = new Book("Adam", "Book3", 2005, "12347");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(bookA1);
        bookSet.add(bookA2);
        bookSet.add(bookA3);

        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(2005, median);
    }
}
