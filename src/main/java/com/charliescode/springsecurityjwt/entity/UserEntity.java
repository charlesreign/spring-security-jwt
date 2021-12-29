package com.charliescode.springsecurityjwt.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "users",
        uniqueConstraints = {@UniqueConstraint(name = "customer_email_unique",columnNames = "email")})
public class UserEntity {

    @Id
    private UUID uuid = UUID.randomUUID();

    @NotNull(message = "first name cannot be null")
    @Column(name = "first_name",nullable = false,columnDefinition = "TEXT")
    private String firstName;

    @NotNull(message = "last name cannot be null")
    @Column(name = "last_name",nullable = false,columnDefinition = "TEXT")
    private String lastName;

    @NotNull(message = "email cannot be null")
    @Email
    @Column(name = "email",nullable = false,columnDefinition = "TEXT")
    private String email;

    @NotNull(message = "password cannot be null")
    @Size(min = 8, message = "password must be equal or greater than 8 characters and less than 16")
    @Column(name = "password",nullable = false,columnDefinition = "TEXT")
    private String password;
}
