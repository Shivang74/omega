package com.shivang.omega;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //satisfies the need of toString and getter setter
@AllArgsConstructor //satisfies the need of a constructor with all parameters
@NoArgsConstructor //satisfies the need of a non parameterized constructor
public class Movie { //This movie class is acting as a datatype/structure for future usages

    @Id
    private ObjectId Id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference //only store the Ids of reviews and the actual reviews will be stored in Review Class
    private List<Review> reviewIds;


}
