import java.util.Scanner;

public class NhanVien extends CanBo {

    private String congViec;

    public NhanVien() {

    }
    public NhanVien(String hoten, int Tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoten, Tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    public int nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap cong viec: ");
        congViec = sc.nextLine();
        return 0;
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tCong viec: " + congViec);
    }
}