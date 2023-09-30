package com.bhuvnesh.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BookController2
{
    @RequestMapping(value = {"/getDummyBook", "/getDefaultBook"},
                    method = RequestMethod.GET)

    public Book getDefaultBook2()
    {
        Book book = new Book("Malice",
                                2,
                         "A revenge story set in Japan",
                            "Keigo Higashino");
        return book;
    }

    @PostMapping(value = {"/books/create"},
                 consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Book createBook(@RequestBody Book book)
    {
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getDescription());
        return book;
    }

    @PutMapping(value = {"/books/update/{id}"})
    public ResponseEntity<Book> updateBook(@PathVariable int id,
                                           @RequestBody Book bookToUpdate)
    {
        bookToUpdate.setId(id);
        System.out.println(bookToUpdate.getName());
        System.out.println(bookToUpdate.getId());
        System.out.println(bookToUpdate.getAuthor());
        System.out.println(bookToUpdate.getDescription());
        return ResponseEntity.ok(bookToUpdate);
    }

    @DeleteMapping(value = {"/books/delete/{id}"})
    public ResponseEntity<String> deleteBook(@PathVariable int id)
    {
        System.out.println(id);
        return ResponseEntity.ok("Book Deleted Successfully");
    }

    @GetMapping(value = "/books/{id}/{name}/{description}/{author}")
    public ResponseEntity<Book> createBookUsingPathVariables(@PathVariable int id,
                                                             @PathVariable("name") String bookName,
                                                             @PathVariable String description,
                                                             @PathVariable("author") String bookAuthor)
    {
        Book book = new Book();
        book.setId(id);
        book.setName(bookName);
        book.setDescription(description);
        book.setAuthor(bookAuthor);
        System.out.println(book.getName());
        System.out.println(book.getId());
        System.out.println(book.getAuthor());
        System.out.println(book.getDescription());
        return ResponseEntity.ok(book);
    }

    @GetMapping(value = "/books/query")
    public ResponseEntity<Book> createBooksUsingRequestParameters(@RequestParam (name = "id") int id,
                                                                  @RequestParam (name = "name") String name,
                                                                  @RequestParam (name = "description") String description,
                                                                  @RequestParam (name = "author") String author)
    {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setDescription(description);
        book.setAuthor(author);
        System.out.println(book.getName());
        System.out.println(book.getId());
        System.out.println(book.getAuthor());
        System.out.println(book.getDescription());
        return ResponseEntity.ok(book);
    }


}

/*
@GetMapping is a composed annotation that is same as @RequestMapping(method = RequestMethod.GET
@PutMapping is a composed annotation that is same as @RequestMapping(method = RequestMethod.PUT
@PostMapping is a composed annotation that is same as @RequestMapping(method = RequestMethod.POST
@DeleteMapping is a composed annotation that is same as @RequestMapping(method = RequestMethod.DELETE
*/
