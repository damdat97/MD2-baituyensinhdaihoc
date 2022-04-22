package thidaihoc;

public class ThiSinhB extends ThiSinh{
    public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
    public static final String MON_SINH = "Sinh";

    public ThiSinhB(String soBaoDanh, String ten, String diaChi, int mucUuTien) {
        super(soBaoDanh, ten, diaChi, mucUuTien);
    }

    public String toString() {
        return super.toString() + ", mon: " + MON_TOAN + " - " + MON_HOA + " - " + MON_SINH;
    }
}
