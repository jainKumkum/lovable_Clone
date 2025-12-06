package com.codingshuttle.projects.lovable_clone.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.Instant;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) // will make every field private
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long id;

    @Column(nullable = false)
     String name;

    @Column(nullable = false, unique = true)
     String email;

    @Column(nullable = false)
     String passwordHash;

     String avatarUrl;

    @CreationTimestamp
     Instant createAt;

    @UpdateTimestamp
     Instant updateAt;

     Instant deletedAt;
}
