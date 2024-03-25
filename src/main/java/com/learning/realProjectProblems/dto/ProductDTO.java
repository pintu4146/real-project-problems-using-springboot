package com.learning.realProjectProblems.dto;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class ProductDTO {
    int product_id;
    String name;
    String price;
    String quantity;
}
