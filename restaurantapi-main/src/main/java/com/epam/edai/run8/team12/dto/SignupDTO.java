package com.epam.edai.run8.team12.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignupDTO {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
