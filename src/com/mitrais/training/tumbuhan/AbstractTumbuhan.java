package com.mitrais.training.tumbuhan;

public abstract class AbstractTumbuhan implements Tumbuhan{
    private Boolean tinggalAir = false, tinggalTanahLembab = false, tinggalTanahKering = false;

    public void setTinggalAir(Boolean tinggalAir) {
        this.tinggalAir = tinggalAir;
    }

    public void setTinggalTanahLembab(Boolean tinggalTanahLembab) {
        this.tinggalTanahLembab = tinggalTanahLembab;
    }

    public void setTinggalTanahKering(Boolean tinggalTanahKering) {
        this.tinggalTanahKering = tinggalTanahKering;
    }

    @Override
    public void jenis() {
        if (tinggalAir) {
            System.out.println("Tumbuhan dengan jenis hidrofit");
        } else if (tinggalTanahLembab) {
            System.out.println("Tumbuhan dengan jenis higrofit");
        } else if (tinggalTanahKering) {
            System.out.println("Tumbuhan Xerofit");
        } else {
            System.out.println("Tumbuhan ngga tau kelompok mana");
        }
    }
    public void berbunga () {
        System.out.println("Tanaman ini berbunga");
    }

    public void warnaDaun () {
        System.out.println("Daun berwarna hijau");
    }

    public void warnaDaun(String warna) {
        System.out.println("Daun berwarna " + warna);
    }
}
