
package view;

import controller.ControllerDosen;
import javax.swing.JTable;
import javax.swing.JTextField;


public class ViewDosen extends javax.swing.JInternalFrame {
    
    ControllerDosen ctrlDosen;
    
    public ViewDosen() {
        initComponents();
        ctrlDosen = new ControllerDosen(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_jurusan = new javax.swing.JLabel();
        btn_tambah_dosen = new javax.swing.JButton();
        btn_edit_dosen = new javax.swing.JButton();
        btn_hapus_dosen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_dosen = new javax.swing.JTable();
        tf_nip_dosen = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_nm_dosen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_cari_dosen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_almt_dosen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_telp_dosen = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(231, 231, 244));

        txt_jurusan.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_jurusan.setForeground(new java.awt.Color(57, 55, 104));
        txt_jurusan.setText("Data Dosen");

        btn_tambah_dosen.setBackground(new java.awt.Color(57, 55, 104));
        btn_tambah_dosen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_tambah_dosen.setForeground(new java.awt.Color(231, 231, 244));
        btn_tambah_dosen.setText("Tambah");
        btn_tambah_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_dosenActionPerformed(evt);
            }
        });

        btn_edit_dosen.setBackground(new java.awt.Color(57, 55, 104));
        btn_edit_dosen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_edit_dosen.setForeground(new java.awt.Color(231, 231, 244));
        btn_edit_dosen.setText("Edit");
        btn_edit_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_dosenActionPerformed(evt);
            }
        });

        btn_hapus_dosen.setBackground(new java.awt.Color(57, 55, 104));
        btn_hapus_dosen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_hapus_dosen.setForeground(new java.awt.Color(231, 231, 244));
        btn_hapus_dosen.setText("Hapus");
        btn_hapus_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus_dosenActionPerformed(evt);
            }
        });

        tb_dosen.setBackground(new java.awt.Color(231, 231, 244));
        tb_dosen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tb_dosen.setForeground(new java.awt.Color(57, 55, 104));
        tb_dosen.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_dosen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_dosenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_dosen);

        tf_nip_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nip_dosenActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 55, 104));
        jLabel1.setText("NIP");

        tf_nm_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nm_dosenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 55, 104));
        jLabel2.setText("Nama");

        tf_cari_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cari_dosenActionPerformed(evt);
            }
        });
        tf_cari_dosen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_cari_dosenKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 55, 104));
        jLabel3.setText("Alamat");

        tf_almt_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_almt_dosenActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 55, 104));
        jLabel4.setText("No telp");

        tf_telp_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_telp_dosenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_cari_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_tambah_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_edit_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn_hapus_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nip_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_nm_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tf_almt_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_telp_dosen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(txt_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txt_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_cari_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nip_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nm_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_almt_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_telp_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_edit_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapus_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGap(0, 48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambah_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_dosenActionPerformed
        ctrlDosen.insertData();
    }//GEN-LAST:event_btn_tambah_dosenActionPerformed

    private void btn_edit_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_dosenActionPerformed
       ctrlDosen.editData();
    }//GEN-LAST:event_btn_edit_dosenActionPerformed

    private void btn_hapus_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus_dosenActionPerformed
       ctrlDosen.deleteData();
    }//GEN-LAST:event_btn_hapus_dosenActionPerformed

    private void tb_dosenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_dosenMouseClicked
        ctrlDosen.getEditRow();
    }//GEN-LAST:event_tb_dosenMouseClicked

    private void tf_nip_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nip_dosenActionPerformed
       
    }//GEN-LAST:event_tf_nip_dosenActionPerformed

    private void tf_nm_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nm_dosenActionPerformed
        
    }//GEN-LAST:event_tf_nm_dosenActionPerformed

    private void tf_cari_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cari_dosenActionPerformed
        
    }//GEN-LAST:event_tf_cari_dosenActionPerformed

    private void tf_cari_dosenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cari_dosenKeyReleased
        ctrlDosen.cariData();
    }//GEN-LAST:event_tf_cari_dosenKeyReleased

    private void tf_almt_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_almt_dosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_almt_dosenActionPerformed

    private void tf_telp_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_telp_dosenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_telp_dosenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit_dosen;
    private javax.swing.JButton btn_hapus_dosen;
    private javax.swing.JButton btn_tambah_dosen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_dosen;
    private javax.swing.JTextField tf_almt_dosen;
    private javax.swing.JTextField tf_cari_dosen;
    private javax.swing.JTextField tf_nip_dosen;
    private javax.swing.JTextField tf_nm_dosen;
    private javax.swing.JTextField tf_telp_dosen;
    private javax.swing.JLabel txt_jurusan;
    // End of variables declaration//GEN-END:variables
    
    
    public JTextField getNipDosen(){
        return tf_nip_dosen;
    }
    
    public JTextField getNamaDosen(){
        return tf_nm_dosen;
    }
    public JTable getTabelDosen(){
        return tb_dosen;
    }
    
    public JTextField getTextCari(){
        return tf_cari_dosen;
    }
    
    public JTextField getTlpDosen(){
        return tf_telp_dosen;
    }
    
    public JTextField getAlamatDosen(){
        return tf_almt_dosen;
    }
}
