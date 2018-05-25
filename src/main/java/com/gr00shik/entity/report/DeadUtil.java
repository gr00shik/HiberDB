package com.gr00shik.entity.report;

import org.hibernate.Session;

import java.util.List;

public class DeadUtil {

    public static List<ReportDeal> getReportDeal(Session session){
        return session.createQuery("select new com.gr00shik.entity.report.ReportDeal(d.idProduct.name, d.idProduct.price, d.seller.firstName, d.seller.secondName) from Deal d").getResultList();
    }

}
