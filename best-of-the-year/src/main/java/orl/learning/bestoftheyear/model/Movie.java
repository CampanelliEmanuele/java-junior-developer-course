package orl.learning.bestoftheyear.model;

public class Movie {
    private int id;
    private String title;
    private String author;

    public Movie(int id, String title, String author) throws IllegalArgumentException {
        setId(id);
        setTitle(title);
        setAuthor(author);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws IllegalArgumentException {
        if (id < 0)
            throw new IllegalArgumentException("Movie's id must be a positive number.");
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws IllegalArgumentException {
        if (title.isEmpty())
            throw new IllegalArgumentException("Movie's title cannot be an empty string.");
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if (author.isEmpty())
            throw new IllegalArgumentException("Movie's author cannot be an empty string.");
        this.author = author;
    }
}
