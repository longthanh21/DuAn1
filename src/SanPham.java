/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LongThank
 */
public class SanPham {

    private String maSP;
    private String tenSP;
    private String moTa;

    private String xuatXu;
    private String soLuong;
    private String giaBanDau;
    private String giaBan;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, String moTa, String xuatXu, String soLuong, String giaBanDau, String giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
        this.giaBanDau = giaBanDau;
        this.giaBan = giaBan;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getGiaBanDau() {
        return giaBanDau;
    }

    public void setGiaBanDau(String giaBanDau) {
        this.giaBanDau = giaBanDau;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    
}
