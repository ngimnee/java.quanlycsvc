package QL_DieuChuyen;

import QL_DanhSachTaiSan.TaiSan;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vanqu
 */
public class TSDieuChuyen implements Serializable{
    private String noiDC;
    private String cbQL;
    private String cbSD;
    private String vtDat;
    private Date ngaySD;
    //private String chiTiet;
    private TaiSan tsX; 
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");

    public TSDieuChuyen() {
        try {
            this.noiDC = "";
            this.cbQL = "";
            this.cbSD = "";
            this.vtDat = "";
            this.ngaySD = format.parse("01/01/2000");
            this.tsX = null;
            //this.chiTiet = "";
        } catch (ParseException ex) {
            Logger.getLogger(TSDieuChuyen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public TSDieuChuyen(String dvNhan,String cbQL, String cbSD, String vtDat, Date ngaySD, TaiSan tsX) {
        this.noiDC = dvNhan;
        this.cbQL = cbQL;
        this.cbSD = cbSD;
        this.vtDat = vtDat;
        this.ngaySD = ngaySD;
        this.tsX = tsX;
        //this.chiTiet = chiTiet;
    }

    public String getNoiDC() {
        return noiDC;
    }

    public void setNoiDC(String noiDC) {
        this.noiDC = noiDC;
    }
    
    public String getCbQL() {
        return cbQL;
    }

    public void setCbQL(String cbQL) {
        this.cbQL = cbQL;
    }

    public String getCbSD() {
        return cbSD;
    }

    public void setCbSD(String cbSD) {
        this.cbSD = cbSD;
    }

    public String getVtDat() {
        return vtDat;
    }

    public void setVtDat(String vtDat) {
        this.vtDat = vtDat;
    }

    public String getNgaySD() {
        return format.format(ngaySD);
    }

    public void setNgaySD(Date ngaySD) {
        this.ngaySD = ngaySD;
    }

    public TaiSan getTsX() {
        return tsX;
    }

//    public String getChiTiet() {
//        return chiTiet;
//    }
//
//    public void setChiTiet(String chiTiet) {
//        this.chiTiet = chiTiet;
//    }
//
//    public void setTsX(TaiSan tsX) {
//        this.tsX = tsX;
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.tsX);
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
        final TSDieuChuyen other = (TSDieuChuyen) obj;
        if (!Objects.equals(this.tsX, other.tsX)) {
            return false;
        }
        return true;
    }
        
}
