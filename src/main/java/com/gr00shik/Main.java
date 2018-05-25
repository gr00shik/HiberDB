package com.gr00shik;

import com.gr00shik.entity.report.AddDeal;
import com.gr00shik.entity.report.DeadUtil;
import com.gr00shik.entity.report.ReportDeal;
import com.gr00shik.entity.report.Shops;
import com.gr00shik.entity.store.Deal;
import com.gr00shik.entity.store.Product;
import com.gr00shik.entity.store.Seller;
import com.gr00shik.entity.store.Shop;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Date;
import java.util.List;

public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();

//        Shops.getShops(session);
//        System.out.println("------------------");
//
//        Product product = new Product();
//        product.setProductId(9);
//
//        Seller seller = new Seller();
//        seller.setTabelNumber(1305);
//
//
//        Deal deal = new Deal();
//        deal.setDateDeal(new Date(2018-1900, 1-1, 10));
//        deal.setIdProduct(product);
//        deal.setSeller(seller);
//
//
//        AddDeal.addDeal(session, deal.getIdProduct().getProductId(), deal);

        List<ReportDeal> reportDeals = DeadUtil.getReportDeal(session);
        for(ReportDeal deal : reportDeals){
            System.out.println(deal);
        }

        session.close();
        ourSessionFactory.close();

    }
}