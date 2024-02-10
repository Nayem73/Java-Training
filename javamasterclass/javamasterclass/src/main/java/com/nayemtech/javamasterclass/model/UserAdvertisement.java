package com.nayemtech.javamasterclass.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Entity
public class UserAdvertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long price;
    private String title;
    private String description;
    private LocalDateTime localDateTime;

}
