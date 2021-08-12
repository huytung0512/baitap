import java.util.Scanner;

public class KySu extends CanBo {

    private String nganhDaoTao;
    public KySu() {
    }
    public KySu(String hoten, int Tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoten, Tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }
    public int nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap nganh dao tao: ");
        nganhDaoTao = sc.nextLine();
        return 0;
    }
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNganh dao tao: " + nganhDaoTao);
    }
}