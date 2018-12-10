package com.yoshallc.consumer.controller;

import com.yoshallc.consumer.controller.request.BookRequest;
import com.yoshallc.consumer.dto.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LIbraryController {

    @PostMapping("/checkout")
    public ResponseEntity<Book> checkoutBook(@RequestBody BookRequest bookRequest){

        Book book = new Book(1L,"Shade");

        return new ResponseEntity <>(book, HttpStatus.OK);

    }
}
