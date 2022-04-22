package thidaihoc;

public class ThiSinhC extends ThiSinh{
    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

    public ThiSinhC(String soBaoDanh, String ten, String diaChi, int mucUuTien) {
        super(soBaoDanh, ten, diaChi, mucUuTien);
    }

    public String toString() {
        return super.toString() + ", mon: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA;
    }
}
