package com.example.demo.dto;

import com.example.demo.entity.Gas;
import com.example.demo.entity.WhDetail;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class GasDto {
    private String product;

    private int price;

    private List<WhDetailDto> whDetails = new ArrayList<>();

    public GasDto(Gas gas) {
        this.setProduct(gas.getProduct());
        this.setPrice(gas.getPrice());
        List<WhDetailDto> whDetailDtos = gas.getWhDetailList().stream().map(WhDetailDto::new).collect(Collectors.toList());
        this.setWhDetails(whDetailDtos);
    }
}
