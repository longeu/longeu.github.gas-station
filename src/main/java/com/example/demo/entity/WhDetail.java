package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "WHDetail")
public class WhDetail {
    @Id
    @GeneratedValue
    private int id_whdetail;
    private int id_warehouse;
    private int quantity;
    private int id_gas;
    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinTable(name = "WhDetail",
//            joinColumns = @JoinColumn(name = "id_WhDetail"),
//            inverseJoinColumns = @JoinColumn(name = "id_gas"))
//    @OneToOne(cascade = CascadeType.ALL)
    private Gas gases;
}
