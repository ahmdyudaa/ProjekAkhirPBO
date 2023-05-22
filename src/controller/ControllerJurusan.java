package controller;

import dao.DAOJurusan;
import dao.InterfaceJurusan;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelJurusan;
import model.TabelModelJurusan;
import view.ViewJurusan;

public class ControllerJurusan {

    private ViewJurusan view;
    InterfaceJurusan infcJurusan;
    List<ModelJurusan> listJurusan;

    public ControllerJurusan(ViewJurusan view) {
        this.view = view;
        infcJurusan = new DAOJurusan();
        listJurusan = infcJurusan.getData();
    }

    public void load_table() {
        listJurusan = infcJurusan.getData();
        TabelModelJurusan tmk = new TabelModelJurusan(listJurusan);
        view.getTabelJurusan().setModel(tmk);
    }

    public void insertData() {
        ModelJurusan jurusan = new ModelJurusan();
        jurusan.setKd_jurusan(view.getKodeJurusan().getText());
        jurusan.setNm_jurusan(view.getNamaJurusan().getText());
        infcJurusan.insert(jurusan);
        JOptionPane.showMessageDialog(view, "Berhasil menambahkan data baru");
        view.getKodeJurusan().setText("");
        view.getNamaJurusan().setText("");
        load_table();
    }
    
    public void getEditRow(){
        int i = view.getTabelJurusan().getSelectedRow();

        if (i > -1) {
            view.getKodeJurusan().setText(view.getTabelJurusan().getValueAt(i, 0).toString());
            view.getNamaJurusan().setText(view.getTabelJurusan().getValueAt(i, 1).toString());
        }
    }
    
    public void editData() {
        ModelJurusan jurusan = new ModelJurusan();
        jurusan.setKd_jurusan(view.getKodeJurusan().getText());
        jurusan.setNm_jurusan(view.getNamaJurusan().getText());
        infcJurusan.update(jurusan);
        JOptionPane.showMessageDialog(view, "Berhasil diedit");
        view.getKodeJurusan().setText("");
        view.getNamaJurusan().setText("");
        load_table();
    }
    
    public void deleteData() {
        ModelJurusan jurusan = new ModelJurusan();
        jurusan.setKd_jurusan(view.getKodeJurusan().getText());
        infcJurusan.delete(jurusan);
        JOptionPane.showMessageDialog(view, "Berhasil dihapus");
        view.getKodeJurusan().setText("");
        view.getNamaJurusan().setText("");
        load_table();
    }
    
    public void cariData(){
        String cari = view.getTextCari().getText();
        listJurusan = infcJurusan.search(cari);
        TabelModelJurusan tmk = new TabelModelJurusan(listJurusan);
        view.getTabelJurusan().setModel(tmk);
    }

}
