package com.gr00shik.entity.store;

import javax.persistence.*;

@Entity
@Table(name = "seller")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tabelnumber")
    private Integer tabelNumber;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "secondname")
    private String secondName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department")
    private Shop department;


    public Seller() {
    }

    public Seller(String firstName, String secondName, Shop department) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
    }

    public Integer getTabelNumber() {
        return tabelNumber;
    }

    public void setTabelNumber(Integer tabelNumber) {
        this.tabelNumber = tabelNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Shop getDepartment() {
        return department;
    }

    public void setDepartment(Shop department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "tabelNumber=" + tabelNumber +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
