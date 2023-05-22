package controller;

import dao.DAOMahasiswa;
import dao.InterfaceMahasiswa;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelMahasiswa;
import model.TabelModelMahasiswa;
import view.ViewMahasiswa;

public class ControllerMahasiswa {

    private ViewMahasiswa view;
    InterfaceMahasiswa infcMahasiswa;
    List<ModelMahasiswa> listMahasiswa;

    public ControllerMahasiswa(ViewMahasiswa view) {
        this.view = view;
        infcMahasiswa = new DAOMahasiswa();
        listMahasiswa = infcMahasiswa.getData();
    }

    public void load_table() {
        listMahasiswa = infcMahasiswa.getData();
        TabelModelMahasiswa tmk = new TabelModelMahasiswa(listMahasiswa);
        view.getTabelMahasiswa().setModel(tmk);
    }

    public void insertData() {
        ModelMahasiswa mahasiswa = new ModelMahasiswa();
        mahasiswa.setNim(view.getNimMahasiswa().getText());
        mahasiswa.setNama(view.getNamaMahasiswa().getText());
        mahasiswa.setAlamat(view.getAlamatMahasiswa().getText());
        mahasiswa.setJurusan(view.getJurusanMahasiswa().getText());
        infcMahasiswa.insert(mahasiswa);
        JOptionPane.showMessageDialog(view, "Berhasil menambahkan data baru");
        view.getNimMahasiswa().setText("");
        view.getNamaMahasiswa().setText("");
        view.getAlamatMahasiswa().setText("");
        view.getJurusanMahasiswa().setText("");
        load_table();
    }
    
    public void getEditRow(){
        int i = view.getTabelMahasiswa().getSelectedRow();

        if (i > -1) {
            view.getNimMahasiswa().setText(view.getTabelMahasiswa().getValueAt(i, 0).toString());
            view.getNamaMahasiswa().setText(view.getTabelMahasiswa().getValueAt(i, 1).toString());
            view.getAlamatMahasiswa().setText(view.getTabelMahasiswa().getValueAt(i, 3).toString());
            view.getJurusanMahasiswa().setText(view.getTabelMahasiswa().getValueAt(i, 2).toString());
        }
    }
    
    public void editData() {
        ModelMahasiswa mahasiswa = new ModelMahasiswa();
        mahasiswa.setNim(view.getNimMahasiswa().getText());
        mahasiswa.setNama(view.getNamaMahasiswa().getText());
        mahasiswa.setAlamat(view.getAlamatMahasiswa().getText());
        mahasiswa.setJurusan(view.getJurusanMahasiswa().getText());
        infcMahasiswa.update(mahasiswa);
        JOptionPane.showMessageDialog(view, "Berhasil diedit");
        view.getNimMahasiswa().setText("");
        view.getNamaMahasiswa().setText("");
        view.getAlamatMahasiswa().setText("");
        view.getJurusanMahasiswa().setText("");
        load_table();
    }
    
    public void deleteData() {
        ModelMahasiswa mahasiswa = new ModelMahasiswa();
        mahasiswa.setNim(view.getNimMahasiswa().getText());
        infcMahasiswa.delete(mahasiswa);
        JOptionPane.showMessageDialog(view, "Berhasil dihapus");
        view.getNimMahasiswa().setText("");
        view.getNamaMahasiswa().setText("");
        view.getAlamatMahasiswa().setText("");
        view.getJurusanMahasiswa().setText("");
        load_table();
    }
    
    public void cariData(){
        String cari = view.getTextCari().getText();
        listMahasiswa = infcMahasiswa.search(cari);
        TabelModelMahasiswa tmk = new TabelModelMahasiswa(listMahasiswa);
        view.getTabelMahasiswa().setModel(tmk);
    }

}
