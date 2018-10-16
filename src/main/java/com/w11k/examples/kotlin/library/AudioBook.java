package com.w11k.examples.kotlin.library;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class AudioBook extends Item {

    final private String name;
    final private Person author;
    final private String publishingCompany;
    final private long duration;
    final private List<Person> readers;
    final private String type;
    final private String description;


    public AudioBook(
            @NotNull String inventoryId,
            String name,
            Person author,
            String publishingCompany,
            long duration,
            List<Person> readers,
            String type,
            String description
    ) {
        super(inventoryId);
        this.name = name;
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.duration = duration;
        this.readers = readers;
        this.type = type;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public Person getAuthor() {
        return author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public long getDuration() {
        return duration;
    }

    public List<Person> getReaders() {
        return readers;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AudioBook audioBook = (AudioBook) o;
        return duration == audioBook.duration &&
                Objects.equals(name, audioBook.name) &&
                Objects.equals(author, audioBook.author) &&
                Objects.equals(publishingCompany, audioBook.publishingCompany) &&
                Objects.equals(readers, audioBook.readers) &&
                Objects.equals(type, audioBook.type) &&
                Objects.equals(description, audioBook.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publishingCompany, duration, readers, type, description);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AudioBook.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("author=" + author)
                .add("publishingCompany='" + publishingCompany + "'")
                .add("duration=" + duration)
                .add("readers=" + readers)
                .add("type='" + type + "'")
                .add("description='" + description + "'")
                .toString();
    }
}
