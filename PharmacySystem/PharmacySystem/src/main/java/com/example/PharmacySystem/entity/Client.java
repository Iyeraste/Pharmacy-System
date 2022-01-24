package com.example.PharmacySystem.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)

Integer clId;
    @Column(unique = true, nullable = false, length = 20)
String fstName;
    @Column(nullable = false, length = 40)
String lstName;
    @Column(nullable = false, length = 40)
String phoneNumber;
String clAge;


}
