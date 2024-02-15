package orl.learning.bestoftheyear.model;

import jakarta.annotation.Nonnull;

public class Song {

    private int id;
    private String title;
    private String author;

    public Song(int id, String title, String author) throws IllegalArgumentException {
        setId(id);
        setTitle(title);
        setAuthor(author);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws IllegalArgumentException {
        if (id < 0)
            throw new IllegalArgumentException("Song's id must be a positive number.");
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (title.isEmpty())
            throw new IllegalArgumentException("Song's title cannot be an empty string.");
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if (author.isEmpty())
            throw new IllegalArgumentException("Song's author cannot be an empty string.");
        this.author = author;
    }
}
