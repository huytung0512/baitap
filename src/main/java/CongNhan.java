
import java.util.Scanner;

public class CongNhan extends CanBo {

    private int bac;
    public CongNhan() {
    }
    public CongNhan(String hoten, int Tuoi, String gioiTinh, String diaChi, int bac) {
        super(hoten, Tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }
    public int nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap bac: ");
        bac = Integer.parseInt(sc.nextLine());
       return bac;
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tBac: " + bac);
    }
}
