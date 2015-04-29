package com.gazatem.spinny.controller;

import com.gazatem.spinny.domain.Book;
import com.gazatem.spinny.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Scope("view")
public class BookBean {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
