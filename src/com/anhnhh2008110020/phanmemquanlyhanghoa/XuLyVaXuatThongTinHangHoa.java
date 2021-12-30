package com.anhnhh2008110020.phanmemquanlyhanghoa;
//Created date:30-12-2021
//Infor: HaiAnh-2008110020-K14DCPM01
import java.text.ParseException;//class
import java.text.SimpleDateFormat;//định dạng ngày tháng năm
import java.util.ArrayList;//lớp trong java
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
//Cấu trúc ArrayList

public class XuLyVaXuatThongTinHangHoa {

    // 20 dữ liệu hàng hóa
    static void DuLieu(ArrayList<NhapThongTinHangHoa> kho){
        NhapThongTinHangHoa dl1 = new NhapThongTinHangHoa("Sành sứ","Lọ hoa",300000, 20 , "9-9-2021");
        kho.add(dl1);
        NhapThongTinHangHoa dl2 = new NhapThongTinHangHoa("Sành sứ", "Đĩa sứ",20000, 1, "21-9-2021");
        kho.add(dl2);
        NhapThongTinHangHoa dl3 = new NhapThongTinHangHoa("Điện máy", "TV", 2000000, 2, "5-9-2021");
        kho.add(dl3);
        NhapThongTinHangHoa dl4 = new NhapThongTinHangHoa("Điện máy", "Máy giặt",7000000,1,"4-9-2021");
        kho.add(dl4);
        NhapThongTinHangHoa dl5 = new NhapThongTinHangHoa("Thực phẩm","Bánh su kem", 200000,3,"6-9-2021");
        kho.add(dl5);
        NhapThongTinHangHoa dl6 = new NhapThongTinHangHoa("Thực phẩm","Sữa Milo", 40000,6,"30-10-2021");
        kho.add(dl6);
        NhapThongTinHangHoa dl7 = new NhapThongTinHangHoa("Sành sứ","Bát sứ",30000, 3,"6-7-2021");
        kho.add(dl7);
        NhapThongTinHangHoa dl8 = new NhapThongTinHangHoa("Sành sứ","Chén sứ", 54000,4,"7-7-2021");
        kho.add(dl8);
        NhapThongTinHangHoa dl9 = new NhapThongTinHangHoa("Điện máy", "Lò vi sóng",530000,1,"11-10-2021");
        kho.add(dl9);
        NhapThongTinHangHoa dl10 = new NhapThongTinHangHoa("Điện máy","Bếp điện",300000,2,"9-10-2021");
        kho.add(dl10);
        NhapThongTinHangHoa dl11 = new NhapThongTinHangHoa("Thực phẩm","Trứng vịt lộn",25000,3,"2-3-2021");
        kho.add(dl11);
        NhapThongTinHangHoa dl12 = new NhapThongTinHangHoa("Thực phẩm","Kẹo mút",39000,21,"3-2-2021");
        kho.add(dl12);
        NhapThongTinHangHoa dl13 = new NhapThongTinHangHoa("Sành sứ","Chậu hoa",400000,1,"5-3-2021");
        kho.add(dl13);
        NhapThongTinHangHoa dl14 = new NhapThongTinHangHoa("Sành sứ","Bình bông",100000,2,"27-11-2021");
        kho.add(dl14);
        NhapThongTinHangHoa dl15 =new NhapThongTinHangHoa("Điện máy","Bình đun nước", 120000,2,"28-11-2021");
        kho.add(dl15);
        NhapThongTinHangHoa dl16 = new NhapThongTinHangHoa("Điện máy","Máy lạnh",900000,1,"10-10-2021");
        kho.add(dl16);
        NhapThongTinHangHoa dl17 = new NhapThongTinHangHoa("Thực phẩm","Bánh mỳ",120000,10,"19-10-2021");
        kho.add(dl17);
        NhapThongTinHangHoa dl18 = new NhapThongTinHangHoa("Thực phẩm","Sandwich",32000,4,"11-11-2021");
        kho.add(dl18);
        NhapThongTinHangHoa dl19 = new NhapThongTinHangHoa("Sành sứ","Cốc nước",33000,1,"5-6-2021");
        kho.add(dl19);
        NhapThongTinHangHoa dl20 = new NhapThongTinHangHoa("Sành sứ","Gốm sứ",60000,2,"7-7-2021");
        kho.add(dl20);
    }
    public static void GiaTang(ArrayList<NhapThongTinHangHoa> kho){
        Collections.sort(kho, new Comparator<NhapThongTinHangHoa>() {
            public int compare(NhapThongTinHangHoa o1, NhapThongTinHangHoa o2){
                return o1.giaNhap-o2.giaNhap;
            }
        });
    }
    public static void GiaGiam(ArrayList<NhapThongTinHangHoa>kho){
        Collections.sort(kho, new Comparator<NhapThongTinHangHoa>() {
            public int compare(NhapThongTinHangHoa o1, NhapThongTinHangHoa o2){
                return o2.giaNhap-o1.giaNhap;
            }
            
        });
    }
    public static void NgayTang(NhapThongTinHangHoa [] kho ) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
        NhapThongTinHangHoa n = kho[0];
        for (int i =0;i<kho.length-1;i++){
            for(int j = i+1;j<kho.length;j++){
               Date ngayDau= simpleDateFormat.parse(kho[i].ngayNhap);
               Date ngayCuoi= simpleDateFormat.parse(kho[j].ngayNhap);
               if(ngayDau.after(ngayCuoi)==true){
                   n=kho[j];
                   kho[j]=kho[i];
                   kho[i] = n;
               }

            }
        }
    }
    public static void NgayGiam(NhapThongTinHangHoa[]kho) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("đ-mm-yyyy");
        NhapThongTinHangHoa n =kho[0];
        for(int i =0; i<kho.length-1;i++){
            for(int j=i+1;j<kho.length;j++){
               Date ngayDau =simpleDateFormat.parse(kho[i].ngayNhap);
                Date ngayCuoi =simpleDateFormat.parse(kho[j].ngayNhap);
                if(ngayDau.before(ngayCuoi)==true){
                    n= kho[j];
                    kho[j]=kho[i];
                    kho[i] = n;
                }
            }
        }
    }

   
    public static void Menubar(){
        System.out.println("============CHƯƠNG TRÌNH PHẦN MỀM QUẢN LÝ DANH SÁCH HÀNG HÓA KHO SIÊU THỊ================");
        System.out.println("=> Chức năng 1: Thêm hàng hóa vào danh sách");
        System.out.println("=> Chức năng 2: Sửa hàng hóa trong danh sách ");
        System.out.println("=> Chức năng 3: Xóa hàng hóa trong danh sách");
        System.out.println("=> Chức năng 4: Tìm kiếm hàng hóa trong danh sách");
        System.out.println("=> Chức năng 5: Sắp xếp hàng hóa trong danh sách");
        System.out.println("=> Chức năng 6: Thống kê danh sách hàng hóa");
        System.out.println("=> Chức năng 7: Thoát chương trình");
        System.out.println("===================================KẾT THÚC PHẦN MỀM======================================");
        System.out.println();
    }
    
    public static void XuatThongTinHangHoa(NhapThongTinHangHoa nhap){
        System.out.println("=================XUẤT DANH SÁCH HÀNG HÓA===========");
        System.out.println("Mã hàng: "+nhap.maHang);
        System.out.println("Tên hàng: "+nhap.getTen());
        System.out.println("Loại hàng: "+nhap.getLoai());
        System.out.println("Giá nhập hàng: "+nhap.getGia());
        System.out.println("Số lượng tồn kho: "+nhap.getLuong());
        System.out.println("Ngày nhập kho: "+nhap.getNgay());
        System.out.println("================DỪNG XUẤT DANH SÁCH================");
        System.out.println();
    }
    public static int VarInput(String v){
        Scanner varInput = new Scanner(System.in);
        System.out.println("Biến nhập: "+v);
        while(!varInput.hasNextInt()){
            System.out.println("Bạn nhập sai rồi. Vui lòng nhập lại: "+v);
            varInput.next();
        }
        int r = varInput.nextInt();
        return r;
    }
    public static String Chuoi(String v){
        Scanner varInput = new Scanner (System.in);
        System.out.println("Biến nhập: "+v);
        while(!varInput.hasNextLine()){
            System.out.println("Bạn nhập sai rồi. Vui lòng nhập lại: "+v);
            varInput.next();
        }
        String r =varInput.nextLine();
        return r;
    } 
    public static String Ngay(String v){
        Scanner varInput = new Scanner(System.in);
        System.out.println("Biến nhập: "+v);
        String dd,mm,yyyy;
        while(true){
            dd = Integer.toString(VarInput("Biến nhập ngày: "));
            if(dd.length()==2){
                System.out.println("Nhập thành công!");
                break;
            }
            else{
                System.out.println("Bạn nhập sai rồi. Vui lòng nhập lại!");
                continue;
            }
        }
        while(true){
            mm=Integer.toString(VarInput("Biến nhập tháng: "));
            if(mm.length()==2){
                System.out.println("Nhập thành công!");
                break;
            }
            else{
                System.out.println("Bạn nhập sai rồi.Vui lòng nhập lại");
                continue;
            }
        }
        while(true){
            yyyy=Integer.toString(VarInput("Biến nhập năm:"));
            if(yyyy.length()==4){
                System.out.println("Nhập thành công!");
                break;
            }
            else{
                System.out.println("Bạn nhập sai rồi. Vui lòng nhập lại!");
                continue;
            }
        }
        String r = dd+"-"+mm+"-"+yyyy;
        return r;
    }

   
    public static void main(String[] args) throws ParseException {

        
        /**
         * dd: ngày
         * mm: tháng
         * yyyy: năm
         */
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");

        ArrayList<NhapThongTinHangHoa> dsHangHoa = new ArrayList<>();
        DuLieu(dsHangHoa);
        
        int suLuaChon = VarInput("Sự lựa chon");

        while(true){
            Menubar();
            
            if(suLuaChon == 1){
                System.out.println("===================CHỨC NĂNG 1: THÊM HÀNG HÓA===================");
                System.out.println("Thông tin hàng hóa: ");
                String loaiHang;
                while(true){
                    System.out.println("====================PHÂN LOẠI HÀNG HÓA==========");
                    System.out.println("<<Phân loại 1: Thực phẩm ");
                    System.out.println("<<Phân loại 2: Sành sứ ");
                    System.out.println("<<Phân loại 3: Điện máy ");
                    System.out.println("===================KẾT THÚC PHÂN LOẠI===========");
                    int luaChon1= VarInput("Sự lựa chọn: ");

                    if(luaChon1 == 1){
                         loaiHang = "<<Phân loại 1: Thực phẩm";
                         System.out.println("Đã thêm loại hàng hóa: thực phẩm");
                         break;//ngắt
                    }
                    else if(luaChon1 ==2){
                        loaiHang = "<<Phân loại 2: Sành sứ";
                        System.out.println("Đã thêm loại hàng hóa: sành sứ");
                        break;//ngắt
                    }

                    else if(luaChon1 ==3){
                        loaiHang = "Phân loại 3: Điện máy";
                        System.out.println("Đã thêm loại hàng hóa: điện máy");
                        break;//ngắt
                    }
                     else{
                         System.out.println("Chọn sai rồi. Chọn lại đi =>1-3");
                         continue;//bỏ qua
                     }   
        
                }

                String tenHang = Chuoi("Tên hàng hóa: "); 
                int giaNhap = VarInput("Giá nhập hàng hóa: ");
                int soLuong = VarInput("Số lượng hàng hóa: ");
                String ngayNhap = Chuoi("Ngày nhập hàng hóa: ");
                NhapThongTinHangHoa lamMoi = new NhapThongTinHangHoa(loaiHang, tenHang, giaNhap, soLuong, ngayNhap);
                dsHangHoa.add(lamMoi);
                System.out.println("Đã thêm hàng hóa vào trong kho siêu thị");
                System.out.println("============================THOÁT CHƯC NĂNG 1====================");
            }

            else if(suLuaChon == 2){
                System.out.println("====================CHỨC NĂNG 2: SỬA HÀNG HÓA====================");
                int maHangHoa = VarInput("Mã hàng hóa: ");
                for(NhapThongTinHangHoa thongTin: dsHangHoa){
                    if(thongTin.maHang == maHangHoa){
                        XuatThongTinHangHoa(thongTin);
                        String loaiMoi;
                        while(true){

                            System.out.println("====================PHÂN LOẠI HÀNG HÓA====================");
                            System.out.println("<<Phân loại 1: Thực phẩm ");
                            System.out.println("<<Phân loại 2: Sành sứ ");
                            System.out.println("<<Phân loại 3: Điện máy");
                            System.out.println("===================KẾT THÚC PHÂN LOẠI=====================");
                            int luaChon2 = VarInput("Lựa chọn 2");
                            if(luaChon2 ==1){
                                loaiMoi = "Thực phẩm";
                                System.out.println("Đã sửa hàng hóa: thực phẩm");
                                break;//ngắt
                            }
                            else if(luaChon2 == 2){
                                loaiMoi = "Sành sứ";
                                System.out.println("Đã sửa hàng hóa: sành sứ");
                                break;//ngắt
                            }
                            else if(luaChon2 ==3){
                                loaiMoi = "Điện máy";
                                System.out.println("Đã sửa hàng hóa: điện máy");
                                break;//ngắt                              
                            }
                            else{
                                System.out.println("Chọn sai rồi. Chọn lại đi 1=>3");
                                continue;
                            }
                        }
                        String tenHH = Chuoi("Tên hàng hóa");
                        int giaNhapHH = VarInput("Giá nhập hàng hóa:");
                        int soLuongTK = VarInput("Số lượng tồn kho: ");
                        String ngayNhapHH = Chuoi ("Ngày nhập hàng hóa");
                        thongTin.setLoai(loaiMoi);
                        thongTin.setTen(tenHH);
                        thongTin.setGia(giaNhapHH);
                        thongTin. setLuong(soLuongTK);
                        thongTin.setNgay(ngayNhapHH);
                        System.out.println("Đã sửa hàng hóa trong kho siêu thị");
                        break;
                    }
                    else if(dsHangHoa.indexOf(thongTin) < dsHangHoa.size()){
                        continue;//bỏ qua
                    } 
                    else{
                        System.out.println("Không xóa được hàng hóa.Lỗi!");
                    }   
                }
                System.out.println("====================THOÁT CHỨC NĂNG 2====================");
               
            }
            else if(suLuaChon==3){
                System.out.println("=================CHỨC NĂNG 3: XÓA HÀNG HÓA================");
                int maHangHoa = VarInput("Mã hàng hóa");
                int lietKeHH = VarInput("Liệt kê hàng hóa");
                for (NhapThongTinHangHoa nhapThongTinHangHoa : dsHangHoa) {
                    if(nhapThongTinHangHoa.maHang == maHangHoa){
                        lietKeHH =dsHangHoa.indexOf(nhapThongTinHangHoa);
                        System.out.println("Đã xóa hàng hóa trong kho siêu thị");
                        System.out.println("===========THOÁT CHỨC NĂNG 3 =====================");
                        break;
                        
                    }
                }
            }
            else if(suLuaChon == 4){
                while (true){
                    System.out.println("===============CHỨC NĂNG 4: TÌM KIẾM HÀNG HÓA=============");
                    System.out.println(">>Tìm kiếm 1: Loại hàng");
                    System.out.println(">>Tìm kiếm 2: Giá Nhập");
                    System.out.println(">>Tìm kiếm 3: Ngày Nhập");
                    System.out.println(">>Tìm kiếm 4: Trở về");
                    System.out.println("===================KẾT THÚC CHỨC NĂNG 4=============");
                    int luaChon4 = VarInput("Lựa chọn 4");
                    
                    if(luaChon4 ==1){
                        System.out.println("Thông tin loại hàng hóa đã phân loại: ");
                        String timLoaiHH;
                        while(true){
                            System.out.println("==================PHÂN LOẠI HÀNG HÓA===================");
                            System.out.println(">>Loại 1: Thực phẩm");
                            System.out.println(">>Loại 2: Sành sứ");
                            System.out.println(">>Loại 3: Điện máy");
                            System.out.println("=================KẾT THÚC PHÂN LOẠI====================");
                            int luaChon5 = VarInput("Lựa chọn 5");
                            if(luaChon5 ==1){
                                timLoaiHH="Thực phẩm";
                                System.out.println("Đã xóa loại hàng hóa: Thực phẩm");
                                break;
                            }
                            else if(luaChon5 ==2){
                                timLoaiHH="Sành sứ";
                                System.out.println("Đã xóa loại hàng hóa: Sành sứ");
                                break;
                            }
                            else if(luaChon5 == 3){
                                timLoaiHH = "Điện máy";
                                System.out.println("Đã xóa loại hàng hóa: Điện máy");
                            }
                            else{
                                System.out.println("Chọn sai rồi. Chọn lại đi 1=>3");
                                continue;
                            }
                        }
                       for (NhapThongTinHangHoa nhapThongTinHangHoa : dsHangHoa) {
                           if(nhapThongTinHangHoa.loaiHang ==timLoaiHH){
                               XuatThongTinHangHoa(nhapThongTinHangHoa);
                           }
                       }

                    }
                    else if(luaChon4 ==2){
                        int giaNhapThap = VarInput("Giá nhập thấp");
                        int giaNhapCao = VarInput("Giá nhập cao");
                        for (NhapThongTinHangHoa nhapThongTinHangHoa : dsHangHoa) {
                            if(giaNhapThap <= nhapThongTinHangHoa.giaNhap &&nhapThongTinHangHoa.giaNhap<= giaNhapCao){
                                XuatThongTinHangHoa(nhapThongTinHangHoa);
                            }
                        }
                    }
                    else if(luaChon4 ==3){
                        String ngayBatDau = Chuoi("Ngày Bắt Đầu:");
                        String ngayKetThuc = Chuoi("Ngày kết thúc");
                        Date ngayDau = simpleDateFormat.parse(ngayBatDau);
                        Date ngayCuoi = simpleDateFormat.parse(ngayKetThuc);
                        for (NhapThongTinHangHoa nhapThongTinHangHoa : dsHangHoa) {
                            Date ngayNhap = simpleDateFormat.parse(nhapThongTinHangHoa.ngayNhap);
                            if (ngayDau.before(ngayNhap)==true && ngayCuoi.after(ngayCuoi)==true){
                                XuatThongTinHangHoa(nhapThongTinHangHoa);
                            }
                            else if(ngayDau.equals(ngayNhap)==true || ngayCuoi.after(ngayNhap)==true){
                                XuatThongTinHangHoa(nhapThongTinHangHoa);
                            }
                           
                        }
                    }
                    else if(luaChon4 ==4){
                        System.out.println("Quay lại tìm kiếm");
                        break;
                    }
                    else{
                        System.out.println("Thất bại");
                        continue;
                    }

                }
            }

            else if (suLuaChon == 5 ){
                
                ArrayList<NhapThongTinHangHoa> dsThucPham = new ArrayList<NhapThongTinHangHoa>();
                ArrayList<NhapThongTinHangHoa> dsSanhSu= new ArrayList<NhapThongTinHangHoa>();
                ArrayList<NhapThongTinHangHoa> dsDienMay=new ArrayList<NhapThongTinHangHoa>();

                for (NhapThongTinHangHoa nhapThongTinHangHoa : dsHangHoa) {
                    if(nhapThongTinHangHoa.loaiHang =="Thực phẩm"){
                        dsThucPham .add(nhapThongTinHangHoa);
                    }
                    else if(nhapThongTinHangHoa.loaiHang =="Sảnh sứ"){
                        dsSanhSu.add(nhapThongTinHangHoa);
                    }
                    else{
                        dsDienMay.add(nhapThongTinHangHoa);
                    }

                }
                NhapThongTinHangHoa[] khoThucPham = dsThucPham.toArray(new NhapThongTinHangHoa[dsThucPham.size()]);
                NhapThongTinHangHoa[] khoSanhSu = dsSanhSu.toArray(new NhapThongTinHangHoa[dsSanhSu.size()]);
                NhapThongTinHangHoa[] khoDienMay = dsDienMay.toArray(new NhapThongTinHangHoa[dsDienMay.size()]);

                while(true){
                    System.out.println("==================CHỨC NĂNG 5: SẮP XẾP HÀNG HÓA===================");
                    System.out.println(">>1. Sắp xếp theo giá nhập hàng hóa tăng dần");
                    System.out.println(">>2. Sắp xếp theo giá nhập hàng hóa giảm dần");
                    System.out.println(">>3. Sắp xếp theo ngày nhập hàng hóa tăng dần");
                    System.out.println(">>4. Sắp xếp theo ngày nhập hàng hóa giảm dần");
                    System.out.println(">>5. Trở về");
                    System.out.println("====================THOÁT CHỨC NĂNG 5==============================");
                    int luaChon6 = VarInput("Lựa chọn 6");
                    if(luaChon6 == 1){
                        GiaTang(dsThucPham);
                        GiaTang(dsSanhSu);
                        GiaTang(dsDienMay);
                        System.out.println("==============XUẤT GIÁ NHẬP THỰC PHẨM TĂNG===============");
                        for (NhapThongTinHangHoa nhapThongTinHangHoa : dsThucPham) {
                            XuatThongTinHangHoa(nhapThongTinHangHoa);
                            
                        }
                        System.out.println("=============XUẤT GIÁ NHẬP SÀNH SỨ TĂNG==================");
                        for (NhapThongTinHangHoa nhapThongTinHangHoa : dsSanhSu) {
                            XuatThongTinHangHoa(nhapThongTinHangHoa);
                        }
                        System.out.println("=============XUẤT GIÁ NHẬP ĐIỆN MÁY TĂNG================");
                        for (NhapThongTinHangHoa nhapThongTinHangHoa : dsDienMay) {
                            XuatThongTinHangHoa(nhapThongTinHangHoa);
                        }
                    }
                    else if(luaChon6==2){
                        GiaGiam(dsThucPham);
                        GiaGiam(dsSanhSu);
                        GiaGiam(dsDienMay);
                        System.out.println("===============XUẤT GIÁ NHẬP THỰC PHẨM GIẢM============");
                        for (NhapThongTinHangHoa nhapThongTinHangHoa : dsThucPham) {
                            XuatThongTinHangHoa(nhapThongTinHangHoa);
                            
                        }
                        System.out.println("==============XUẤT GIÁ NHẬP SÀNH SỨ GIẢM===============");
                        for (NhapThongTinHangHoa nhapThongTinHangHoa : dsSanhSu) {
                            XuatThongTinHangHoa(nhapThongTinHangHoa);
                        }
                        System.out.println("=============XUẤT GIÁ NHẬP ĐIỆN MÁY GIẢM===============");
                        for (NhapThongTinHangHoa nhapThongTinHangHoa : dsDienMay) {
                            XuatThongTinHangHoa(nhapThongTinHangHoa);
                            
                        }
                        
                    }
                    else if(luaChon6 ==3){
                        NgayTang(khoThucPham);
                        NgayTang(khoSanhSu);
                        NgayTang(khoDienMay);
                        System.out.println("==================XUẤT NGÀY TĂNG THỰC PHẨM=============");
                        for(int i=0;i<khoThucPham.length;i++){
                            XuatThongTinHangHoa(khoThucPham[i]);
                        }
                        System.out.println("==================XUẤT NGÀY GIẢM THỰC PHẨM=============");
                        for(int i=0; i<khoSanhSu.length;i++){
                            XuatThongTinHangHoa(khoSanhSu[i]);
                        }
                        System.out.println("=================XUẤT NGÀY TĂNG THỰC PHẨM=============");
                        for(int i=0; i<khoDienMay.length;i++){
                            XuatThongTinHangHoa(khoDienMay[i]);
                        }
                    }
                    else if(luaChon6 == 4){
                        NgayGiam(khoThucPham);
                        NgayGiam(khoSanhSu);
                        NgayGiam(khoDienMay);
                        System.out.println("================XUẤT NGÀY GIẢM THỰC PHẨM===============");
                        for(int j=0;j<khoThucPham.length;j++){
                            XuatThongTinHangHoa(khoThucPham[j]);
                        }
                        for(int j=0;j<khoSanhSu.length;j++){
                            XuatThongTinHangHoa(khoSanhSu[j]);
                        }
                        for(int j=0;j<khoDienMay.length;j++){
                            XuatThongTinHangHoa(khoDienMay[j]);
                        }

                    }
                    else if(luaChon6 == 5){
                        System.out.println("Quay lại sắp xếp");
                        break;
                    }
                    else{
                        System.out.println("Thất bại!");
                        continue;
                    }

                }
                
            }
            else if(suLuaChon==6){
                System.out.println("==========================CHỨC NĂNG 6: THỐNG KÊ HÀNG HÓA===================");
                int thongKeSoLuongHH =0;
                int thongKeGiaHH = 0;
                int thongKeThucPham = 0;
                int thongKeSanhSu =0;
                int thongKeDienMay = 0;
                for (NhapThongTinHangHoa nhapThongTinHangHoa : dsHangHoa) {
                     thongKeSoLuongHH = thongKeSoLuongHH +nhapThongTinHangHoa.soLuong;
                     int gia = nhapThongTinHangHoa.soLuong*nhapThongTinHangHoa.giaNhap; 
                     thongKeGiaHH = thongKeGiaHH + gia;
                     if(nhapThongTinHangHoa.loaiHang== "Thực phẩm"){
                         thongKeThucPham = thongKeThucPham+nhapThongTinHangHoa.soLuong;
                     }
                     else if(nhapThongTinHangHoa.loaiHang=="Sành sứ"){
                         thongKeSanhSu = thongKeSanhSu+nhapThongTinHangHoa.soLuong;
                     }
                     else{
                         thongKeDienMay = thongKeDienMay+nhapThongTinHangHoa.soLuong;
                     }
                }
                System.out.println("Thống kê kho hàng hóa: "+Integer.toString(thongKeGiaHH));
                System.out.println("Thống kê loại hàng thực phẩm: "+Integer.toString(thongKeThucPham));
                System.out.println("Thống kê loại hàng sành sứ: "+Integer.toString(thongKeSanhSu));
                System.out.println("Thống kê loại hàng điện máy: "+Integer.toString(thongKeDienMay));
                System.out.println("===========================THOÁT CHỨC NĂNG 6==================");
            }
            
            else if(suLuaChon == 7){
                System.out.println("==================THOÁT CHƯƠNG TRÌNH PHẦN MỀM================");
            }
            else{
                System.out.println("Nhập không chính xác");
            }
            
        }
        
        
    }
   
   
    
    
}
