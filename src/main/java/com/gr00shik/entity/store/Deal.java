package com.gr00shik.entity.store;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "deal")
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idproduct")
    private Product idProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tabelnumber")
    private Seller seller;

    @Column(name = "datedeal")
    private Date dateDeal;

    public Deal() {
    }

    public Deal(Product idProduct, Seller seller, Date dateDeal) {
        this.idProduct = idProduct;
        this.seller = seller;
        this.dateDeal = dateDeal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Product idProduct) {
        this.idProduct = idProduct;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Date getDateDeal() {
        return dateDeal;
    }

    public void setDateDeal(Date dateDeal) {
        this.dateDeal = dateDeal;
    }
}
