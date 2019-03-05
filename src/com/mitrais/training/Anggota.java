package com.mitrais.training;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class Anggota {
    public void getAnggota () throws SQLException {
        Conn con = new Conn();
        Connection cn =  con.connect();

        String query = "Select * from anggota";
        DoQuery q = new DoQuery();
        List<Employee> rs = q.runQ(cn, query);

        Iterator<Employee> itEmp = rs.iterator();
        int iter = 1;
        while (itEmp.hasNext()) {
            Employee emp = itEmp.next();
            System.out.println("Nama Anggota" +iter+ " : " + emp.getName());
            iter++;
        }
    }
}
