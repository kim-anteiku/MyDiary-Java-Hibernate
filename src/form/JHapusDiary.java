
package form;

//daftar import package
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
//-----------------------------------------------------------------------------------------------------

public class JHapusDiary extends javax.swing.JInternalFrame {
    
    private DefaultTableModel model;
    
    //Konstruktor
    public JHapusDiary() {
        
        initComponents();
        
        //membuat tabel
        model = new DefaultTableModel();
        tabelHapus.setModel(model);
        
        model.addColumn("ID");
        model.addColumn("Tanggal");
        model.addColumn("Judul");
        
        //agar loadData() dijalankan ketika class di jalankan
        loadData();
    }
    //-----------------------------------------------------------------------------------------------------
    
    //menampilkan data pada tabel ketika aplikasi dijalankan
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
                Object[] o = new Object[3];
                o[0] = diary.getId();
                o[1] = diary.getTanggal();
                o[2] = diary.getJudul();
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
        tabelHapus = new javax.swing.JTable();
        HapusDiaryButton = new javax.swing.JButton();
        BatalHapusDIaryButton = new javax.swing.JButton();
        SegarButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setTitle("Hapus Diary ");
        setPreferredSize(new java.awt.Dimension(800, 431));

        tabelHapus.setBackground(new java.awt.Color(0, 255, 255));
        tabelHapus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Judul", "Isi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelHapus.setRequestFocusEnabled(false);
        tabelHapus.setUpdateSelectionOnSort(false);
        tabelHapus.setVerifyInputWhenFocusTarget(false);
        tabelHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelHapusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelHapus);
        if (tabelHapus.getColumnModel().getColumnCount() > 0) {
            tabelHapus.getColumnModel().getColumn(0).setResizable(false);
            tabelHapus.getColumnModel().getColumn(1).setResizable(false);
        }

        HapusDiaryButton.setBackground(new java.awt.Color(0, 204, 0));
        HapusDiaryButton.setForeground(new java.awt.Color(255, 255, 255));
        HapusDiaryButton.setText("Hapus");
        HapusDiaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusDiaryButtonActionPerformed(evt);
            }
        });
        HapusDiaryButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HapusDiaryButtonKeyPressed(evt);
            }
        });

        BatalHapusDIaryButton.setBackground(new java.awt.Color(255, 0, 0));
        BatalHapusDIaryButton.setForeground(new java.awt.Color(255, 255, 255));
        BatalHapusDIaryButton.setText("Batal");
        BatalHapusDIaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalHapusDIaryButtonActionPerformed(evt);
            }
        });
        BatalHapusDIaryButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BatalHapusDIaryButtonKeyPressed(evt);
            }
        });

        SegarButton.setBackground(new java.awt.Color(0, 51, 255));
        SegarButton.setForeground(new java.awt.Color(255, 255, 255));
        SegarButton.setText("Segarkan");
        SegarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SegarButtonActionPerformed(evt);
            }
        });
        SegarButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SegarButtonKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Daftar Diary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SegarButton)
                        .addGap(18, 18, 18)
                        .addComponent(HapusDiaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BatalHapusDIaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SegarButton)
                    .addComponent(HapusDiaryButton)
                    .addComponent(BatalHapusDIaryButton))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(800, 431));
    }// </editor-fold>//GEN-END:initComponents
    //-----------------------------------------------------------------------------------------------------
 
    //event untuk menghapus data pada tabel
    private void HapusDiaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusDiaryButtonActionPerformed
        //memilih item terpilih
        int i = tabelHapus.getSelectedRow();
        if(i == -1){
            return;
        }
        Integer id = (Integer) model.getValueAt(i, 0);
        
        //validasi untuk menghapus data
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus Diary ini ?","Perhatian !",JOptionPane.YES_NO_OPTION);
        if(konfirmasi==0){
            try{
                control.ControlDiary.hapusDiary(id);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }finally{
                loadData();
            }
        }
    }//GEN-LAST:event_HapusDiaryButtonActionPerformed
    //-----------------------------------------------------------------------------------------------------
 
    //event membatalkan opsi Ubah
    private void BatalHapusDIaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalHapusDIaryButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_BatalHapusDIaryButtonActionPerformed
    //-----------------------------------------------------------------------------------------------------
 
    //event untuk refresh tabel
    private void SegarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SegarButtonActionPerformed
        loadData();
    }//GEN-LAST:event_SegarButtonActionPerformed
    //-----------------------------------------------------------------------------------------------------
 
    //event handling
    private void tabelHapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelHapusMouseClicked
      
    }//GEN-LAST:event_tabelHapusMouseClicked

    private void SegarButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SegarButtonKeyPressed
        loadData();
    }//GEN-LAST:event_SegarButtonKeyPressed

    private void HapusDiaryButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HapusDiaryButtonKeyPressed
        //memilih item terpilih
        int i = tabelHapus.getSelectedRow();
        if(i == -1){
            return;
        }
        Integer id = (Integer) model.getValueAt(i, 0);
        //validasi untuk menghapus data
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin menghapus Diary ini ?","Perhatian !",JOptionPane.YES_NO_OPTION);
        if(konfirmasi==0){
            try{
                control.ControlDiary.hapusDiary(id);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }finally{
                loadData();
            }
        }
    }//GEN-LAST:event_HapusDiaryButtonKeyPressed

    private void BatalHapusDIaryButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BatalHapusDIaryButtonKeyPressed
        this.dispose();
    }//GEN-LAST:event_BatalHapusDIaryButtonKeyPressed
    //-----------------------------------------------------------------------------------------------------
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BatalHapusDIaryButton;
    private javax.swing.JButton HapusDiaryButton;
    private javax.swing.JButton SegarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelHapus;
    // End of variables declaration//GEN-END:variables
}
