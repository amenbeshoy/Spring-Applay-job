package com.DemoApp.jobportal.Dto;

import org.checkerframework.checker.index.qual.Positive;

import java.math.BigDecimal;

public record ProductDto(Long id,  String name, @Positive BigDecimal price) {}