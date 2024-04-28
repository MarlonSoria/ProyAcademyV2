package com.soria.academia2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tb_transaccion")
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_transaccion;

    @ManyToOne
    @JoinColumn(name = "id_matricula")
    private Matricula matricula;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    @Column(name = "fechatran")
    private Date fechatran;

    @Column(name = "monto")
    private Double monto;

    @Column(name = "metodopa")
    private String metodopa;

}
