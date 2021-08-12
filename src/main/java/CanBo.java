import java.util.Scanner;

public class CanBo {

    private String hoTen;
    private int Tuoi;
    private String gioiTinh;
    private String diaChi;

    public CanBo() {
    }
    public CanBo(String hoten, int Tuoi, String gioiTinh, String diaChi) {
        this.hoTen = hoten;
        this.Tuoi = Tuoi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    public int nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("\tNhap tuoi: ");
        Tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("\tNhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("\tNhap dia chi: ");
        diaChi = sc.nextLine();
        return 0;
    }
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen);
        System.out.println("\tTuoi: " + Tuoi);
        System.out.println("\tGioi tinh: " + gioiTinh);
        System.out.println("\tDia chi: " + diaChi);
    }
    public String getHoTen() {
        return this.hoTen;
    }
}
