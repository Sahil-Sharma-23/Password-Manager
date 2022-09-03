package com.managepass.PasswordManager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_passwords")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Passwords {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "p_id", nullable = false)
    private Long p_id;
    @Column(name = "website")
    private String websiteName;
    private String username;
    private String password;
    @Column(name = "email")
    private String emailID;
}
