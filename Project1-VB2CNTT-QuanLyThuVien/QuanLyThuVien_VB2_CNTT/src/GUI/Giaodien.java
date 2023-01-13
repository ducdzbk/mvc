package GUI;

import java.sql.*;
import Entities.docgia;
import Entities.thuthu;
import Entities.phieumuon;
import Entities.sach;
import Proceed.Giaotiep;
import Proceed.docghifile;
//import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import controller.DAO;

import java.awt.Component;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public final class Giaodien extends javax.swing.JFrame {

    DefaultTableModel model;//tao model cho bang sach
    DefaultTableModel model1;//tao model cho bang doc gia
    DefaultTableModel model2;//tạo model cho bang muon tra
    DefaultTableModel model3;//tao model cho bang thu thu
    private ArrayList<sach> listsach;//tao ra danh sach
    private ArrayList<docgia> listdocgia;//tao ra danh sach doc gia
    private ArrayList<phieumuon> listphieumuon;//tao phieu muon
    private ArrayList<thuthu> listthuthu;//tao danh sach thu thu
    docghifile ioFile;// docghifile

    public Giaodien() {
        ioFile = new docghifile();
        listsach = new ArrayList<>();
        listdocgia = new ArrayList<>();
        listphieumuon = new ArrayList<>();
        listthuthu = new ArrayList<>();
        listsach = ioFile.doc("sach.DAT");
        listdocgia = ioFile.doc("docgia.DAT");
        listphieumuon = ioFile.doc("phieumuon.DAT");
        listthuthu = ioFile.doc("thuthu.DAT");
        initComponents();
        listsach = new DAO().getListSach();
        listdocgia = new DAO().getListDocGia();
        listphieumuon = new DAO().getListPhieuMuon();
        listthuthu = new DAO().getListThuThu();
        model = (DefaultTableModel) banghienthisach.getModel();
        model1 = (DefaultTableModel) banghienthidg.getModel();
        model2 = (DefaultTableModel) banghienthiphieumuon.getModel();
        model3 = (DefaultTableModel) banghienthitt.getModel();
        hienthisach();
        hienthidocgia();
        hienthiphieumuon();
        hienthithuthu();
        
    }

    public void hienthisach() {
        for (Giaotiep g : listsach) {
            sach s = (sach) g;
            model.addRow(new Object[]{
                s.getMasach(), s.getTensach(), s.getTheloai(), s.getTacgia(), s.getSoluong(), s.getTinhtrang()
            });
        }
    }

    public void hienthidocgia() {
        for (Giaotiep g : listdocgia) {
            docgia dg = (docgia) g;
            model1.addRow(new Object[]{
                dg.getMadg(), dg.getTendg(), dg.getDiachi(), dg.getEmaildg(), dg.getSdtdg()
            });
        }
    }

    public void hienthiphieumuon() {
        for (Giaotiep g : listphieumuon) {
            phieumuon pm = (phieumuon) g;
            model2.addRow(new Object[]{
                pm.getMadausach(), pm.getMaphieumuon(), pm.getMadocgia(), pm.getNgaymuon()
            });
        }
    }
    
    public void hienthithuthu() {
        for (Giaotiep g : listthuthu) {
        	thuthu tt = (thuthu) g;
            model3.addRow(new Object[]{
                tt.getMatt(), tt.getTentt(), tt.getDiachi(), tt.getEmailtt(), tt.getSdttt()
            });
        }
    }

    private void initComponents() {
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        nÃºtuakhachmuon = new javax.swing.JButton();
        nutluukhachmuon = new javax.swing.JButton();
        nutthemkhach = new javax.swing.JButton();
        nuthuy3 = new javax.swing.JButton();
        nutxoakhachmuon = new javax.swing.JButton();
        NutThoat3 = new javax.swing.JButton();
        nhapngay = new javax.swing.JTextField();
        nhapmaspm = new javax.swing.JTextField();
        nhapmadgpm = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        banghienthiphieumuon = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        nhaptukhoapm = new javax.swing.JTextField();
        nuttimpm = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        suadg = new javax.swing.JButton();
        luudg = new javax.swing.JButton();
        themdg = new javax.swing.JButton();
        nuthuy2 = new javax.swing.JButton();
        xoadg = new javax.swing.JButton();
        nutThoat2 = new javax.swing.JButton();
        nhapsdt = new javax.swing.JTextField();
        nhapemail = new javax.swing.JTextField();
        nhapdiachi = new javax.swing.JTextField();
        nhaptendg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        //độc giả
        banghienthidg = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        nhaptukhoadg = new javax.swing.JTextField();
        nuttimdg = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tongsosach = new javax.swing.JTextField();
        tongsodg = new javax.swing.JTextField();
        tongsott = new javax.swing.JTextField();
        tongsopm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        //sách
        banghienthisach = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nhaptensach = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nhaptheloaisach = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nhaptacgia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nhapsoluongsach = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tinhtrangsach = new javax.swing.JComboBox<>();
        themsach = new javax.swing.JButton();
        nutsuasach = new javax.swing.JButton();
        luusach = new javax.swing.JButton();
        nuthuy1 = new javax.swing.JButton();
        nutxoa = new javax.swing.JButton();
        nutThoat1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        nhaptukhoasach = new javax.swing.JTextField();
        nuttimsach = new javax.swing.JButton();

        //thủ thư
        banghienthitt = new javax.swing.JTable();
        suatt = new javax.swing.JButton();
        luutt = new javax.swing.JButton();
        themtt = new javax.swing.JButton();
        nuthuy4 = new javax.swing.JButton();
        xoatt = new javax.swing.JButton();
        nutThoat4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        nhaptukhoatt = new javax.swing.JTextField();
        nuttimtt = new javax.swing.JButton();
        nhaptentt = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        nhapsdttt = new javax.swing.JTextField();
        nhapemailtt = new javax.swing.JTextField();
        nhapdiachitt = new javax.swing.JTextField();
      
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý thư viện - VB2 - CNTT");
        jTabbedPane1.setName("VB2_CNTT"); 

      //Quản lý độc giả

        suadg.setText("Sửa");
        suadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suadgActionPerformed(evt);
            }
        });

        luudg.setText("Lưu");
        luudg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luudgActionPerformed(evt);
            }
        });

        themdg.setText("Thêm");
        themdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themdgActionPerformed(evt);
            }
        });

        nuthuy2.setText("Hủy");
        nuthuy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy2ActionPerformed(evt);
            }
        });

        xoadg.setText("Xóa");
        xoadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoadgActionPerformed(evt);
            }
        });

        nutThoat2.setText("Thoát");
        nutThoat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThoat2ActionPerformed(evt);
            }
        });

        nhapdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapdiachiActionPerformed(evt);
            }
        });

        jLabel11.setText("Tên độc giả");

        jLabel12.setText("Quê quán");

        jLabel13.setText("Email");

        jLabel14.setText("Số điện thoại");

        banghienthidg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã độc giả", "Tên độc giả", "Quê quán", "email", "Số điện thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(banghienthidg);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Tìm kiếm");

        jLabel26.setText("Nhập nội dung: ");

        nuttimdg.setText("Tìm");
        nuttimdg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimdgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel26)
                            .addGap(33, 33, 33))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel13))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nhaptendg, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(nhapemail))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(themdg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(suadg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nhaptukhoadg, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(nuttimdg, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(348, 348, 348))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(nhapsdt))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(37, 37, 37)
                                .addComponent(nhapdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nutThoat2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(xoadg, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(luudg, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(nuthuy2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(nhaptendg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addComponent(jLabel12))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nhapemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nhapdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(nhapsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhaptukhoadg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuttimdg)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(nutThoat2)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themdg)
                            .addComponent(suadg)
                            .addComponent(xoadg)
                            .addComponent(luudg)
                            .addComponent(nuthuy2))
                        .addGap(94, 94, 94))))
        );

        jTabbedPane1.addTab("Quản lý độc giả", jPanel2);
        
        //Quản lý sách --------------------------------------

        banghienthisach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Tác giả", "Số lượng", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(banghienthisach);

        jLabel6.setText("Tên sách");

        nhaptensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptensachActionPerformed(evt);
            }
        });

        jLabel7.setText("Thể loại");

        nhaptheloaisach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaptheloaisachActionPerformed(evt);
            }
        });

        jLabel8.setText("Tác giả");

        jLabel9.setText("Số lượng");

        jLabel10.setText("Tình trạng");

        tinhtrangsach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));
        tinhtrangsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinhtrangsachActionPerformed(evt);
            }
        });

        themsach.setBackground(new java.awt.Color(255, 255, 255));
        themsach.setText("Thêm");
        themsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themsachActionPerformed(evt);
            }
        });

        nutsuasach.setText("Sửa");
        nutsuasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutsuasachActionPerformed(evt);
            }
        });

        luusach.setText("Lưu");
        luusach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luusachActionPerformed(evt);
            }
        });

        nuthuy1.setText("Hủy");
        nuthuy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy1ActionPerformed(evt);
            }
        });

        nutxoa.setText("Xóa");
        nutxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoaActionPerformed(evt);
            }
        });

        nutThoat1.setText("Thoát");
        nutThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThoat1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel24.setText("Tìm kiếm");

        jLabel25.setText("Nhập nội dung:");

        nuttimsach.setText("Tìm");
        nuttimsach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimsachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(jLabel24)
                .addGap(209, 209, 209)
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(nhaptensach, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(nhaptacgia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jLabel25)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(themsach, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nhaptukhoasach, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(nutThoat1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(nutsuasach, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(55, 55, 55)
                                    .addComponent(nutxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(luusach, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(nuthuy1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nuttimsach)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(nhaptheloaisach, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                            .addComponent(nhapsoluongsach, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(206, 206, 206)))
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nhaptensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(nhaptheloaisach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhaptacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(nhapsoluongsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel10)
                    .addComponent(tinhtrangsach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nhaptukhoasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuttimsach))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themsach)
                    .addComponent(nutsuasach)
                    .addComponent(nutxoa)
                    .addComponent(luusach)
                    .addComponent(nuthuy1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(nutThoat1)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Quản lý sách", jPanel1);
        
        //Quản lý mượn trả
        nÃºtuakhachmuon.setText("Sửa phiếu");
        nÃºtuakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nÃºtuakhachmuonActionPerformed(evt);
            }
        });

        nutluukhachmuon.setText("Lưu phiếu");
        nutluukhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutluukhachmuonActionPerformed(evt);
            }
        });

        nutthemkhach.setText("Thêm phiếu");
        nutthemkhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutthemkhachActionPerformed(evt);
            }
        });

        nuthuy3.setText("Hủy");
        nuthuy3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy3ActionPerformed(evt);
            }
        });

        nutxoakhachmuon.setText("Xóa phiếu");
        nutxoakhachmuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutxoakhachmuonActionPerformed(evt);
            }
        });

        NutThoat3.setText("Thoát");
        NutThoat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutThoat3ActionPerformed(evt);
            }
        });

        nhapngay.setText("   /   / 2020");

        jLabel16.setText("Mã độc giả");

        jLabel18.setText("Mã sách mượn trả ");

        jLabel19.setText("Ngày mượn trả");

        banghienthiphieumuon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu mượn trả", "Mã độc giả mượn trả", "Mã sách mượn trả", "Ngày mượn trả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(banghienthiphieumuon);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Tìm kiếm");

        nuttimpm.setText("Tìm");
        nuttimpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimpmActionPerformed(evt);
            }
        });

        jLabel27.setText("Nhập nội dung:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(NutThoat3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel17))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(15, 15, 15)
                                .addComponent(nhaptukhoapm, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(nuttimpm)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(nutthemkhach, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nÃºtuakhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(nutxoakhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nutluukhachmuon, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nuthuy3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(nhapmadgpm, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel18)
                        .addGap(12, 12, 12)
                        .addComponent(nhapmaspm, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nhapngay, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 208, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhapmadgpm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(nhapmaspm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(nhapngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(46, 46, 46)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhaptukhoapm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(nuttimpm))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nutthemkhach)
                    .addComponent(nÃºtuakhachmuon)
                    .addComponent(nutxoakhachmuon)
                    .addComponent(nutluukhachmuon)
                    .addComponent(nuthuy3))
                .addGap(41, 41, 41)
                .addComponent(NutThoat3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý mượn trả sách", jPanel3);
        
        //Thủ thư
        suatt.setText("Sửa");
        suatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suattActionPerformed(evt);
            }
        });

        luutt.setText("Lưu");
        luutt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luuttActionPerformed(evt);
            }
        });

        themtt.setText("Thêm");
        themtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themttActionPerformed(evt);
            }
        });

        nuthuy4.setText("Hủy");
        nuthuy4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuthuy4ActionPerformed(evt);
            }
        });

        xoatt.setText("Xóa");
        xoatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoattActionPerformed(evt);
            }
        });

        nutThoat4.setText("Thoát");
        nutThoat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutThoat4ActionPerformed(evt);
            }
        });

        nhapdiachitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapdiachittActionPerformed(evt);
            }
        });

        jLabel31.setText("Tên thủ thư");

        jLabel32.setText("Quê quán");

        jLabel33.setText("Email");

        jLabel34.setText("Số điện thoại");

        banghienthitt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã thủ thư", "Tên thủ thư", "Quê quán", "Email", "Số điện thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(banghienthitt);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("Tìm kiếm");

        jLabel36.setText("Mời nhập nội dung:");

        nuttimtt.setText("Tìm");
        nuttimtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuttimttActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
        		jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel36)
                            .addGap(33, 33, 33))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(23, 23, 23)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel31)
                                .addComponent(jLabel33))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nhaptentt, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(nhapemailtt))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(themtt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(suatt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nhaptukhoatt, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(nuttimtt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(348, 348, 348))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18)
                                .addComponent(nhapsdttt))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(37, 37, 37)
                                .addComponent(nhapdiachitt, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nutThoat4)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(xoatt, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(luutt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(nuthuy4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jLabel38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
        		jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(nhaptentt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addComponent(jLabel32))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nhapemailtt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(nhapdiachitt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(nhapsdttt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhaptukhoatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuttimtt)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(nutThoat4)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themtt)
                            .addComponent(suatt)
                            .addComponent(xoatt)
                            .addComponent(luutt)
                            .addComponent(nuthuy4))
                        .addGap(94, 94, 94))))
        );

        jTabbedPane1.addTab("Quản lý thủ thư", jPanel5);
        
        
        //Thống kê ---------------------------

        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setText("THỐNG KÊ");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Thống kê sách");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Thống kê số độc giả");
        
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Thống kê số thủ thư");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Thống kê số sách còn trong kho");

        tongsosach.setEditable(false);

        tongsodg.setEditable(false);
        
        tongsott.setEditable(false);

        tongsopm.setEditable(false);

        jButton1.setText("Thống kê");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            		.addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel29)
                                            .addGap(21, 21, 21))
                            		.addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(21, 21, 21))
                            		.addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addGap(21, 21, 21))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tongsodg)
                                .addComponent(tongsott)
                                .addComponent(tongsopm, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tongsosach, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(618, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(593, 593, 593))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(tongsosach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tongsodg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(tongsott, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tongsopm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jButton1)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Thống kê", jPanel4);
        

        // ----------------------------------------------

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }

    private void nhaptheloaisachActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void nhapdiachiActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void nhapdiachittActionPerformed(java.awt.event.ActionEvent evt) {

    }

    
    private void nutxoakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {
    	int hangpm = banghienthiphieumuon.getSelectedRow();
    	phieumuon pm = new phieumuon();
        pm.setMaphieumuon(Integer.parseInt(model2.getValueAt(hangpm, 0).toString()));
        pm.setMadausach(Integer.parseInt(nhapmaspm.getText()));
        pm.setMadocgia(Integer.parseInt(nhapmadgpm.getText()));
        pm.setNgaymuon(nhapngay.getText());
    	if (hangpm != -1) {
    		if (new DAO().removePhieuMuon(pm)) {
        		JOptionPane.showMessageDialog(rootPane, "Thành công!");
        		model2.removeRow(hangpm);
                listphieumuon.remove(hangpm);
        	} 
           ioFile.ghi(listphieumuon, "phieumuon.DAT");
        }else{
           JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn mục cần xóa!");
        }
    }

    public boolean khongtrungmasach(int masach) {
        for (Giaotiep g : listsach) {
            sach s = (sach) g;
            if (s.getMasach() == masach) {
                return false;
            }
        }
        return true;
    }

    public boolean khongtrungmadg(int madg) {
        for (Giaotiep g : listdocgia) {
            docgia dg = (docgia) g;
            if (dg.getMadg() == madg) {
                return false;
            }
        }
        return true;
    }
    
    public boolean khongtrungmatt(int matt) {
        for (Giaotiep g : listthuthu) {
            thuthu tt = (thuthu) g;
            if (tt.getMatt() == matt) {
                return false;
            }
        }
        return true;
    }

    public boolean khongtrungmapm(int mapm) {
        for (Giaotiep g : listphieumuon) {
            phieumuon pm = (phieumuon) g;
            if (pm.getMaphieumuon() == mapm) {
                return false;
            }
        }
        return true;
    }
    //sach
    private void themsachActionPerformed(java.awt.event.ActionEvent evt) {          
        if (nhaptensach.getText().length() != 0) {
            int ma = 10000;
            while (true) {
                if (khongtrungmasach(ma)) {
                    break;
                }
                ma++;//
            }
            sach s = new sach();
            s.setMasach(ma);
            s.setTensach(nhaptensach.getText());
            s.setTheloai(nhaptheloaisach.getText());
            s.setTacgia(nhaptacgia.getText());
         
            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));//(1)
            }

            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
            if(new DAO().addSach(s)){
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
                listsach.add(s);
            }
            ioFile.ghi(listsach, "sach.DAT");

            model.addRow(new Object[]{
                s.getMasach(), s.getTensach(), s.getTheloai(), s.getTacgia(), s.getSoluong(), s.getTinhtrang()});
    }
     else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập đầy đủ thông tin!");
        }
    }
    private void nhaptensachActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void nutThoat1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void nutThoat2ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void NutThoat3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }
    
    private void nutThoat4ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void tinhtrangsachActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void nutsuasachActionPerformed(java.awt.event.ActionEvent evt) {
        
        int hangchon;
        hangchon = banghienthisach.getSelectedRow();
        if (hangchon != -1) {
            nhaptensach.setText(model.getValueAt(hangchon, 1).toString());
            nhaptheloaisach.setText(model.getValueAt(hangchon, 2).toString());
            nhaptacgia.setText(model.getValueAt(hangchon, 3).toString());
            nhapsoluongsach.setText(model.getValueAt(hangchon, 4).toString());
            tinhtrangsach.setSelectedItem(model.getValueAt(hangchon, 5).toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn mục cần sửa!");
        }
    }

    private void luusachActionPerformed(java.awt.event.ActionEvent evt) {
        if (nhaptensach.getText().length() != 0) {
            int hang = banghienthisach.getSelectedRow();
            sach s = new sach();
            s.setMasach(Integer.parseInt(model.getValueAt(hang, 0).toString()));
            s.setTensach(nhaptensach.getText());
            s.setTheloai(nhaptheloaisach.getText());
            s.setTacgia(nhaptacgia.getText());
            if (nhapsoluongsach.getText().length() == 0) {
                s.setSoluong(0);
            } else {
                s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));
            }

            s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
            if(new DAO().updateSach(s)){
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!");
                listsach.set(hang, s);
            }
            //listsach.set(hang, s);
            //new DAO().updateSach(s);
            ioFile.ghi(listsach, "sach.DAT");//Ghi thang ra file

            model.setValueAt(s.getMasach(), hang, 0);
            model.setValueAt(s.getTensach(), hang, 1);
            model.setValueAt(s.getTheloai(), hang, 2);
            model.setValueAt(s.getTacgia(), hang, 3);
            model.setValueAt(s.getSoluong(), hang, 4);
            model.setValueAt(s.getTinhtrang(), hang, 5);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lỗi! Mời bạn thử lại!");
        }
    }

    private void nutxoaActionPerformed(java.awt.event.ActionEvent evt) {
        int hang = banghienthisach.getSelectedRow();
        sach s = new sach();
        s.setMasach(Integer.parseInt(model.getValueAt(hang, 0).toString()));
        s.setTensach(nhaptensach.getText());
        s.setTheloai(nhaptheloaisach.getText());
        s.setTacgia(nhaptacgia.getText());
        if (nhapsoluongsach.getText().length() == 0) {
            s.setSoluong(0);
        } else {
            s.setSoluong(Integer.parseInt(nhapsoluongsach.getText()));
        }

        s.setTinhtrang(tinhtrangsach.getSelectedItem().toString());
     
        if (hang != -1) {
        	if (new DAO().removeSach(s)) {
        		JOptionPane.showMessageDialog(rootPane, "Thành công!");
        		model.removeRow(hang);
        		listsach.remove(hang);
        	}
            ioFile.ghi(listsach, "sach.DAT");
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn mục cần xóa!");
        }
    }

    //private int s.getMasach() {
		// TODO Auto-generated method stub
		//return 0;
	//}

	private void nuthuy1ActionPerformed(java.awt.event.ActionEvent evt) {
        nhaptensach.setText("");
        nhaptukhoasach.setText("");
        nhaptheloaisach.setText("");
        nhaptacgia.setText("");
        nhapsoluongsach.setText("");
        tinhtrangsach.setSelectedIndex(0);
    }

    private void nuthuy2ActionPerformed(java.awt.event.ActionEvent evt) {

        nhaptendg.setText("");
        nhaptukhoadg.setText("");
        nhapdiachi.setText("");
        nhapemail.setText("");
        nhapsdt.setText("");
    }

    private void nuthuy3ActionPerformed(java.awt.event.ActionEvent evt) {
        nhapmadgpm.setText("");
        nhapmaspm.setText("");
        nhapngay.setText("");
        nhaptukhoapm.setText("");
    }
    
    private void nuthuy4ActionPerformed(java.awt.event.ActionEvent evt) {
        nhaptentt.setText("");
        nhaptukhoatt.setText("");
        nhapdiachitt.setText("");
        nhapemailtt.setText("");
        nhapsdttt.setText("");
    }
//DOCGIA
    private void themdgActionPerformed(java.awt.event.ActionEvent evt) {
        if (nhaptendg.getText().length() != 0 && nhapsdt.getText().length() != 0 && nhapdiachi.getText().length() != 0 && nhapemail.getText().length() != 0) {
            int madg = 10000;
            while (true) {
                if (khongtrungmadg(madg)) {
                    break;
                }
                madg++;
            }
            docgia dg = new docgia();
            dg.setMadg(madg);
            dg.setTendg(nhaptendg.getText());
            dg.setDiachi(nhapdiachi.getText());
            dg.setEmaildg(nhapemail.getText());
            dg.setSdtdg(Integer.parseInt(nhapsdt.getText()));
            if(new DAO().addDocGia(dg)){
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
                listdocgia.add(dg);
            }
            //listdocgia.add(dg);
            ioFile.ghi(listdocgia, "docgia.DAT");
            model1.addRow(new Object[]{
                dg.getMadg(), dg.getTendg(), dg.getDiachi(), dg.getEmaildg(), dg.getSdtdg()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập tất cả thông tin!");
        }
    }
    
    //thuthu
    private void themttActionPerformed(java.awt.event.ActionEvent evt) {
        if (nhaptentt.getText().length() != 0 && nhapsdttt.getText().length() != 0 && nhapdiachitt.getText().length() != 0 && nhapemailtt.getText().length() != 0) {
            int matt = 10000;
            while (true) {
                if (khongtrungmatt(matt)) {
                    break;
                }
                matt++;
            }
            thuthu tt = new thuthu();
            tt.setMatt(matt);
            tt.setTentt(nhaptentt.getText());
            tt.setDiachi(nhapdiachitt.getText());
            tt.setEmailtt(nhapemailtt.getText());
            //tt.setSdttt(Integer.parseInt(nhapsdttt.getText()));
            try {
         	   tt.setSdttt(Integer.parseInt(nhapsdttt.getText()));
            	} catch (Exception e) {
            		JOptionPane.showMessageDialog(rootPane, "Nhap du 7 so");
     		} ;
            System.out.println(Integer.parseInt(nhapsdttt.getText()));
            if(new DAO().addThuThu(tt)){
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
                listthuthu.add(tt);
            }
            //listthuthu.add(tt);
            ioFile.ghi(listthuthu, "thuthu.DAT");
            model3.addRow(new Object[]{
                tt.getMatt(), tt.getTentt(), tt.getDiachi(), tt.getEmailtt(), tt.getSdttt()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập tất cả thông tin!");
        }
    }

    private void suadgActionPerformed(java.awt.event.ActionEvent evt) {
        int hangdg;
        hangdg = banghienthidg.getSelectedRow();
        if (hangdg != -1) {
            nhaptendg.setText(model1.getValueAt(hangdg, 1).toString());
            nhapdiachi.setText(model1.getValueAt(hangdg, 2).toString());
            nhapemail.setText(model1.getValueAt(hangdg, 3).toString());
            nhapsdt.setText(model1.getValueAt(hangdg, 4).toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn mục cần sửa!");
        }

    }
    
    private void suattActionPerformed(java.awt.event.ActionEvent evt) {
        int hangtt;
        hangtt = banghienthitt.getSelectedRow(); 
        if (hangtt != -1) {
            nhaptentt.setText(model3.getValueAt(hangtt, 1).toString());
            nhapdiachitt.setText(model3.getValueAt(hangtt, 2).toString());
            nhapemailtt.setText(model3.getValueAt(hangtt, 3).toString());
            nhapsdttt.setText(model3.getValueAt(hangtt, 4).toString());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn mục cần sửa!");
        }

    }

    private void xoadgActionPerformed(java.awt.event.ActionEvent evt) {
        int hangdg = banghienthidg.getSelectedRow();
        docgia dg = new docgia();
        dg.setMadg(Integer.parseInt(model1.getValueAt(hangdg, 0).toString()));
        dg.setTendg(nhaptendg.getText());
        dg.setDiachi(nhapdiachi.getText());
        dg.setEmaildg(nhapemail.getText());
        dg.setSdtdg(Integer.parseInt(nhapsdt.getText()));
        if (hangdg != -1) {
        	if (new DAO().removeDocGia(dg)) {
        		JOptionPane.showMessageDialog(rootPane, "Thành công!");
        		model1.removeRow(hangdg);
                listdocgia.remove(hangdg);
        	}
            ioFile.ghi(listdocgia, "docgia.DAT");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn mục cần xóa!");
        }
    }//GEN-LAST:event_xoadgActionPerformed
    

    private void xoattActionPerformed(java.awt.event.ActionEvent evt) {
        int hangtt = banghienthitt.getSelectedRow();
        thuthu tt = new thuthu();
        tt.setMatt(Integer.parseInt(model3.getValueAt(hangtt, 0).toString()));
        tt.setTentt(nhaptentt.getText());
        tt.setDiachi(nhapdiachitt.getText());
        tt.setEmailtt(nhapemailtt.getText());
        tt.setSdttt(Integer.parseInt(nhapsdttt.getText()));
        if (hangtt != -1) {
        	if (new DAO().removeThuThu(tt)) {
        		JOptionPane.showMessageDialog(rootPane, "Thành công!");
        		model3.removeRow(hangtt);
                listthuthu.remove(hangtt);
        	}
            ioFile.ghi(listthuthu, "thuthu.DAT");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần chọn mục cần xóa!");
        }
    }

    private void luudgActionPerformed(java.awt.event.ActionEvent evt) {
        if (nhaptendg.getText().length() != 0 && nhapsdt.getText().length() != 0 && nhapdiachi.getText().length() != 0 && nhapemail.getText().length() != 0) {
            int hangdg = banghienthidg.getSelectedRow();
            docgia dg = new docgia();
            dg.setMadg(Integer.parseInt(model1.getValueAt(hangdg, 0).toString()));//(3)
            dg.setTendg(nhaptendg.getText());
            dg.setDiachi(nhapdiachi.getText());
            dg.setEmaildg(nhapemail.getText());
            dg.setSdtdg(Integer.parseInt(nhapsdt.getText()));
            if(new DAO().updateDocGia(dg)){
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!");
                listdocgia.set(hangdg, dg);
            }
            //listdocgia.set(hangdg, dg);
            ioFile.ghi(listdocgia, "docgia.DAT");
            model1.setValueAt(dg.getMadg(), hangdg, 0);
            model1.setValueAt(dg.getTendg(), hangdg, 1);
            model1.setValueAt(dg.getDiachi(), hangdg, 2);
            model1.setValueAt(dg.getEmaildg(), hangdg, 3);
            model1.setValueAt(dg.getSdtdg(), hangdg, 4);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lỗi! Mời bạn thử lại!");
        }
    }

    private void luuttActionPerformed(java.awt.event.ActionEvent evt) {
        if (nhaptentt.getText().length() != 0 && nhapsdttt.getText().length() != 0 && nhapdiachitt.getText().length() != 0 && nhapemailtt.getText().length() != 0) {
            int hangtt = banghienthitt.getSelectedRow();
            thuthu tt = new thuthu();
            tt.setMatt(Integer.parseInt(model1.getValueAt(hangtt, 0).toString()));//(3)
            tt.setTentt(nhaptentt.getText());
            tt.setDiachi(nhapdiachitt.getText());
            tt.setEmailtt(nhapemailtt.getText());
            tt.setSdttt(Integer.parseInt(nhapsdttt.getText()));
            if(new DAO().updateThuThu(tt)){
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!");
                listthuthu.set(hangtt, tt);
            }
            //listthuthu.set(hangtt, tt);
            ioFile.ghi(listthuthu, "thuthu.DAT");
            model3.setValueAt(tt.getMatt(), hangtt, 0);
            model3.setValueAt(tt.getTentt(), hangtt, 1);
            model3.setValueAt(tt.getDiachi(), hangtt, 2);
            model3.setValueAt(tt.getEmailtt(), hangtt, 3);
            model3.setValueAt(tt.getSdttt(), hangtt, 4);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lỗi! Mời bạn thử lại!");
        }
    }
    
    
    private void nuthuytim1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void chontimsach1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nuttimsachActionPerformed(java.awt.event.ActionEvent evt) {
        model.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(model);
        banghienthisach.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoasach.getText()));
    }

    private void nuttimdgActionPerformed(java.awt.event.ActionEvent evt) {
        model1.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(model1);
        banghienthidg.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoadg.getText()));
    }
    
    private void nuttimttActionPerformed(java.awt.event.ActionEvent evt) {
        model3.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(model3);
        banghienthitt.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoatt.getText()));
    }

    private void nutthemkhachActionPerformed(java.awt.event.ActionEvent evt) {
        if (nhapmadgpm.getText().length() != 0 && nhapmaspm.getText().length() != 0 && nhapngay.getText().length() != 0) {
            int mapm = 10000;
            while (true) {
                if (khongtrungmapm(mapm)) {
                    break;
                }
                mapm++;
            }
            phieumuon pm = new phieumuon();
            pm.setMaphieumuon(mapm);
            pm.setNgaymuon(nhapngay.getText());
            pm.setMadausach(Integer.parseInt(nhapmaspm.getText()));
            pm.setMadocgia(Integer.parseInt(nhapmadgpm.getText()));
            if(new DAO().addPhieuMuon(pm)){
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");
                listphieumuon.add(pm);
            }
            //listphieumuon.add(pm);
            ioFile.ghi(listphieumuon, "phieumuon.DAT");
            model2.addRow(new Object[]{
                pm.getMaphieumuon(), pm.getMadocgia(), pm.getMadausach(), pm.getNgaymuon()});
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn cần nhập đầy đủ thông tin!");
        }
    }

    private void nÃºtuakhachmuonActionPerformed(java.awt.event.ActionEvent evt) {
        int hangpm;
        hangpm = banghienthiphieumuon.getSelectedRow();
        if (hangpm != -1) {
            nhapmadgpm.setText(model2.getValueAt(hangpm, 1).toString());
            nhapmaspm.setText(model2.getValueAt(hangpm, 2).toString());
            nhapngay.setText(model2.getValueAt(hangpm, 3).toString());

        } else {
            JOptionPane.showMessageDialog(rootPane, "Lỗi! Mời bạn thử lại!!");
        }
    }

    private void nutluukhachmuonActionPerformed(java.awt.event.ActionEvent evt) {
        if (nhapmadgpm.getText().length() != 0 && nhapmaspm.getText().length() != 0 && nhapngay.getText().length() != 0) {
            int hangpm = banghienthiphieumuon.getSelectedRow();
            phieumuon pm = new phieumuon();
            pm.setMaphieumuon(Integer.parseInt(model2.getValueAt(hangpm, 0).toString()));
            pm.setMadausach(Integer.parseInt(nhapmaspm.getText()));
            pm.setMadocgia(Integer.parseInt(nhapmadgpm.getText()));
            pm.setNgaymuon(nhapngay.getText());
            if(new DAO().updatePhieuMuon(pm)){
                JOptionPane.showMessageDialog(rootPane, "Cập nhật thành công!");
                listphieumuon.set(hangpm, pm);
            }
            //listphieumuon.set(hangpm, pm);
            ioFile.ghi(listphieumuon, "phieumuon.DAT");
            model2.setValueAt(pm.getMadocgia(), hangpm, 1);
            model2.setValueAt(pm.getMadausach(), hangpm, 2);
            model2.setValueAt(pm.getNgaymuon(), hangpm, 3);
            model2.setValueAt(pm.getMaphieumuon(), hangpm, 0);

        } else {
            JOptionPane.showMessageDialog(rootPane, "Lỗi! Mời bạn thử lại!");

        }
    }

    private void nuttimpmActionPerformed(java.awt.event.ActionEvent evt) {
        model2.fireTableDataChanged();
        TableRowSorter sorter = new TableRowSorter(model2);
        banghienthiphieumuon.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(nhaptukhoapm.getText()));
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int sosach = banghienthisach.getRowCount();
        int sodocgia = banghienthidg.getRowCount();
        int sothuthu = banghienthitt.getRowCount();
        int sopm = banghienthiphieumuon.getRowCount();
          tongsosach.setText  (""+sosach);
          tongsodg.setText  (""+sodocgia);
          tongsott.setText  (""+sothuthu);
          tongsopm.setText  (""+sopm);
    }

    public static void main(String args[]) {
    	
    	Connection conn = null;
    	Statement stmt = null;

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Giaodien.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Giaodien().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton NutThoat3;
    private javax.swing.JTable banghienthidg;
    private javax.swing.JTable banghienthitt;
    private javax.swing.JTable banghienthiphieumuon;
    private javax.swing.JTable banghienthisach;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton luudg;
    private javax.swing.JButton luutt;
    private javax.swing.JButton luusach;
    private javax.swing.JTextField nhapdiachi;
    private javax.swing.JTextField nhapemail;
    private javax.swing.JTextField nhapmadgpm;
    private javax.swing.JTextField nhapmaspm;
    private javax.swing.JTextField nhapngay;
    private javax.swing.JTextField nhapsdt;
    private javax.swing.JTextField nhapsoluongsach;
    private javax.swing.JTextField nhaptacgia;
    private javax.swing.JTextField nhaptendg;
    private javax.swing.JTextField nhaptentt;    
    private javax.swing.JTextField nhaptensach;
    private javax.swing.JTextField nhaptheloaisach;
    private javax.swing.JTextField nhaptukhoadg;
    private javax.swing.JTextField nhaptukhoatt;
    private javax.swing.JTextField nhaptukhoapm;
    private javax.swing.JTextField nhaptukhoasach;
    private javax.swing.JButton nutThoat1;
    private javax.swing.JButton nutThoat2;
    private javax.swing.JButton nutThoat4;
    private javax.swing.JButton nuthuy1;
    private javax.swing.JButton nuthuy2;
    private javax.swing.JButton nuthuy3;
    private javax.swing.JButton nuthuy4;
    private javax.swing.JButton nutluukhachmuon;
    private javax.swing.JButton nutsuasach;
    private javax.swing.JButton nutthemkhach;
    private javax.swing.JButton nuttimdg;
    private javax.swing.JButton nuttimtt;
    private javax.swing.JButton nuttimpm;
    private javax.swing.JButton nuttimsach;
    private javax.swing.JButton nutxoa;
    private javax.swing.JButton nutxoakhachmuon;
    private javax.swing.JButton nÃºtuakhachmuon;
    private javax.swing.JButton suadg;
    private javax.swing.JButton suatt;
    private javax.swing.JButton themdg;
    private javax.swing.JButton themtt;
    private javax.swing.JButton themsach;
    private javax.swing.JComboBox<String> tinhtrangsach;
    private javax.swing.JTextField tongsodg;
    private javax.swing.JTextField tongsott;
    private javax.swing.JTextField tongsopm;
    private javax.swing.JTextField tongsosach;
    private javax.swing.JButton xoadg;
    private javax.swing.JButton xoatt;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JTextField nhapdiachitt;
    private javax.swing.JTextField nhapemailtt;
    private javax.swing.JTextField nhapsdttt;

    private Object getValueAt(int sosach) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
