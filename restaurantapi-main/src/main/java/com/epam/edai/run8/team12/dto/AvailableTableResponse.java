package com.epam.edai.run8.team12.dto;

import java.util.List;
import java.util.Map;

public class AvailableTableResponse {
    private String locationId;
    private  String locationAddress;
    private String tableNumber; //id to no
    private List<String> availableSlots;
    private String capacity ;

    public AvailableTableResponse(String locationId, String locationAddress, String tableNumber, List<String> availableSlots, String capacity) {
        this.locationId = locationId;
        this.locationAddress = locationAddress;
        this.tableNumber = tableNumber;
        this.availableSlots = availableSlots;
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public List<String> getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(List<String> availableSlots) {
        this.availableSlots = availableSlots;
    }

    public static AvailableTableResponse toAvailableTableResponse(String tableId, Map<String, Boolean> slotMap, String locationId, String locationAddress, Integer capacity) {
        List<String> availableSlots  = slotMap.entrySet()
                .stream()
                .map(Map.Entry::getKey)
                .toList();

        return new AvailableTableResponse(locationId, locationAddress, tableId, availableSlots, String.valueOf(capacity));
    }






}
