package thidaihoc;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh implements QuanLy<ThiSinh>{
    private List<ThiSinh> thiSinhList;

    public TuyenSinh() {
        this.thiSinhList = new ArrayList<>();
    }

    public List<ThiSinh> getThiSinhList() {
        return thiSinhList;
    }

    public void setThiSinhList(List<ThiSinh> thiSinhList) {
        this.thiSinhList = thiSinhList;
    }

    @Override
    public void them(ThiSinh thiSinh) {
        this.thiSinhList.add(thiSinh);
    }

    @Override
    public void hienThongTin() {
        for (ThiSinh thiSinh: thiSinhList) {
            System.out.println(thiSinh.toString());
        }
    }

    @Override
    public int timKiemTheoID(String soBaoDanh) {
        for (int i = 0; i < thiSinhList.size(); i++) {
            if (thiSinhList.get(i).getSoBaoDanh().equals(soBaoDanh))
              return i;
        }
        return -1;
    }
}
