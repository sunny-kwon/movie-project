package dev.sunny.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
// This specifies that instances of the Movie class should be stored in the "movies" collection in MongoDB.
@Data
// part of the Lombok Library, generates getters and setters
@AllArgsConstructor
// part of the Lombok Library, generates constructor that takes all
@NoArgsConstructor
// part of the Lombok Library, generates no arg constructor
public class Movie {

    @Id
    // allows id to become a unique identifier
    private ObjectId id;
    private String imbdId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    // references to another document in a different collection, like foreign key
    private List<Review> reviewIds;

}
