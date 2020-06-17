
package form;

//daftar import package
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class JICetakDiary extends javax.swing.JInternalFrame {
//-----------------------------------------------------------------------------------------------------

    //deklarasi manual variable
    private DefaultTableModel model;
    
    //Konstruktor
    public JICetakDiary() {
        initComponents();
        
        //membuat tabel
        model = new DefaultTableModel();
        
        tabelUbah.setModel(model);
        
        model.addColumn("ID");
        model.addColumn("Tanggal");
        model.addColumn("Judul");
        model.addColumn("Isi");
        
    }
    //-----------------------------------------------------------------------------------------------------
    
    //menambahkan data pada tabel
    public void loadData(){
        //menghapus seluruh data
        model.getDataVector().removeAllElements();
        //memberi tahu bahwa data telah kosong
        model.fireTableDataChanged();
        
        org.hibernate.SessionFactory factory = new org.hibernate.cfg.Configuration().configure().buildSessionFactory();
        org.hibernate.Session session = factory.openSession();
        org.hibernate.Transaction tx = null;
        try{
            tx = session.beginTransaction();
            java.util.List listDiary = session.createQuery("FROM Diary").list();
            for(java.util.Iterator i = listDiary.iterator(); i.hasNext();){
                pojo.Diary diary = (pojo.Diary) i.next();
                Object[] o = new Object[4];
                o[0] = diary.getId();
                o[1] = diary.getTanggal();
                o[2] = diary.getJudul();
                o[3] = diary.getIsi();
                model.addRow(o);
            }
            tx.commit();
        }catch(org.hibernate.HibernateException e){
            if(tx != null) tx.rollback();
            JOptionPane.showMessageDialog(null, "Gagal Memuat Data : "+e, "Error", 0);
        }finally{
            session.close();
        }
    }
    //-----------------------------------------------------------------------------------------------------
    
    //Kode Utama
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelUbah = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JIsi = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        JTanggal = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JJudul = new javax.swing.JTextField();
        CetakDiaryButton = new javax.swing.JButton();
        BatalUbahDiaryButton = new javax.swing.JButton();
        SegarUbahDiaryButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setTitle("Cetak Diary ");
        setPreferredSize(new java.awt.Dimension(800, 431));

        tabelUbah.setBackground(new java.awt.Color(0, 255, 255));
        tabelUbah.setForeground(new java.awt.Color(0, 0, 0));
        tabelUbah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelUbah.setFocusable(false);
        tabelUbah.setRequestFocusEnabled(false);
        tabelUbah.setRowSelectionAllowed(false);
        tabelUbah.getTableHeader().setReorderingAllowed(false);
        tabelUbah.setVerifyInputWhenFocusTarget(false);
        tabelUbah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelUbahMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelUbah);
        if (tabelUbah.getColumnModel().getColumnCount() > 0) {
            tabelUbah.getColumnModel().getColumn(0).setResizable(false);
            tabelUbah.getColumnModel().getColumn(1).setResizable(false);
            tabelUbah.getColumnModel().getColumn(2).setResizable(false);
            tabelUbah.getColumnModel().getColumn(3).setResizable(false);
        }

        JIsi.setEditable(false);
        JIsi.setBackground(new java.awt.Color(0, 255, 255));
        JIsi.setColumns(20);
        JIsi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JIsi.setForeground(new java.awt.Color(0, 0, 0));
        JIsi.setLineWrap(true);
        JIsi.setRows(5);
        jScrollPane2.setViewportView(JIsi);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tanggal  :");

        JTanggal.setEditable(false);
        JTanggal.setBackground(new java.awt.Color(0, 255, 255));
        JTanggal.setForeground(new java.awt.Color(0, 0, 0));
        JTanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));
        JTanggal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Judul     :");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Isi  :");

        JJudul.setEditable(false);
        JJudul.setBackground(new java.awt.Color(0, 255, 255));
        JJudul.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JJudul.setForeground(new java.awt.Color(0, 0, 0));
        JJudul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JJudulActionPerformed(evt);
            }
        });

        CetakDiaryButton.setBackground(new java.awt.Color(0, 204, 0));
        CetakDiaryButton.setForeground(new java.awt.Color(255, 255, 255));
        CetakDiaryButton.setText("Cetak");
        CetakDiaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CetakDiaryButtonActionPerformed(evt);
            }
        });
        CetakDiaryButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CetakDiaryButtonKeyPressed(evt);
            }
        });

        BatalUbahDiaryButton.setBackground(new java.awt.Color(255, 0, 0));
        BatalUbahDiaryButton.setForeground(new java.awt.Color(255, 255, 255));
        BatalUbahDiaryButton.setText("Batal");
        BatalUbahDiaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalUbahDiaryButtonActionPerformed(evt);
            }
        });
        BatalUbahDiaryButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BatalUbahDiaryButtonKeyPressed(evt);
            }
        });

        SegarUbahDiaryButton.setBackground(new java.awt.Color(0, 51, 255));
        SegarUbahDiaryButton.setForeground(new java.awt.Color(255, 255, 255));
        SegarUbahDiaryButton.setText("Segarkan");
        SegarUbahDiaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegarUbahDiaryButtonActionPerformed(evt);
            }
        });
        SegarUbahDiaryButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SegarUbahDiaryButtonKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Daftar Diary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 28, Short.MAX_VALUE)
                        .addComponent(SegarUbahDiaryButton)
                        .addGap(148, 148, 148)
                        .addComponent(CetakDiaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(BatalUbahDiaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4))
                    .addComponent(JTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(JJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SegarUbahDiaryButton)
                            .addComponent(CetakDiaryButton)
                            .addComponent(BatalUbahDiaryButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(66, 66, 66))
        );

        setSize(new java.awt.Dimension(800, 431));
    }// </editor-fold>//GEN-END:initComponents
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void JJudulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JJudulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JJudulActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void CetakDiaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CetakDiaryButtonActionPerformed
        
        //mendapatkan baris terseleksi dari tabel
        int i = tabelUbah.getSelectedRow();
        if(i == -1){
            return;
        }
        
        //deklarasi variable untuk eksekusi database
        Integer id = (Integer) model.getValueAt(i,0);
        java.util.Date tgl = (java.util.Date) JTanggal.getValue();
        String judul = JJudul.getText();
        String isi = JIsi.getText();
        
        //eksekusi variable
        try{
            control.ControlDiary.cetakDiary(id);
        }finally{
            //menambahkan fungsi loadData()
            loadData();
            JJudul.setText("");
            JIsi.setText("");
            JTanggal.setText("");
        }    
    }//GEN-LAST:event_CetakDiaryButtonActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void BatalUbahDiaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalUbahDiaryButtonActionPerformed
        this.dispose();
        JTanggal.setText("");
        JJudul.setText("");
        JIsi.setText("");
    }//GEN-LAST:event_BatalUbahDiaryButtonActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void SegarUbahDiaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegarUbahDiaryButtonActionPerformed
        loadData();
    }//GEN-LAST:event_SegarUbahDiaryButtonActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void tabelUbahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelUbahMouseClicked
        
        //mendapatkan baris terpilih dari tabel
        int i = tabelUbah.getSelectedRow();
        if(i == -1){
            //tidak ada baris terseleksi;
            return;
        }
        
        //ambil baris terseleksi;
        java.util.Date tanggal = (java.util.Date) model.getValueAt(i, 1);
        JTanggal.setValue(tanggal);
        
        String jdl = (String) model.getValueAt(i, 2);
        JJudul.setText(jdl);
        
        String Tisi = (String) model.getValueAt(i, 3);
        JIsi.setText(Tisi);
    }//GEN-LAST:event_tabelUbahMouseClicked

    private void SegarUbahDiaryButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SegarUbahDiaryButtonKeyPressed
        loadData();
    }//GEN-LAST:event_SegarUbahDiaryButtonKeyPressed

    private void CetakDiaryButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CetakDiaryButtonKeyPressed
        
        //mendapatkan baris terseleksi dari tabel
        int i = tabelUbah.getSelectedRow();
        if(i == -1){
            return;
        }
        
        //deklarasi variable untuk eksekusi database
        Integer id = (Integer) model.getValueAt(i,0);
        java.util.Date tgl = (java.util.Date) JTanggal.getValue();
        String judul = JJudul.getText();
        String isi = JIsi.getText();
        
        //eksekusi variable
        try{
            control.ControlDiary.cetakDiary(id);
        }finally{
            //menambahkan fungsi loadData()
            loadData();
            JJudul.setText("");
            JIsi.setText("");
            JTanggal.setText("");
        }    
    }//GEN-LAST:event_CetakDiaryButtonKeyPressed

    private void BatalUbahDiaryButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BatalUbahDiaryButtonKeyPressed
        this.dispose();
        JTanggal.setText("");
        JJudul.setText("");
        JIsi.setText("");
    }//GEN-LAST:event_BatalUbahDiaryButtonKeyPressed
    //-----------------------------------------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BatalUbahDiaryButton;
    private javax.swing.JButton CetakDiaryButton;
    private javax.swing.JTextArea JIsi;
    private javax.swing.JTextField JJudul;
    private javax.swing.JFormattedTextField JTanggal;
    private javax.swing.JButton SegarUbahDiaryButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelUbah;
    // End of variables declaration//GEN-END:variables
}
