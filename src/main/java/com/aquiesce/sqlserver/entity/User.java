package com.aquiesce.sqlserver.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Id")
    int Id;

    @Column(name="Age")
    int age;

    @Column(name="Description")
    String description;

    @Column(name="FirstName")
    String firstName;

    @Column(name="LastName")
    String lastName;
}
