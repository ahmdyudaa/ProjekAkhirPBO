package view;

import view.ViewLogin;
import controller.ControllerDosen;
import controller.ControllerJurusan;
import controller.ControllerMahasiswa;
import controller.ControllerMatkul;
import javax.swing.JOptionPane;
import view.ViewDosen;
import view.ViewJurusan;
import view.ViewMahasiswa;
import view.ViewMatkul;

public class ViewHomePage extends javax.swing.JFrame {
    
    public ViewHomePage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopSection = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        decription = new javax.swing.JLabel();
        LeftSection = new javax.swing.JPanel();
        btn_jurusan = new javax.swing.JButton();
        text_menu = new javax.swing.JLabel();
        btn_mahasiwa = new javax.swing.JButton();
        btn_dosen = new javax.swing.JButton();
        btn_matkul = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        DynamicSection = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TopSection.setBackground(new java.awt.Color(57, 55, 104));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-flying-mortarboard-90.png"))); // NOI18N

        title.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(231, 231, 244));
        title.setText("Aplikasi Sistem Informasi Akademik");

        decription.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        decription.setForeground(new java.awt.Color(231, 231, 244));
        decription.setText("Created By : Ahmad Yuda Hermawan (123210075) dan In'am Muhammad (123210137)");

        javax.swing.GroupLayout TopSectionLayout = new javax.swing.GroupLayout(TopSection);
        TopSection.setLayout(TopSectionLayout);
        TopSectionLayout.setHorizontalGroup(
            TopSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopSectionLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addGroup(TopSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decription))
                .addGap(0, 236, Short.MAX_VALUE))
        );
        TopSectionLayout.setVerticalGroup(
            TopSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopSectionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(decription)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        LeftSection.setBackground(new java.awt.Color(90, 91, 174));

        btn_jurusan.setBackground(new java.awt.Color(57, 55, 104));
        btn_jurusan.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_jurusan.setForeground(new java.awt.Color(231, 231, 244));
        btn_jurusan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-learning-30.png"))); // NOI18N
        btn_jurusan.setText("Data Jurusan");
        btn_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jurusanActionPerformed(evt);
            }
        });

        text_menu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        text_menu.setForeground(new java.awt.Color(231, 231, 244));
        text_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text_menu.setText("MAIN MENU");

        btn_mahasiwa.setBackground(new java.awt.Color(57, 55, 104));
        btn_mahasiwa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_mahasiwa.setForeground(new java.awt.Color(231, 231, 244));
        btn_mahasiwa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-student-30.png"))); // NOI18N
        btn_mahasiwa.setText("Data Mahasiswa");
        btn_mahasiwa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mahasiwaActionPerformed(evt);
            }
        });

        btn_dosen.setBackground(new java.awt.Color(57, 55, 104));
        btn_dosen.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_dosen.setForeground(new java.awt.Color(231, 231, 244));
        btn_dosen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-lecturer-30.png"))); // NOI18N
        btn_dosen.setText("Data Dosen");
        btn_dosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dosenActionPerformed(evt);
            }
        });

        btn_matkul.setBackground(new java.awt.Color(57, 55, 104));
        btn_matkul.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_matkul.setForeground(new java.awt.Color(231, 231, 244));
        btn_matkul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-return-book-30.png"))); // NOI18N
        btn_matkul.setText("Data Mata Kuliah");
        btn_matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_matkulActionPerformed(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(57, 55, 104));
        btn_logout.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(231, 231, 244));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-logout-30.png"))); // NOI18N
        btn_logout.setText("Log Out");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftSectionLayout = new javax.swing.GroupLayout(LeftSection);
        LeftSection.setLayout(LeftSectionLayout);
        LeftSectionLayout.setHorizontalGroup(
            LeftSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftSectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_jurusan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_mahasiwa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_dosen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_matkul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LeftSectionLayout.setVerticalGroup(
            LeftSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftSectionLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(text_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btn_mahasiwa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_dosen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        DynamicSection.setBackground(new java.awt.Color(231, 231, 244));

        javax.swing.GroupLayout DynamicSectionLayout = new javax.swing.GroupLayout(DynamicSection);
        DynamicSection.setLayout(DynamicSectionLayout);
        DynamicSectionLayout.setHorizontalGroup(
            DynamicSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DynamicSectionLayout.setVerticalGroup(
            DynamicSectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DynamicSection))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeftSection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DynamicSection)))
        );

        setSize(new java.awt.Dimension(1219, 792));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jurusanActionPerformed
        ViewJurusan jurusan = new ViewJurusan();
        ControllerJurusan ctrlJurusan = new ControllerJurusan(jurusan);
        ctrlJurusan.load_table();
        DynamicSection.removeAll();
        DynamicSection.add(jurusan);
        jurusan.setSize(DynamicSection.getWidth(),DynamicSection.getHeight());
        jurusan.setVisible(true);
    }//GEN-LAST:event_btn_jurusanActionPerformed

    private void btn_mahasiwaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mahasiwaActionPerformed
        ViewMahasiswa mhs = new ViewMahasiswa();
        ControllerMahasiswa ctrlMahasiswa = new ControllerMahasiswa(mhs);
        ctrlMahasiswa.load_table();
        DynamicSection.removeAll();
        DynamicSection.add(mhs);
        mhs.setSize(DynamicSection.getWidth(),DynamicSection.getHeight());
        mhs.setVisible(true);
    }//GEN-LAST:event_btn_mahasiwaActionPerformed

    private void btn_dosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dosenActionPerformed
        ViewDosen dosen = new ViewDosen();
        ControllerDosen ctrldosen = new ControllerDosen(dosen);
        ctrldosen.load_table();
        DynamicSection.removeAll();
        DynamicSection.add(dosen);
        dosen.setSize(DynamicSection.getWidth(),DynamicSection.getHeight());
        dosen.setVisible(true);
    }//GEN-LAST:event_btn_dosenActionPerformed

    private void btn_matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_matkulActionPerformed
        ViewMatkul mk = new ViewMatkul();
        ControllerMatkul ctrlMatkul = new ControllerMatkul(mk);
        ctrlMatkul.load_table();
        DynamicSection.removeAll();
        DynamicSection.add(mk);
        mk.setSize(DynamicSection.getWidth(),DynamicSection.getHeight());
        mk.setVisible(true);
    }//GEN-LAST:event_btn_matkulActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        JOptionPane.showMessageDialog(this, "Berhasil Logout");
        dispose();
        ViewLogin login = new ViewLogin();
        login.setVisible(true);
        
    }//GEN-LAST:event_btn_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DynamicSection;
    private javax.swing.JPanel LeftSection;
    private javax.swing.JPanel TopSection;
    private javax.swing.JButton btn_dosen;
    private javax.swing.JButton btn_jurusan;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_mahasiwa;
    private javax.swing.JButton btn_matkul;
    private javax.swing.JLabel decription;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel text_menu;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
