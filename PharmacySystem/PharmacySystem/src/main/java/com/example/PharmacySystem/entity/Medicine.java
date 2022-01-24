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
public class Medicine {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
Integer medId;
    @Column(unique = true, nullable = false, length = 20)
String medName;
    @Column(nullable = false, length = 40)
String manDate;
String expDate;
Integer medPrice;
}
