package br.com.rentacar.springboot.model;

import javax.persistence.*;


@Entity(name = "car")
@Table()
public class Car extends Vehicle{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column()
    private Integer numberOfDoors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(Integer numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public double getEngine() {
        return Engine;
    }

    public void setEngine(double engine) {
        Engine = engine;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }

    @Column()
    private Integer numberOfSeats;

    @Column()
    private double Engine;

    @Column()
    private String Direction;

    @Column()
    private String Transmission;


}
