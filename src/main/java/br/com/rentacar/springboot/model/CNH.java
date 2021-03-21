package br.com.rentacar.springboot.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class CNH extends PhysicalClient {
    @Id
    @GeneratedValue
    private Long id;

    @Column()
    private Long registrationNumber;

    @Column()
    private String category;
}
