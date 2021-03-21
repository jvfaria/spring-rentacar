package br.com.rentacar.springboot.model;

import javax.persistence.*;

@Entity(name = "vehicle")
@Table()
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column()
    private Integer chassis;

    @Column()
    private String model;

    @Column()
    private String brand;

    @Column()
    private Integer fabrication_year;

    @Column()
    private String acessories;

    @Column()
    private Boolean available;

    @Column()
    private String color;

    @Column()
    private Integer kilometer;

    @Column()
    private double actualFuel;

    @Column()
    private double chargePerDay;

    @Column()
    private String description;

    @Column()
    private String Category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getChassis() {
        return chassis;
    }

    public void setChassis(Integer chassis) {
        this.chassis = chassis;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getFabrication_year() {
        return fabrication_year;
    }

    public void setFabrication_year(Integer fabrication_year) {
        this.fabrication_year = fabrication_year;
    }

    public String getAcessories() {
        return acessories;
    }

    public void setAcessories(String acessories) {
        this.acessories = acessories;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getKilometer() {
        return kilometer;
    }

    public void setKilometer(Integer kilometer) {
        this.kilometer = kilometer;
    }

    public double getActualFuel() {
        return actualFuel;
    }

    public void setActualFuel(double actualFuel) {
        this.actualFuel = actualFuel;
    }

    public double getChargePerDay() {
        return chargePerDay;
    }

    public void setChargePerDay(double chargePerDay) {
        this.chargePerDay = chargePerDay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}
