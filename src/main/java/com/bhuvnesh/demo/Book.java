package com.bhuvnesh.demo;

public class Book
{
    private String Name;
    private int Id;
    private String Description;
    private String Author;

    public Book()
    {

    }

    public Book(String name, int id, String description, String author) {
        Name = name;
        Id = id;
        Description = description;
        Author = author;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
