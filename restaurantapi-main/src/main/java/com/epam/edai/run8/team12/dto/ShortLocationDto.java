package com.epam.edai.run8.team12.dto;

import com.epam.edai.run8.team12.entity.Location;
import lombok.Data;

@Data
public class ShortLocationDto {

    private String id;
    private String address;

    public static ShortLocationDto fromEntity(Location location) {
        ShortLocationDto dto = new ShortLocationDto();
        dto.setId(location.getId());
        dto.setAddress(location.getAddress());
        return dto;
    }
}
