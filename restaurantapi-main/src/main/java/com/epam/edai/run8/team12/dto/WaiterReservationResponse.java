package com.epam.edai.run8.team12.dto;

import lombok.Data;

@Data
public class WaiterReservationResponse {
    private String locationAddress;
    private String date;
    private String slotTime;
    private String bookedBy;
    private String guests;
    private String tableId;
    private String bookedFor;
    private String reservationId;
}
