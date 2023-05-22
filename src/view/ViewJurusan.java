
package view;

import controller.ControllerJurusan;
import javax.swing.JTable;
import javax.swing.JTextField;


public class ViewJurusan extends javax.swing.JInternalFrame {
    
    ControllerJurusan ctrlJurusan;
    
    public ViewJurusan() {
        initComponents();
        ctrlJurusan = new ControllerJurusan(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_jurusan = new javax.swing.JLabel();
        btn_tambah_jurusan = new javax.swing.JButton();
        btn_edit_jurusan = new javax.swing.JButton();
        btn_hapus_jurusan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_jurusan = new javax.swing.JTable();
        tf_kd_jurusan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_nm_jurusan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_cari_jurusan = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(231, 231, 244));

        txt_jurusan.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_jurusan.setForeground(new java.awt.Color(57, 55, 104));
        txt_jurusan.setText("Data Jurusan");

        btn_tambah_jurusan.setBackground(new java.awt.Color(57, 55, 104));
        btn_tambah_jurusan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_tambah_jurusan.setForeground(new java.awt.Color(231, 231, 244));
        btn_tambah_jurusan.setText("Tambah");
        btn_tambah_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_jurusanActionPerformed(evt);
            }
        });

        btn_edit_jurusan.setBackground(new java.awt.Color(57, 55, 104));
        btn_edit_jurusan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_edit_jurusan.setForeground(new java.awt.Color(231, 231, 244));
        btn_edit_jurusan.setText("Edit");
        btn_edit_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_jurusanActionPerformed(evt);
            }
        });

        btn_hapus_jurusan.setBackground(new java.awt.Color(57, 55, 104));
        btn_hapus_jurusan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_hapus_jurusan.setForeground(new java.awt.Color(231, 231, 244));
        btn_hapus_jurusan.setText("Hapus");
        btn_hapus_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus_jurusanActionPerformed(evt);
            }
        });

        tb_jurusan.setBackground(new java.awt.Color(231, 231, 244));
        tb_jurusan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tb_jurusan.setForeground(new java.awt.Color(57, 55, 104));
        tb_jurusan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_jurusan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_jurusanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_jurusan);

        tf_kd_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_kd_jurusanActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 55, 104));
        jLabel1.setText("Kode Mata Kuliah");

        tf_nm_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nm_jurusanActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 55, 104));
        jLabel2.setText("Nama Jurusan");

        tf_cari_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cari_jurusanActionPerformed(evt);
            }
        });
        tf_cari_jurusan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_cari_jurusanKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_cari_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_kd_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nm_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_tambah_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_edit_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn_hapus_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txt_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tf_cari_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_kd_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nm_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_edit_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapus_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambah_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_jurusanActionPerformed
        ctrlJurusan.insertData();
    }//GEN-LAST:event_btn_tambah_jurusanActionPerformed

    private void btn_edit_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_jurusanActionPerformed
       ctrlJurusan.editData();
    }//GEN-LAST:event_btn_edit_jurusanActionPerformed

    private void btn_hapus_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus_jurusanActionPerformed
       ctrlJurusan.deleteData();
    }//GEN-LAST:event_btn_hapus_jurusanActionPerformed

    private void tb_jurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_jurusanMouseClicked
        ctrlJurusan.getEditRow();
    }//GEN-LAST:event_tb_jurusanMouseClicked

    private void tf_kd_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_kd_jurusanActionPerformed
       
    }//GEN-LAST:event_tf_kd_jurusanActionPerformed

    private void tf_nm_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nm_jurusanActionPerformed
        
    }//GEN-LAST:event_tf_nm_jurusanActionPerformed

    private void tf_cari_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cari_jurusanActionPerformed
        
    }//GEN-LAST:event_tf_cari_jurusanActionPerformed

    private void tf_cari_jurusanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cari_jurusanKeyReleased
        ctrlJurusan.cariData();
    }//GEN-LAST:event_tf_cari_jurusanKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit_jurusan;
    private javax.swing.JButton btn_hapus_jurusan;
    private javax.swing.JButton btn_tambah_jurusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_jurusan;
    private javax.swing.JTextField tf_cari_jurusan;
    private javax.swing.JTextField tf_kd_jurusan;
    private javax.swing.JTextField tf_nm_jurusan;
    private javax.swing.JLabel txt_jurusan;
    // End of variables declaration//GEN-END:variables
    
    
    public JTextField getKodeJurusan(){
        return tf_kd_jurusan;
    }
    
    public JTextField getNamaJurusan(){
        return tf_nm_jurusan;
    }
    public JTable getTabelJurusan(){
        return tb_jurusan;
    }
    
    public JTextField getTextCari(){
        return tf_cari_jurusan;
    }
}
