package com.soria.academia2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_curso;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "vacantes")
    private Integer vacantes;

    @Column(name = "precio")
    private Double precio;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_tipocurso")
    private TipoCurso tipoCurso;



}
