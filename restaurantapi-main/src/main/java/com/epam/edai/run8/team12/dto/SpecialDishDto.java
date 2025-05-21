package com.epam.edai.run8.team12.dto;

import com.epam.edai.run8.team12.entity.Dish;
import lombok.Data;

@Data
public class SpecialDishDto {

    private String name;
    private String price;
    private String weight;
    private String imageUrl;

    public static SpecialDishDto fromEntity(Dish dish) {
        SpecialDishDto dto = new SpecialDishDto();
        dto.setName(dish.getName());
        dto.setPrice(dish.getPrice());
        dto.setWeight(dish.getWeight());
        dto.setImageUrl(dish.getImageUrl());
        return dto;
    }
}
