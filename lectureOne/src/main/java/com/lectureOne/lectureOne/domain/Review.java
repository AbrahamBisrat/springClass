package com.lectureOne.lectureOne.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Review {

    private int id;
    private String comment;
    private int numberOfStates;

}
