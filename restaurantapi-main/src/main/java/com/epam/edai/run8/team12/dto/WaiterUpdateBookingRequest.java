package com.epam.edai.run8.team12.dto;

import lombok.Data;

@Data
public class WaiterUpdateBookingRequest {
    private String tableNumber;
    private String date;
    private String timeFrom;
    private String timeTo;

}