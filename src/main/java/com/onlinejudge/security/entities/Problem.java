package com.onlinejudge.security.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class Problem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String difficulty;
    private String example;
//    @OneToOne(cascade = CascadeType.ALL, mappedBy = "problem")
//    private Testcase testcase;

}
