package QuanLyQuanCaPhe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        menu();
    }

    public static Scanner scanner = new Scanner(System.in);
    public static List<Ban> danhSachBan = new ArrayList<>();
    public static List<Coffee> danhSachCaPhe = new ArrayList<>();


    public static void menu() {
        boolean check = true;
        for (int i = 1; i <= 20; i++) {
            String tenBan = "bàn số" + i;
            String maban = "mã bàn" + i;
            Ban ban = new Ban(tenBan, maban);
            danhSachBan.add(ban);
        }
        List<Nguoii> danhSachNguoi = new ArrayList<>();

        while (check) {
            System.out.println("________Quản Lý Quán Cà Phê_________");
            System.out.println("1.Thêm sản phẩm vào trong quán");
            System.out.println("2.In danh sách sản phẩm ra màn hình");
            System.out.println("3.Tìm kiếm sản phẩm theo tên");
            System.out.println("4. Liệt kê sản phẩm theo từng loại đồ uống,đồ ăn");
            System.out.println("5.Sắp xếp sản phẩm theo giá tiền");
            System.out.println("------------Thêm người vào bàn----------");
            System.out.println("6.Thêm người");
            System.out.println("7.Bàn đã có người ");
            System.out.println("8.Bàn trống");
            System.out.println("9.In thông tin bàn theo mã");
            System.out.println("10.Tính tổng tiền của các bàn");
            System.out.println("----------Order----------");
            System.out.println("11.Exit");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so) {
                case 1:
                    themSanPhamMoi(danhSachCaPhe);
                    break;
                case 2:
                    inSanPhamRaManHinh(danhSachCaPhe);
                    ;
                    break;
                case 3:
                    timKiemSanPhamTheoTen(danhSachCaPhe);
                    break;
                case 4:
                    lietKeDoAnDoUong(danhSachCaPhe);
                    break;
                case 5:
                    xuatGiaTuCaoDenThap(danhSachCaPhe);
                    break;
                case 6:
                    themNguoiVaoBan(danhSachNguoi);
                    break;
                case 7:
                    banDaSuDung(danhSachBan);
                    break;
                case 8:
                    banChuaDcSuDung(danhSachBan);
                    break;
                case 9:
                    inThongTinBanTheoMa(danhSachBan);
                    break;
                case 10:
                    tinhTongTienCuaCacBan(danhSachBan);
                    break;
                case 11:
                    check = false;
                    System.out.println("Thoát chương trình");
                    break;


            }

        }
    }

    private static void tinhTongTienCuaCacBan(List<Ban> danhSachBan) {
        System.out.println("Tổng tiền của các bàn là:");
        int tong=0;
        for (int i = 1; i <= danhSachCaPhe.size(); i++) {
            tong= (int) (tong+danhSachCaPhe.get(i).getGiaSanPham());
        }
    }

    private static void inThongTinBanTheoMa(List<Ban> danhSachBan) {
        System.out.println("Mời bạn nhập mã cần tìm:");
        String maaa=scanner.nextLine();
        System.out.println("Thông tin bạn cần tìm :");
        for (int i = 0; i <danhSachBan.size(); i++) {
            if (danhSachBan.get(i).getMaBa().equals(maaa)){
                System.out.println(danhSachBan.get(i).toString());
            }
        }
    }


    private static void banDaSuDung(List<Ban> danhSachBan) {
        for (int i = 0; i < danhSachBan.size(); i++) {
            Nguoii[] nguois = danhSachBan.get(i).getNguoi();
            if (nguois != null && nguois.length > 0) {
                String tenBan = danhSachBan.get(i).getTenBan();
                System.out.println("Bàn " + tenBan + "đã có người sử dụng");
            }
        }
    }

    private static void banChuaDcSuDung(List<Ban> danhSachBan) {
        for (int i = 0; i < danhSachBan.size(); i++) {
            Nguoii[] nguoiis = danhSachBan.get(i).getNguoi();
            if (nguoiis == null || nguoiis.length == 0) {
                String tenBan = danhSachBan.get(i).getTenBan();
                System.out.println("Bàn" + tenBan + "chưa có người sử dụng");
            }
        }
    }

    private static void themNguoiVaoBan(List<Nguoii> danhSachNguoi) {
        System.out.println("Bàn 1- Bàn 20");

        System.out.println("Mời bạn chọn số bàn :");
        int soban = Integer.parseInt(scanner.nextLine());
        Ban ban = danhSachBan.get(soban - 1);
        System.out.println("Mời bạn nhập vào số người bạn muốn thêm(4 người/bàn):");
        int slp = Integer.parseInt(scanner.nextLine());
        do {
            for (int i = 0; i < slp; i++) {
                if (slp > 4) {
                    System.out.println("Số người vượt quá xin hãy ghép bàn");
                } else if (slp < 1 || slp == 0) {
                    menu();
                    return;
                }
                Nguoii[] nguoiisList = new Nguoii[slp];
                for (i = 0; i < slp; i++) {
                    System.out.println("Mời bạn nhập tên người thứ:" + (i + 1));
                    String tennn = scanner.nextLine();
                    System.out.println("Mời bạn nhập tuổi người thứ " + (i + 1));
                    int yeaer = Integer.parseInt(scanner.nextLine());
                    System.out.println("Mời bạn nhập giới tính của người thứ:" + (i + 1));
                    String gt = scanner.nextLine();
                    Nguoii nguoi = new Nguoii(tennn, yeaer, gt);
                    nguoiisList[i] = nguoi;
                }
                ban.setNguoi(nguoiisList);
                menu();
                return;
            }
        } while (soban >= 20 || soban < 1);


    }

    private static void xuatGiaTuCaoDenThap(List<Coffee> danhSachCaPhe) {
        Collections.sort(danhSachCaPhe, ((o1, o2) -> Float.compare((float) o2.getGiaSanPham(), (float) o1.getGiaSanPham())));
        for (int i = 0; i < danhSachCaPhe.size(); i++) {
            danhSachCaPhe.get(i).inThongTinQuanCaPhe();
        }
    }


    private static void inSanPhamRaManHinh(List<Coffee> danhSachCaPhe) {
        for (int i = 0; i < danhSachCaPhe.size(); i++) {
            danhSachCaPhe.get(i).inThongTinQuanCaPhe();
        }
    }

    private static void timKiemSanPhamTheoTen(List<Coffee> danhSachCaPhe) {
        System.out.println("Nhập tên sản phẩm cần tìm:");
        String name6 = scanner.nextLine();
        System.out.println("Sản phẩm bạn muốn tìm là:");
        for (int i = 0; i < danhSachCaPhe.size(); i++) {
            if (danhSachCaPhe.get(i).getTenSp().equals(name6)) {
                System.out.println(danhSachCaPhe.get(i).getTenSp());
            }
        }
    }


    private static void themSanPhamMoi(List<Coffee> danhSachCaPhe) {
        System.out.println("Mời bạn nhập vào số lượng sản phẩm muốn thêm:");
        int slp = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < slp; i++) {
            System.out.println("Mời bạn nhập mã sản phẩm thứ:" + (i + 1));
            int max = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập tên sản phẩm thứ " + (i + 1));
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập giá của sản phẩm thứ:" + (i + 1));
            double gia = Double.parseDouble(scanner.nextLine());
            System.out.println("Mời bạn nhập loại sản phẩm của sản phẩm thứ " + (i + 1));
            String loai = scanner.nextLine();
            System.out.println("Mời bạn nhập số lượng của sản phẩm thứ" + (i + 1));
            int sl = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời bạn nhập ngày sản xuất của sản phẩm thứ" + (i + 1));
            int ngaysx = Integer.parseInt(scanner.nextLine());
            danhSachCaPhe.add(new Coffee(max, name, gia, loai, sl, ngaysx));
        }
    }

    private static void lietKeDoAnDoUong(List<Coffee> danhSachCaPhe) {
        System.out.println("Nhập đồ ăn or đồ uống để xem chi tiết các loại:");
        String dadu = scanner.nextLine();
        System.out.println("Sản phẩm bạn muốn tìm là:");
        for (int i = 0; i < danhSachCaPhe.size(); i++) {
            if (danhSachCaPhe.get(i).getLoaiSanPham().equals(dadu)) {
                System.out.println(danhSachCaPhe.get(i).getTenSp());
            } else {
                System.out.println("Nhập đúng, điền dấu và không viết hoa hoặc có thể đồ của bạn không có");
            }
        }
    }


}


