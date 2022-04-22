package thidaihoc;

public class ThiSinhA extends ThiSinh{
    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";

    public ThiSinhA(String soBaoDanh, String ten, String diaChi, int mucUuTien) {
        super(soBaoDanh, ten, diaChi, mucUuTien);
    }

    public String toString() {
        return super.toString() + ", mon: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA;
    }

}
