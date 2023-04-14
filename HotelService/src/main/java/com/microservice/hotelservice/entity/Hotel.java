package com.microservice.hotelservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Hotel {

    @Id
    private String hotelId;
    private String hotelName;
    private String location;
    private String about;




}
