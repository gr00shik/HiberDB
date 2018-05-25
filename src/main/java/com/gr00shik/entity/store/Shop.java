package com.gr00shik.entity.store;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department")
    private Integer department;

    @Column(name = "city")
    private String city;

    @Column(name = "numbershop")
    private Integer numberShop;

    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
    private List<Seller> sellers;

    public Shop() {
    }

    public Shop(String city, Integer numberShop, List<Seller> sellers) {
        this.city = city;
        this.numberShop = numberShop;
        this.sellers = sellers;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getNumberShop() {
        return numberShop;
    }

    public void setNumberShop(Integer numberShop) {
        this.numberShop = numberShop;
    }

    public List<Seller> getSellers() {
        return sellers;
    }

    public void setSellers(List<Seller> sellers) {
        this.sellers = sellers;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "department=" + department +
                ", city='" + city + '\'' +
                ", numberShop=" + numberShop +
                ", sellers=" + sellers +
                '}';
    }
}
