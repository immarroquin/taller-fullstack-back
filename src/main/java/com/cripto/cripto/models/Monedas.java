package com.cripto.cripto.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "monedas")
@ToString
@EqualsAndHashCode
public class Monedas {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "simbolo")
    private String simbolo;
    @Getter @Setter @Column(name = "valor")
    private String valor;
    @Getter @Setter @Column(name = "nombre")
    private String nombre;

}
