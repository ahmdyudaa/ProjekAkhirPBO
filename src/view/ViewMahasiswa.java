
package view;

import controller.ControllerMahasiswa;
import javax.swing.JTable;
import javax.swing.JTextField;


public class ViewMahasiswa extends javax.swing.JInternalFrame {
    
    ControllerMahasiswa ctrlMahasiswa;
    
    public ViewMahasiswa() {
        initComponents();
        ctrlMahasiswa = new ControllerMahasiswa(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_jurusan = new javax.swing.JLabel();
        btn_tambah_mahasiswa = new javax.swing.JButton();
        btn_edit_mahasiswa = new javax.swing.JButton();
        btn_hapus_mahasiswa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_mahasiswa = new javax.swing.JTable();
        tf_nim_mahasiswa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_nm_mahasiswa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_cari_mahasiswa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_almt_mahasiswa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_jurusan_mahasiswa = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(231, 231, 244));

        txt_jurusan.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_jurusan.setForeground(new java.awt.Color(57, 55, 104));
        txt_jurusan.setText("Data Mahasiswa");

        btn_tambah_mahasiswa.setBackground(new java.awt.Color(57, 55, 104));
        btn_tambah_mahasiswa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_tambah_mahasiswa.setForeground(new java.awt.Color(231, 231, 244));
        btn_tambah_mahasiswa.setText("Tambah");
        btn_tambah_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_mahasiswaActionPerformed(evt);
            }
        });

        btn_edit_mahasiswa.setBackground(new java.awt.Color(57, 55, 104));
        btn_edit_mahasiswa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_edit_mahasiswa.setForeground(new java.awt.Color(231, 231, 244));
        btn_edit_mahasiswa.setText("Edit");
        btn_edit_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_mahasiswaActionPerformed(evt);
            }
        });

        btn_hapus_mahasiswa.setBackground(new java.awt.Color(57, 55, 104));
        btn_hapus_mahasiswa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_hapus_mahasiswa.setForeground(new java.awt.Color(231, 231, 244));
        btn_hapus_mahasiswa.setText("Hapus");
        btn_hapus_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus_mahasiswaActionPerformed(evt);
            }
        });

        tb_mahasiswa.setBackground(new java.awt.Color(231, 231, 244));
        tb_mahasiswa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tb_mahasiswa.setForeground(new java.awt.Color(57, 55, 104));
        tb_mahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_mahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_mahasiswa);

        tf_nim_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nim_mahasiswaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 55, 104));
        jLabel1.setText("NIM");

        tf_nm_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nm_mahasiswaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 55, 104));
        jLabel2.setText("Nama");

        tf_cari_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cari_mahasiswaActionPerformed(evt);
            }
        });
        tf_cari_mahasiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_cari_mahasiswaKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(57, 55, 104));
        jLabel3.setText("Alamat");

        tf_almt_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_almt_mahasiswaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(57, 55, 104));
        jLabel4.setText("Jurusan");

        tf_jurusan_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_jurusan_mahasiswaActionPerformed(evt);
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
                            .addComponent(tf_cari_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_tambah_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_edit_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn_hapus_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_nim_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_nm_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tf_almt_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf_jurusan_mahasiswa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addComponent(tf_cari_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nim_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_nm_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_almt_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_jurusan_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_edit_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapus_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    private void btn_tambah_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_mahasiswaActionPerformed
        ctrlMahasiswa.insertData();
    }//GEN-LAST:event_btn_tambah_mahasiswaActionPerformed

    private void btn_edit_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_mahasiswaActionPerformed
       ctrlMahasiswa.editData();
    }//GEN-LAST:event_btn_edit_mahasiswaActionPerformed

    private void btn_hapus_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus_mahasiswaActionPerformed
       ctrlMahasiswa.deleteData();
    }//GEN-LAST:event_btn_hapus_mahasiswaActionPerformed

    private void tb_mahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_mahasiswaMouseClicked
        ctrlMahasiswa.getEditRow();
    }//GEN-LAST:event_tb_mahasiswaMouseClicked

    private void tf_nim_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nim_mahasiswaActionPerformed
       
    }//GEN-LAST:event_tf_nim_mahasiswaActionPerformed

    private void tf_nm_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nm_mahasiswaActionPerformed
        
    }//GEN-LAST:event_tf_nm_mahasiswaActionPerformed

    private void tf_cari_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cari_mahasiswaActionPerformed
        
    }//GEN-LAST:event_tf_cari_mahasiswaActionPerformed

    private void tf_cari_mahasiswaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cari_mahasiswaKeyReleased
        ctrlMahasiswa.cariData();
    }//GEN-LAST:event_tf_cari_mahasiswaKeyReleased

    private void tf_almt_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_almt_mahasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_almt_mahasiswaActionPerformed

    private void tf_jurusan_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_jurusan_mahasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_jurusan_mahasiswaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit_mahasiswa;
    private javax.swing.JButton btn_hapus_mahasiswa;
    private javax.swing.JButton btn_tambah_mahasiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_mahasiswa;
    private javax.swing.JTextField tf_almt_mahasiswa;
    private javax.swing.JTextField tf_cari_mahasiswa;
    private javax.swing.JTextField tf_jurusan_mahasiswa;
    private javax.swing.JTextField tf_nim_mahasiswa;
    private javax.swing.JTextField tf_nm_mahasiswa;
    private javax.swing.JLabel txt_jurusan;
    // End of variables declaration//GEN-END:variables
    
    
    public JTextField getNimMahasiswa(){
        return tf_nim_mahasiswa;
    }
    
    public JTextField getNamaMahasiswa(){
        return tf_nm_mahasiswa;
    }
    public JTable getTabelMahasiswa(){
        return tb_mahasiswa;
    }
    
    public JTextField getTextCari(){
        return tf_cari_mahasiswa;
    }
    
    public JTextField getJurusanMahasiswa(){
        return tf_jurusan_mahasiswa;
    }
    
    public JTextField getAlamatMahasiswa(){
        return tf_almt_mahasiswa;
    }
}
