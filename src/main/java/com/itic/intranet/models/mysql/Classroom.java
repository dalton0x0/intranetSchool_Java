package com.itic.intranet.models.mysql;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Classroom {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "classroom", fetch = FetchType.EAGER)
    List<User> students = new ArrayList<>();

    @ManyToMany(mappedBy = "taughtClassrooms", fetch = FetchType.EAGER)
    private List<User> teachers = new ArrayList<>();

    @ManyToMany(mappedBy = "classrooms", fetch = FetchType.EAGER)
    private List<Evaluation> evaluations = new ArrayList<>();
}
