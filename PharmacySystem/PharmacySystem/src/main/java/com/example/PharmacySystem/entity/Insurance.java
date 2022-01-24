package com.example.PharmacySystem.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Insurance {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
Integer insId;
    @Column(unique = true, nullable = false, length = 20)
String insName;
    @Column(nullable = false, length = 40)
String insDate;
String expDate;
String paycov;

}
