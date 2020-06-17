/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import form.FormAwal;
import pojo.*;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import net.sf.jasperreports.engine.*; //JasperFileManager.JasperReport.JasperPrint
import net.sf.jasperreports.util.*; //JRLoader
import net.sf.jasperreports.view.*; //JasperViewer

import java.util.*; //HashMap
import java.io.File; //File
import java.sql.DriverManager;

import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.util.JRLoader;
/**
 *
 * @author Wildan A Geraldine
 */
public class ControlDiary {
    private static SessionFactory factory;
    
    public void koneksiDatabase(){
        try{
            factory = new Configuration().configure().buildSessionFactory();
        }catch(Throwable e){
            JOptionPane.showMessageDialog(null, "Error : "+e, "Error Koneksi Databases", 0);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                new FormAwal().setVisible(false);    
                }
                });
            
            System.exit(1);
        }
    }
    
    public static void buatAkun(Integer id, String username, String password){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            User user = new User(id, username, password);
            session.save(user);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null) tx.rollback();
            JOptionPane.showMessageDialog(null, "Error : "+e, "Gagal Membuat Akun", 0);
        }finally{
            session.close();
        }
    }
    
    public static void buatDiary(Integer id, java.util.Date tanggal, String judul, String isi){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Diary diary = new Diary(id, tanggal, judul, isi);
            session.save(diary);
            tx.commit();
        }catch(HibernateException e ){
            if(tx != null) tx.rollback();
            JOptionPane.showMessageDialog(null, "Gagal Membuat Diary : "+e, "Error", 0);
        }finally{
            session.close();
        }
    }
    
    
    public static void ubahDiary(Integer idDiary, String judul, String isi, java.util.Date tanggal){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Diary diary = (Diary) session.get(Diary.class, idDiary);
            diary.setJudul(judul);
            diary.setIsi(isi);
            diary.setTanggal(tanggal);
            session.update(diary);
            tx.commit();
        }catch(HibernateException e){
            if(tx != null) tx.rollback();
            JOptionPane.showMessageDialog(null, "Gagal Mengubah Diary : "+e, "Error", 0);
        }finally{
            session.close();
        }
    }
    
    public static void hapusDiary(Integer idDiary){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            Diary diary = (Diary) session.get(Diary.class, idDiary);
            session.delete(diary);
            tx.commit();            
        }catch(HibernateException e){
            if(tx != null) tx.rollback();
            JOptionPane.showMessageDialog(null, "Gagal Menghapus Diary : "+e, "Error", 0);
        }finally{
            session.close();
        }
    }
    
    public static void cetakDiary(int id){
        try{
            String nama_file = "./src/cetak/cetak_diary.jasper";
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/diary";
            String user = "root";
            String password = "1234";
            
            HashMap parameter = new HashMap();
            parameter.put("id", id);
            
            Class.forName(driver);
            java.sql.Connection konek = java.sql.DriverManager.getConnection(url, user, password);
            
            File cetak_file = new File(nama_file);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(cetak_file.getPath());
            JasperPrint jasperPrint =  JasperFillManager.fillReport(jasperReport, parameter, konek);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
            
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Data tidak dapat dicetak : "+e, "Cetak Data", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static boolean loginAkun(String username, String password){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            java.util.List listAkun = session.createQuery("FROM User").list();
            for(java.util.Iterator i = listAkun.iterator(); i.hasNext();){
                User akun = (User) i.next();
                if(akun.getUser().equals(username) && akun.getPassword().equals(password)){
                    return true;
                }else if(!akun.getUser().equals(username) || !akun.getPassword().equals(password)){
                    return false;
                }
            }
            tx.commit();
        }catch(HibernateException e){
            if(tx != null) tx.rollback();
            JOptionPane.showMessageDialog(null, "Error : "+e, "Gagal Login", 0);
        }finally{
            session.close();
        }
        return false;
    }
    
    public static boolean cekBuatAkun(){
        boolean cek = true;
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            java.util.List listAkun = session.createQuery("FROM User").list();
            for(java.util.Iterator i = listAkun.iterator(); i.hasNext();){
                User akun = (User) i.next();
                if(!akun.getUser().equals("")){
                    JOptionPane.showMessageDialog(null, "Username dan Password telah dibuat ! ");
                    cek = false;
                }
            }
            tx.commit();
        }catch(HibernateException e){
            if(tx != null) tx.rollback();
            JOptionPane.showMessageDialog(null, "Error : "+e, "Gagal Login", 0);
        }finally{
            session.close();
        }
        return cek;
    }
    
    public static void ubahAkun(String username, String password){
        Session session = factory.openSession();
        Transaction tx = null;
        try{
            tx = session.beginTransaction();
            User user = (User) session.get(User.class, 1);
            user.setUser(username);
            user.setPassword(password);
            session.update(user);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Akun Berhasil Diubah !");
        }catch(Exception e){
            if(tx != null) tx.rollback();
            JOptionPane.showMessageDialog(null, "Gagal Mengubah Akun : "+e, "Error", 0);
        }finally{
            session.close();
        }
    }
    
    public static String cekPassword(){
        Session session = factory.openSession();
        Transaction tx = null;
        String password = "";
        try{
            tx = session.beginTransaction();
            java.util.List listAkun = session.createQuery("FROM User").list();
            for(java.util.Iterator i = listAkun.iterator(); i.hasNext();){
                User akun = (User) i.next();
                password = akun.getPassword();
            }
            tx.commit();
        }catch(HibernateException e){
            if(tx != null) tx.rollback();
            JOptionPane.showMessageDialog(null, "Error : "+e, "Gagal Login", 0);
        }finally{
            session.close();
        }
        return password;
    }
}
