package com.mitrais.training;

import com.mitrais.training.tumbuhan.Kaktus;
import com.mitrais.training.tumbuhan.Lumut;
import com.mitrais.training.tumbuhan.Teratai;
import java.sql.SQLException;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Teratai teratai = new Teratai();
        teratai.jenis();
        teratai.berbunga();
        teratai.warnaDaun();
        System.out.println("=======================================================");
        Lumut lumut = new Lumut();
        lumut.jenis();
        lumut.berbunga();
        lumut.warnaDaun("coklat");
        System.out.println("=======================================================");
        Kaktus kaktus = new Kaktus();
        kaktus.jenis();
        kaktus.berbunga();
        kaktus.warnaDaun();
        System.out.println("=======================================================");
        List<Teratai> ters = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Teratai t = new Teratai();
            t.setName("Teratai" + i);
            ters.add(t);
        }


        Iterator<Teratai> iterator = ters.iterator();
        while (iterator.hasNext()) {
            Teratai tr =iterator.next();
            System.out.println(tr.getName());
        }

        System.out.println("=======================================================");

        Set<Teratai> ters2 = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            Teratai t = new Teratai();
            t.setName("Teratai" + i + i);
            ters2.add(t);
        }

        Iterator<Teratai> iterator2 = ters2.iterator();
        while (iterator2.hasNext()) {
            Teratai tr =iterator2.next();
            System.out.println(tr.getName());
        }

        System.out.println("=======================================================");

        Map<String, Teratai> ters3 = new HashMap();
        for (int i = 0; i < 4; i++) {
            Teratai t = new Teratai();
            t.setName("Teratai" + i + i + i);
            ters3.put("Teratai" + i + i + i, t);
        }

        for (Map.Entry<String, Teratai> entry : ters3.entrySet())
        {
            Teratai ttt = entry.getValue();
            System.out.println(ttt.getName());
        }

        System.out.println("=======================================================");
        Anggota anggota = new Anggota();
        try {
            anggota.getAnggota();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
