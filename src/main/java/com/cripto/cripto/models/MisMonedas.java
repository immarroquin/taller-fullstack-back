package com.cripto.cripto.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "usuario_moneda")
@ToString
@EqualsAndHashCode
public class MisMonedas {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idusuario")
    private Long idusuario;
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "idmoneda")
    private String idmoneda;

}
