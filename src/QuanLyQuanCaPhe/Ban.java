package QuanLyQuanCaPhe;

import java.util.Arrays;

public class Ban {
    private String tenBan;
    private String maBa;
    private Nguoii[] nguoi;
    private Coffee[] doanDouong;
    private int gioDat;
    public Ban(String tenBan,String maBa) {
        this.tenBan = tenBan;
        this.maBa = maBa;
    }

    public Ban(String tenBan, String maBa, Nguoii[] nguoi, Coffee[] doanDouong, int gioDat) {
        this.tenBan = tenBan;
        this.maBa = maBa;
        this.nguoi = nguoi;
        this.doanDouong = doanDouong;
        this.gioDat = gioDat;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public String getMaBa() {
        return maBa;
    }

    public void setMaBa(String maBa) {
        this.maBa = maBa;
    }

    public Nguoii[] getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoii[] nguoi) {
        this.nguoi = nguoi;
    }

    public Coffee[] getDoanDouong() {
        return doanDouong;
    }

    public void setDoanDouong(Coffee[] doanDouong) {
        this.doanDouong = doanDouong;
    }

    public int getGioDat() {
        return gioDat;
    }

    public void setGioDat(int gioDat) {
        this.gioDat = gioDat;
    }

    @Override
    public String toString() {
        return "Ban{" +
                "tenBan='" + tenBan + '\'' +
                ", maBa=" + maBa +
                ", nguoi=" + Arrays.toString(nguoi) +
                ", doanDouong=" + Arrays.toString(doanDouong) +
                ", gioDat=" + gioDat +
                '}';
    }
}
