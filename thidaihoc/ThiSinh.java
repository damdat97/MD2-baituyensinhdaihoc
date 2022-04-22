package thidaihoc;

public class ThiSinh {
    private String  soBaoDanh;
    private String ten;
    private String diaChi;
    private int mucUuTien;

    public ThiSinh() {
    }

    public ThiSinh(String soBaoDanh, String ten, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.ten = ten;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public void setSoBaoDanh(String soBaoDanh) {
        this.soBaoDanh = soBaoDanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    @Override
    public String toString() {
        return "ThiSinh{" +
                "soBaoDanh=" + soBaoDanh +
                ", ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", mucUuTien=" + mucUuTien +
                '}';
    }
}
