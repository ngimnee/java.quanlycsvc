package QL_SuaChua;

import java.io.Serializable;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 *
 * @author ASUS
 */
public class SuaChua implements Serializable {
    private String maSC;
    private String nguoiBT;
    private String dvTinh;
    private String maTS;
    private String noiDung;
    private String CBKiemTra;
    private Date ngaySC;
    private String trangThai;
    private String yKien;
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

    public SuaChua() { 
        try {
            this.maSC = "0000";
            this.nguoiBT = "";
            this.dvTinh = "";
            this.maTS = "0000";           
            this.noiDung = "";
            this.CBKiemTra = "";
            this.ngaySC = format.parse("01/01/2000");
            this.yKien = "";
            this.trangThai = "";
        } catch (ParseException ex) {
            Logger.getLogger(SuaChua.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public SuaChua(String maSC, String nguoiBT, String dvTinh, String maTC, String noiDung, String CBKiemTra, Date ngaySC, String trangThai) {
        this.maSC = maSC;
        this.nguoiBT = nguoiBT;
        this.dvTinh = dvTinh;
        this.maTS = maTC;
        this.noiDung = noiDung;
        this.CBKiemTra = CBKiemTra;
        this.ngaySC = ngaySC;
        this.trangThai = trangThai;
//        this.danhMuc = danhMuc;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        
        hash = 67 * hash + Objects.hashCode(this.maSC);
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
        final SuaChua other = (SuaChua) obj;
        if (!Objects.equals(this.maSC, other.maSC)) {
            return false;
        }
        return true;
    }

    public String getMaSC() {
        return maSC;
    }

    public void setMaSC(String maSC) {
        this.maSC = maSC;
    }

    public String getNguoiBT() {
        return nguoiBT;
    }

    public void setNguoiBT(String nguoiBT) {
        this.nguoiBT = nguoiBT;
    }

    public String getDvTinh() {
        return dvTinh;
    }

    public void setDvTinh(String dvTinh) {
        this.dvTinh = dvTinh;
    }

    public String getMaTS() {
        return maTS;
    }

    public void setMaTS(String maTS) {
        this.maTS = maTS;
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String getCBKiemTra() {
        return CBKiemTra;
    }

    public void setCBKiemTra(String CBKiemTra) {
        this.CBKiemTra = CBKiemTra;
    }

    public String getNgaySC() {
        return format.format(ngaySC);
    }

    public void setNgaySC(Date ngaySC) {
        this.ngaySC = ngaySC;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    public String getyKien() {
        return yKien;
    }

    public void setyKien(String yKien) {
        this.yKien = yKien;
    }    
}


