package com.example.demo.dto;

import com.example.demo.entity.WhDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WhDetailDto {
    private int quantity;

    public WhDetailDto(WhDetail whDetail) {
        this.setQuantity(whDetail.getQuantity());
    }
}
