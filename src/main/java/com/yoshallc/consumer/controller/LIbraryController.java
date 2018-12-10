package com.yoshallc.consumer.controller;

import com.yoshallc.consumer.controller.request.BookRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

@RestController
public class LIbraryController {

    @PostMapping("/checkout")
    public ResponseEntity<Book> checkoutBook(@RequestBody BookRequest bookRequest){

        Book book = new Book();

        return new ResponseEntity <>(book, HttpStatus.OK);

    }
}
