package com.anhnhh2008110020.phanmemquanlyhanghoa;
//bỏ
public class NodeHangHoa { //bỏ thuật toán xài cấu trúc ArrayList
    //Noi dung
    //dulieu
   NhapThongTinHangHoa data;
    NodeHangHoa next;

    //liênket
    public NodeHangHoa(){
        data=null;
        next=null;
    }
    public NodeHangHoa(NhapThongTinHangHoa k){
       data = k;
     next = null;
    }
    public NodeHangHoa(NhapThongTinHangHoa k, NodeHangHoa node){
        data=k;
        next = node;
    }
    
}
