package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Entities.sach;
import Entities.docgia;
import Entities.thuthu;
import Proceed.Giaotiep;
import Entities.phieumuon;

public class DAO {
private Connection conn;
    
    public DAO(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=QLTV;"
                    + "username=sa;password=manhcuong96");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //sach
    public boolean addSach(sach s){
        
        String sql = "INSERT INTO dbo.sach(masach, tensach, tacgia, soluong, theloai, tinhtrang) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getMasach());
            ps.setString(2, s.getTensach());
            ps.setString(3, s.getTacgia());
            ps.setInt(4, s.getSoluong());
            ps.setString(5, s.getTheloai());
            ps.setString(6, s.getTinhtrang());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean updateSach(sach s){
        
        String sql = "UPDATE dbo.sach SET masach ='"+s.getMasach()+"', tensach = '"+s.getTensach()+"', tacgia = '"+s.getTacgia()+"', soluong = '"+s.getSoluong()+"', tinhtrang = '"+s.getTinhtrang()+"' WHERE masach = '"+s.getMasach()+"'"
                ;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean removeSach(sach s){
        
        String sql = "DELETE FROM dbo.sach where masach = '"+s.getMasach()+"'"
        		;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    //docgia
    public boolean addDocGia(docgia s){
        
        String sql = "INSERT INTO dbo.docgia(madg, tendg, sdtdg, emaildg, diachi) "
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getMadg());
            ps.setString(2, s.getTendg());
            ps.setInt(3, s.getSdtdg());
            ps.setString(4, s.getEmaildg());
            ps.setString(5, s.getDiachi());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean updateDocGia(docgia s){
        
        String sql = "UPDATE dbo.docgia SET madg = '"+s.getMadg()+"', tendg = '"+s.getTendg()+"', sdtdg = '"+s.getSdtdg()+"',emaildg = '"+s.getEmaildg()+"', diachi = '"+s.getDiachi()+"' WHERE madg = '"+s.getMadg()+"'"
                ;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean removeDocGia(docgia s){
        
        String sql = "DELETE FROM dbo.docgia WHERE madg = '"+s.getMadg()+"'"
        		;
        try {
            PreparedStatement ps = conn.prepareStatement(sql); 
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    //thuthu
    public boolean addThuThu(thuthu s){
        
        String sql = "INSERT INTO dbo.thuthu(matt, tentt, emailtt, sdttt, diachitt) "
                + "VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getMatt());
            ps.setString(2, s.getTentt());
            ps.setString(3, s.getEmailtt());
            ps.setInt(4, s.getSdttt());
            ps.setString(5, s.getDiachi());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean updateThuThu(thuthu s){
        
        String sql = "UPDATE dbo.thuthu SET matt = '"+s.getMatt()+"', tentt = '"+s.getTentt()+"', emailtt = '"+s.getEmailtt()+"', sdttt = '"+s.getSdttt()+"', diachitt = '"+s.getDiachi()+"' WHERE matt = '"+s.getMatt()+"'"
                ;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    //phieumuon
    public boolean addPhieuMuon(phieumuon s){
        
        String sql = "INSERT INTO dbo.phieumuontrasach(madausach, maphieumuon, madocgia, ngaymuon) "
                + "VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, s.getMadausach());
            ps.setInt(2, s.getMaphieumuon());
            ps.setInt(3, s.getMadocgia());
            ps.setString(4, s.getNgaymuon());
            
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean updatePhieuMuon(phieumuon s){
        
        String sql = "UPDATE dbo.phieumuontrasach SET madausach = '"+s.getMadausach()+"', maphieumuon = '"+s.getMaphieumuon()+"', madocgia = '"+s.getMadocgia()+"', ngaymuon = '"+s.getNgaymuon()+"' WHERE maphieumuon =  '"+s.getMaphieumuon()+"'"
                ;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);    
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean removePhieuMuon(phieumuon s){
        
        String sql = "DELETE FROM dbo.phieumuontrasach WHERE maphieumuon = '"+s.getMaphieumuon()+"'"
        		;
        try {
            PreparedStatement ps = conn.prepareStatement(sql); 
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public boolean removeThuThu(thuthu s){
        
        String sql = "DELETE FROM dbo.thuthu WHERE matt = '"+s.getMatt()+"'"
        		;
        try {
            PreparedStatement ps = conn.prepareStatement(sql); 
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    public ArrayList<sach> getListSach(){
        ArrayList<sach> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.sach";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                sach s = new sach();
                s.setMasach(rs.getInt("masach"));
                s.setTensach(rs.getString("tensach"));
                s.setTacgia(rs.getString("tacgia"));
                s.setSoluong(rs.getInt("soluong"));
                s.setTheloai(rs.getString("theloai"));
                s.setTinhtrang(rs.getString("tinhtrang"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public ArrayList<docgia> getListDocGia(){
        ArrayList<docgia> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.docgia";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                docgia s = new docgia();
                s.setMadg(rs.getInt("madg"));
                s.setTendg(rs.getString("tendg"));
                s.setSdtdg(rs.getInt("sdtdg"));
                s.setEmaildg(rs.getString("emaildg"));
                s.setDiachi(rs.getString("Diachi"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public ArrayList<thuthu> getListThuThu(){
        ArrayList<thuthu> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.thuthu";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                thuthu s = new thuthu();
                s.setMatt(rs.getInt("matt"));
                s.setTentt(rs.getString("tentt"));
                s.setSdttt(rs.getInt("sdttt"));
                s.setEmailtt(rs.getString("emailtt"));
                s.setDiachi(rs.getString("diachitt"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
    public ArrayList<phieumuon> getListPhieuMuon(){
        ArrayList<phieumuon> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.phieumuontrasach";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                phieumuon s = new phieumuon();
                s.setMadausach(rs.getInt("madausach"));
                s.setMaphieumuon(rs.getInt("maphieumuon"));
                s.setMadocgia(rs.getInt("madocgia"));
                s.setNgaymuon(rs.getString("ngaymuon"));
                
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
    
//    public static void main(String[] args) {
//        new DAO();
//    }

    //public ArrayList<Giaotiep> getListDocGia() {
		// TODO Auto-generated method stub
		//return null;
	//}
	

}
