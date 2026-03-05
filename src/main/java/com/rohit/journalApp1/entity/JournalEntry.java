package com.rohit.journalApp1.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collation = "journal_entries")
@Data
@Getter
@Setter
@NoArgsConstructor
public class JournalEntry {
    private ObjectId id;
    @NonNull
    private String title;
    private String content;
    private LocalDateTime date;


}
