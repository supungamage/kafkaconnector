package com.supung.kafkaconnector.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BdeInput {
    private Long id;
    private String name;
    private boolean flag;
}
