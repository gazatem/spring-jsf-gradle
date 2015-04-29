package com.gazatem.spinny.repository;

import com.gazatem.spinny.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>{
}
