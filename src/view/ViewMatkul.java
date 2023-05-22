
package view;

import controller.ControllerMatkul;
import javax.swing.JTable;
import javax.swing.JTextField;


public class ViewMatkul extends javax.swing.JInternalFrame {
    
    ControllerMatkul ctrlMatkul;
    
    public ViewMatkul() {
        initComponents();
        ctrlMatkul = new ControllerMatkul(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_jurusan = new javax.swing.JLabel();
        btn_tambah_matkul = new javax.swing.JButton();
        btn_edit_matkul = new javax.swing.JButton();
        btn_hapus_matkul = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_matkul = new javax.swing.JTable();
        tf_kd_matkul = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tf_nm_matkul = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_cari_matkul = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(231, 231, 244));

        txt_jurusan.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        txt_jurusan.setForeground(new java.awt.Color(57, 55, 104));
        txt_jurusan.setText("Data Mata Kuliah");

        btn_tambah_matkul.setBackground(new java.awt.Color(57, 55, 104));
        btn_tambah_matkul.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_tambah_matkul.setForeground(new java.awt.Color(231, 231, 244));
        btn_tambah_matkul.setText("Tambah");
        btn_tambah_matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_matkulActionPerformed(evt);
            }
        });

        btn_edit_matkul.setBackground(new java.awt.Color(57, 55, 104));
        btn_edit_matkul.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_edit_matkul.setForeground(new java.awt.Color(231, 231, 244));
        btn_edit_matkul.setText("Edit");
        btn_edit_matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_matkulActionPerformed(evt);
            }
        });

        btn_hapus_matkul.setBackground(new java.awt.Color(57, 55, 104));
        btn_hapus_matkul.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_hapus_matkul.setForeground(new java.awt.Color(231, 231, 244));
        btn_hapus_matkul.setText("Hapus");
        btn_hapus_matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus_matkulActionPerformed(evt);
            }
        });

        tb_matkul.setBackground(new java.awt.Color(231, 231, 244));
        tb_matkul.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tb_matkul.setForeground(new java.awt.Color(57, 55, 104));
        tb_matkul.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_matkul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_matkulMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_matkul);

        tf_kd_matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_kd_matkulActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(57, 55, 104));
        jLabel1.setText("Kode Mata Kuliah");

        tf_nm_matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nm_matkulActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(57, 55, 104));
        jLabel2.setText("Nama Mata Kuliah");

        tf_cari_matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cari_matkulActionPerformed(evt);
            }
        });
        tf_cari_matkul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_cari_matkulKeyReleased(evt);
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
                            .addComponent(tf_cari_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_kd_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nm_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_tambah_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_edit_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_hapus_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txt_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tf_cari_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_kd_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_nm_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_edit_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapus_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void btn_tambah_matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_matkulActionPerformed
        ctrlMatkul.insertData();
    }//GEN-LAST:event_btn_tambah_matkulActionPerformed

    private void btn_edit_matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_matkulActionPerformed
       ctrlMatkul.editData();
    }//GEN-LAST:event_btn_edit_matkulActionPerformed

    private void btn_hapus_matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus_matkulActionPerformed
       ctrlMatkul.deleteData();
    }//GEN-LAST:event_btn_hapus_matkulActionPerformed

    private void tb_matkulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_matkulMouseClicked
        ctrlMatkul.getEditRow();
    }//GEN-LAST:event_tb_matkulMouseClicked

    private void tf_kd_matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_kd_matkulActionPerformed
       
    }//GEN-LAST:event_tf_kd_matkulActionPerformed

    private void tf_nm_matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nm_matkulActionPerformed
        
    }//GEN-LAST:event_tf_nm_matkulActionPerformed

    private void tf_cari_matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cari_matkulActionPerformed
        
    }//GEN-LAST:event_tf_cari_matkulActionPerformed

    private void tf_cari_matkulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cari_matkulKeyReleased
        ctrlMatkul.cariData();
    }//GEN-LAST:event_tf_cari_matkulKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_edit_matkul;
    private javax.swing.JButton btn_hapus_matkul;
    private javax.swing.JButton btn_tambah_matkul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_matkul;
    private javax.swing.JTextField tf_cari_matkul;
    private javax.swing.JTextField tf_kd_matkul;
    private javax.swing.JTextField tf_nm_matkul;
    private javax.swing.JLabel txt_jurusan;
    // End of variables declaration//GEN-END:variables
    
    
    public JTextField getKodeMatkul(){
        return tf_kd_matkul;
    }
    
    public JTextField getNamaMatkul(){
        return tf_nm_matkul;
    }
    public JTable getTabelMatkul(){
        return tb_matkul;
    }
    
    public JTextField getTextCari(){
        return tf_cari_matkul;
    }
}
