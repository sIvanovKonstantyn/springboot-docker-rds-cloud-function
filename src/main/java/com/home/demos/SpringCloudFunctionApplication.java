package com.home.demos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@SpringBootApplication
public class SpringCloudFunctionApplication {

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(
                SpringCloudFunctionApplication.class, args);
    }

    @Bean
    public Supplier<List<Book>> findAll() {
        return bookRepository::findAll;
    }

    @Bean
    public Function<String, List<Book>> findByName() {
        return input -> bookRepository.findAll().stream()
                .filter(book -> book.getName().equals(input))
                .collect(Collectors.toList());
    }

    @Bean
    public Consumer<Book> save() {
        return bookRepository::save;
    }
}
