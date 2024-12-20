package QL_DanhSachTaiSan;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaiSan implements Serializable {
    private String maTS;
    private String tenTS;
    private String dvTinh;
    private String tinhTrang;
    private Date ngayBH;
    private String nguonVon;
    private String soHuu;
    private String mucDich;
    private String danhMuc;
    private String khoaQl;
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

    public TaiSan() {
       
        try {
            this.maTS = "0000";
            this.tenTS = "";
            this.dvTinh = "";
            this.tinhTrang = "";
            this.ngayBH = format.parse("01/01/2000");
            this.nguonVon = "";
            this.soHuu = "";
            this.mucDich = "";
            this.danhMuc = "";
            this.khoaQl = "";
        } catch (ParseException ex) {
            Logger.getLogger(TaiSan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public TaiSan(String maTS, String tenTS, String dvTinh, String tinhTrang, Date ngayBH, String nguonVon, String soHuu, String mucDich, String danhMuc, String khoaQl) {
        this.maTS = maTS;
        this.tenTS = tenTS;
        this.dvTinh = dvTinh;
        this.tinhTrang = tinhTrang;
        this.ngayBH = ngayBH;
        this.nguonVon = nguonVon;
        this.soHuu = soHuu;
        this.mucDich = mucDich;
        this.danhMuc = danhMuc;
        this.khoaQl = khoaQl;
    }

    public TaiSan(String maTS) {
        this.maTS = maTS;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.maTS);
        return hash;
    }

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
        final TaiSan other = (TaiSan) obj;
        if (!Objects.equals(this.maTS, other.maTS)) {
            return false;
        }
        return true;
    }

    public String getMaTS() {
        return maTS;
    }

    public void setMaTS(String maTS) {
        this.maTS = maTS;
    }

    public String getTenTS() {
        return tenTS;
    }

    public void setTenTS(String tenTS) {
        this.tenTS = tenTS;
    }

    public String getDvTinh() {
        return dvTinh;
    }

    public void setDvTinh(String dvTinh) {
        this.dvTinh = dvTinh;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getNgayBH() {
        return format.format(ngayBH);
    }

    public void setNgayBH(Date ngayBH) {
        this.ngayBH = ngayBH;
    }

    public String getNguonVon() {
        return nguonVon;
    }

    public void setNguonVon(String nguonVon) {
        this.nguonVon = nguonVon;
    }     

    public String getSoHuu() {
        return soHuu;
    }

    public void setSoHuu(String soHuu) {
        this.soHuu = soHuu;
    }

    public String getMucDich() {
        return mucDich;
    }

    public void setMucDich(String mucDich) {
        this.mucDich = mucDich;
    }   

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getKhoaQl() {
        return khoaQl;
    }

    public void setKhoaQl(String khoaQl) {
        this.khoaQl = khoaQl;
    }
    
}
