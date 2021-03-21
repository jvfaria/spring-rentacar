package br.com.rentacar.springboot.model;

import javax.persistence.*;

@Entity()
@Table()
public class CorporateClient extends Client {
    @Id
    @GeneratedValue
    private Long id;

    @Column()
    private Long cnpj;

    @Column()
    private Long cnh;

    @Column()
    private String companyName;

    @Column()
    private Long municipalRegistration;

    @Column()
    private Long stateRegistration;

    @Column()
    private PhysicalClient Driver;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Long getCnh() {
        return cnh;
    }

    public void setCnh(Long cnh) {
        this.cnh = cnh;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Long getMunicipalRegistration() {
        return municipalRegistration;
    }

    public void setMunicipalRegistration(Long municipalRegistration) {
        this.municipalRegistration = municipalRegistration;
    }

    public Long getStateRegistration() {
        return stateRegistration;
    }

    public void setStateRegistration(Long stateRegistration) {
        this.stateRegistration = stateRegistration;
    }

    public PhysicalClient getDriver() {
        return Driver;
    }

    public void setDriver(PhysicalClient driver) {
        Driver = driver;
    }
}
