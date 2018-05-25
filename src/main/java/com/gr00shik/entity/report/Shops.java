package com.gr00shik.entity.report;

import com.gr00shik.entity.store.Seller;
import com.gr00shik.entity.store.Shop;
import org.hibernate.Session;

import java.util.List;

public class Shops {
    public static void getShops(Session session){
        List<Shop> shopList = session.createQuery("from Shop sl").list();
        for(Shop shop: shopList){
            System.out.println(shop.getCity() + "  shop №"+shop.getDepartment());
            List<Seller> sellerList = shop.getSellers();
            for (Seller seller :  sellerList){
                System.out.println(seller.getFirstName() +"  "+seller.getSecondName());
            }
            System.out.println("--------------------------");
        }
    }
}
