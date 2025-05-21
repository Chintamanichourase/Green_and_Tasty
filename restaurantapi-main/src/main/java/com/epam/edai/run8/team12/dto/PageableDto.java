package com.epam.edai.run8.team12.dto;

import lombok.Data;

import java.util.List;

@Data
public class PageableDto {
    private long offset;
    private List<SortDto> sort;
    private boolean paged;
    private int pageSize;
    private int pageNumber;
    private boolean unpaged;
}
