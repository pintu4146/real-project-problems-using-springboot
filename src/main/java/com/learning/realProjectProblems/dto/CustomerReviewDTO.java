package com.learning.realProjectProblems.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerReviewDTO {
    private String restaurant;
    private String reviewer;
    private String review;
    private int rating;
    private String metadata;
    private String time;
    private String pictures;
}
