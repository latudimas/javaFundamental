package com.mitrais.training.tumbuhan;

public class Lumut extends AbstractTumbuhan{
    public Lumut() {
        setTinggalTanahLembab(true);
    }

    @Override
    public void berbunga() {
        System.out.println("Tanaman ini Tidak Berbunga");
    }
}
