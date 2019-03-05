package com.mitrais.training.tumbuhan;

public class Teratai extends AbstractTumbuhan{
    private String name;
    public Teratai() {
        setTinggalAir(true);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
