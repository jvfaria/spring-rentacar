package br.com.rentacar.springboot.model;

import javax.persistence.*;

@Entity(name = "physicalClient")
@Table()
public class PhysicalClient extends Client{
    @Id
    @GeneratedValue
    private Long id;

    @Column()
    private Long cpf;

    @Column()
    private Long cnh;

    @Column()
    private String genre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public Long getCnh() {
        return cnh;
    }

    public void setCnh(Long cnh) {
        this.cnh = cnh;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
