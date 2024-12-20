package DangNhap;

import java.io.Serializable;
import java.util.Objects;

public class TaiKhoan implements Serializable{
    private String tenDN;
    private String mk;

    public TaiKhoan() {
        super();
    }

    public TaiKhoan(String tenDN, String mk) {
        this.tenDN = tenDN;
        this.mk = mk;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.tenDN);
        hash = 73 * hash + Objects.hashCode(this.mk);
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
        final TaiKhoan other = (TaiKhoan) obj;
        if (!Objects.equals(this.tenDN, other.tenDN)) {
            return false;
        }
        if (!Objects.equals(this.mk, other.mk)) {
            return false;
        }
        return true;
    }
}