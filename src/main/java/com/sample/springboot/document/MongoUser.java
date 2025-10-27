package com.sample.springboot.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

@Document(collection = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MongoUser {

    @Id
    private String id;     // MongoDB uses String/ObjectId
    private String name;
    private String email;
}
