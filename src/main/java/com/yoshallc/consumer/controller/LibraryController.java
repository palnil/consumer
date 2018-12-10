package com.yoshallc.consumer.controller;

import com.yoshallc.consumer.controller.request.BookRequest;
import com.yoshallc.consumer.dto.Book;
import com.yoshallc.consumer.service.LibraryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    private LibraryService libraryService;

    public LibraryController(LibraryService libraryService){

        this.libraryService = libraryService;
    }

    @PostMapping("/checkout")
    public ResponseEntity<Book> checkoutBook(@RequestBody BookRequest bookRequest){

        return new ResponseEntity <>(libraryService.findBook(bookRequest.getName()), HttpStatus.OK);

    }
}
