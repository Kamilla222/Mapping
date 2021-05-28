package com.myiphone.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Iphone10 {
    private String ios;
    private String cameraType;
    private String display;
    private boolean waterproof;
    private String color;
}
