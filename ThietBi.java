/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_MuaSam;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Administrator
 */
public class ThietBi implements Serializable {
    private String tenTB;
    private int sLKho;
    private int sLDeNghi;
    private String dvTinh;
    private String danhMuc;
    
    public ThietBi() {
        this.tenTB = "";
        this.sLKho = 0;
        this.sLDeNghi = 0;
        this.danhMuc = "";
        this.dvTinh = "";
    }
    
    public ThietBi(String tenTB, int sLKho, int sLDeNghi, String dvTinh, String danhMuc) {
        this.tenTB = tenTB;
        this.sLKho = sLKho;
        this.sLDeNghi = sLDeNghi;
        this.dvTinh = dvTinh;
        this.danhMuc = danhMuc;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.tenTB);
        return hash;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ThietBi other = (ThietBi) obj;
        if (!Objects.equals(this.tenTB, other.tenTB)) {
            return false;
        }
        return true;
    }

    public String getTenTB() {
        return tenTB;
    }

    public void setTenTB(String tenTB) {
        this.tenTB = tenTB;
    }

    public int getsLKho() {
        return sLKho;
    }

    public void setsLKho(int sLKho) {
        this.sLKho = sLKho;
    }

    public int getsLDeNghi() {
        return sLDeNghi;
    }

    public void setsLDeNghi(int sLDeNghi) {
        this.sLDeNghi = sLDeNghi;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getDvTinh() {
        return dvTinh;
    }

    public void setDvTinh(String dvTinh) {
        this.dvTinh = dvTinh;
    }
    
}
