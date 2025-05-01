package com.url.shortner.dtos;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ClickEventDto {
    private LocalDate clickDate;
    private Long count;
}