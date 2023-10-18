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
public class Testcase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String input;
    private String output;

    @OneToOne
    @JoinColumn(name = "problem_id") // Define the foreign key column
    private Problem problem;

}
