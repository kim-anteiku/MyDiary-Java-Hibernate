
package form;

import javax.swing.JOptionPane;
//-----------------------------------------------------------------------------------------------------
 
public class JIBuatDiary extends javax.swing.JInternalFrame {
    
    //Konstruktor
    public JIBuatDiary() {
        initComponents();
        java.util.Date date = new java.util.Date();
        JTanggal.setValue(date);
    }
    //-----------------------------------------------------------------------------------------------------
 
    //Kode Utama
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JJudul = new javax.swing.JTextField();
        JTanggal = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JIsi = new javax.swing.JTextArea();
        BuatDiaryButton = new javax.swing.JButton();
        BatalBuatDiaryButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setTitle("Buat Diary\n");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tanggal  :");

        JJudul.setBackground(new java.awt.Color(0, 255, 255));
        JJudul.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        JJudul.setForeground(new java.awt.Color(0, 0, 0));

        JTanggal.setBackground(new java.awt.Color(0, 255, 255));
        JTanggal.setForeground(new java.awt.Color(0, 0, 0));
        JTanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));
        JTanggal.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Judul     :");

        JIsi.setBackground(new java.awt.Color(51, 255, 255));
        JIsi.setColumns(20);
        JIsi.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        JIsi.setForeground(new java.awt.Color(0, 0, 0));
        JIsi.setLineWrap(true);
        JIsi.setRows(5);
        JIsi.setDragEnabled(true);
        JIsi.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(JIsi);

        BuatDiaryButton.setBackground(new java.awt.Color(0, 204, 0));
        BuatDiaryButton.setForeground(new java.awt.Color(255, 255, 255));
        BuatDiaryButton.setText("Buat");
        BuatDiaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuatDiaryButtonActionPerformed(evt);
            }
        });
        BuatDiaryButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BuatDiaryButtonKeyPressed(evt);
            }
        });

        BatalBuatDiaryButton.setBackground(new java.awt.Color(255, 0, 0));
        BatalBuatDiaryButton.setForeground(new java.awt.Color(255, 255, 255));
        BatalBuatDiaryButton.setText("Batal");
        BatalBuatDiaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalBuatDiaryButtonActionPerformed(evt);
            }
        });
        BatalBuatDiaryButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BatalBuatDiaryButtonKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Isi :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(553, 553, 553)
                                .addComponent(BuatDiaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(BatalBuatDiaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(JJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuatDiaryButton)
                    .addComponent(BatalBuatDiaryButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    @SuppressWarnings("empty-statement")
    private void BatalBuatDiaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalBuatDiaryButtonActionPerformed
        JTanggal.setText("");
        JJudul.setText("");
        JIsi.setText("");
        this.dispose();
    }//GEN-LAST:event_BatalBuatDiaryButtonActionPerformed
    //-----------------------------------------------------------------------------------------------------
    
    //event handling
    private void BuatDiaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuatDiaryButtonActionPerformed
        try{
            java.util.Date tanggal = (java.util.Date) JTanggal.getValue();
            String judul = JJudul.getText();
            String isi = JIsi.getText();
            control.ControlDiary.buatDiary(0, tanggal, judul, isi);            
            JOptionPane.showMessageDialog(null, "Diary berhasil ditambahkan !");        
            this.dispose();            
            JTanggal.setText("");
            JJudul.setText("");
            JIsi.setText("");
        }catch(org.hibernate.HibernateException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(null, "Pengisian Nilai Tanggal kurang tepat atau Isi, dan Judul Diary tidak boleh kosong !");
        }       
    }//GEN-LAST:event_BuatDiaryButtonActionPerformed

    private void BuatDiaryButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuatDiaryButtonKeyPressed
        try{
            java.util.Date tanggal = (java.util.Date) JTanggal.getValue();
            String judul = JJudul.getText();
            String isi = JIsi.getText();
            control.ControlDiary.buatDiary(0, tanggal, judul, isi);            
            JOptionPane.showMessageDialog(null, "Diary berhasil ditambahkan !");        
            this.dispose();            
            JTanggal.setText("");
            JJudul.setText("");
            JIsi.setText("");
        }catch(org.hibernate.HibernateException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }catch(java.lang.NullPointerException e){
            JOptionPane.showMessageDialog(null, "Pengisian Nilai Tanggal kurang tepat atau Isi, dan Judul Diary tidak boleh kosong !");
        }
    }//GEN-LAST:event_BuatDiaryButtonKeyPressed

    private void BatalBuatDiaryButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BatalBuatDiaryButtonKeyPressed
        JTanggal.setText("");
        JJudul.setText("");
        JIsi.setText("");
        this.dispose();
    }//GEN-LAST:event_BatalBuatDiaryButtonKeyPressed
    //-----------------------------------------------------------------------------------------------------
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BatalBuatDiaryButton;
    private javax.swing.JButton BuatDiaryButton;
    private javax.swing.JTextArea JIsi;
    private javax.swing.JTextField JJudul;
    private javax.swing.JFormattedTextField JTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
