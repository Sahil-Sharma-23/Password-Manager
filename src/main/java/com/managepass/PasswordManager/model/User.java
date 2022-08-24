package com.managepass.PasswordManager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_tbl")
public class User {
    @Id
    @Column(name = "username", nullable = false)
    private String username;

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userNumber;
    private String firstName;
    private String lastName;
    private String emailID;
    private String password;
}
