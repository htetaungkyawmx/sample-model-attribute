package com.example.samplemodelattribute.domain;


import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Data
public class Account {
    private static final AtomicLong idSequence=new AtomicLong();
    private Long id;
    private String name;
    private BigDecimal balance=new BigDecimal("1000");
    private BigDecimal equalityAllocation =new BigDecimal(".60");
    @DateTimeFormat(style = "S-")
    private Date renewalDate= new Date(new java.util.Date().getTime() + 31536000000L);
    private List<String> subjects;
}
