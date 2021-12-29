package com.anhnhh2008110020.phanmemquanlyhanghoa;

public class NhapThongTinHangHoa {

    // khai báo các thuộc tính cần thiết

    String loaiHang;
    int maHang;
    String tenHang;
    int giaNhap;
    int soLuong;
    String ngayNhap;

    //hàm tạo mặc định

    public NhapThongTinHangHoa(){

    }

    // hàm tạo chứa tham số

    public NhapThongTinHangHoa(String loaiHang, int maHang, String tenHang, int giaNhap, int soLuong, String ngayNhap) {
        this.loaiHang = loaiHang;
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.giaNhap = giaNhap;
        this.soLuong = soLuong;
        this.ngayNhap = ngayNhap;
    }


    //--------------------begin getter and settter--------------------//

    public String getLoai(){
        return loaiHang;
    }

    public void setLoai(String loaiHang){
        this.loaiHang = loaiHang;
    }

    public int getMa(){
        return maHang;
    }
    
    public void setMa(int maHang){
        this.maHang = maHang;
    }

    public String getTen(){
        return tenHang;
    }

    public void setTen(String tenHang){
        this.tenHang = tenHang;
    }

    public int getGia(){
        return giaNhap;
    }

    public void setGia(int giaNhap){
        this.giaNhap = giaNhap;
    }

    public int getLuong(){
        return soLuong;
    }

    public void setLuong(int soLuong){
        this.soLuong = soLuong;
    }

    public String getNgay(){
        return ngayNhap;
    }

    public void setNgay(String ngayNhap){
        this.ngayNhap = ngayNhap;
    }

    //--------------------end getter and setter--------------------//

    // hàm in thông tin

    public void inThongTin(){
        System.out.println("====================");
        System.out.print("Loại hàng hóa: "+loaiHang);
        System.out.print("Mã hàng hóa: "+maHang);
        System.out.print("Tên hàng hóa: "+tenHang);
        System.out.print("Giá nhập hàng: "+giaNhap);
        System.out.print("Số lượng tồn kho: "+soLuong);
        System.out.print("Ngày Nhập kho: "+ngayNhap);
        System.out.println("====================")
    }

}
