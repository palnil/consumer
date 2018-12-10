package com.yoshallc.consumer.service;

import com.yoshallc.consumer.dto.Book;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    public Book findBook(String name){

        Book book = new Book(1L,"Shade");
        return book;
    }
}
