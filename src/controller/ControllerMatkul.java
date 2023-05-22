package controller;

import dao.DAOMatkul;
import dao.InterfaceMatkul;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelMatkul;
import model.TabelModelMatkul;
import view.ViewMatkul;

public class ControllerMatkul {

    private ViewMatkul view;
    InterfaceMatkul infcMatkul;
    List<ModelMatkul> listMatkul;

    public ControllerMatkul(ViewMatkul view) {
        this.view = view;
        infcMatkul = new DAOMatkul();
        listMatkul = infcMatkul.getData();
    }

    public void load_table() {
        listMatkul = infcMatkul.getData();
        TabelModelMatkul tmk = new TabelModelMatkul(listMatkul);
        view.getTabelMatkul().setModel(tmk);
    }

    public void insertData() {
        ModelMatkul matkul = new ModelMatkul();
        matkul.setKd_matkul(view.getKodeMatkul().getText());
        matkul.setNm_matkul(view.getNamaMatkul().getText());
        infcMatkul.insert(matkul);
        JOptionPane.showMessageDialog(view, "Berhasil menambahkan data baru");
        view.getKodeMatkul().setText("");
        view.getNamaMatkul().setText("");
        load_table();
    }
    
    public void getEditRow(){
        int i = view.getTabelMatkul().getSelectedRow();

        if (i > -1) {
            view.getKodeMatkul().setText(view.getTabelMatkul().getValueAt(i, 0).toString());
            view.getNamaMatkul().setText(view.getTabelMatkul().getValueAt(i, 1).toString());
        }
    }
    
    public void editData() {
        ModelMatkul matkul = new ModelMatkul();
        matkul.setKd_matkul(view.getKodeMatkul().getText());
        matkul.setNm_matkul(view.getNamaMatkul().getText());
        infcMatkul.update(matkul);
        JOptionPane.showMessageDialog(view, "Berhasil diedit");
        view.getKodeMatkul().setText("");
        view.getNamaMatkul().setText("");
    }
    
    public void deleteData() {
        ModelMatkul matkul = new ModelMatkul();
        matkul.setKd_matkul(view.getKodeMatkul().getText());
        infcMatkul.delete(matkul);
        JOptionPane.showMessageDialog(view, "Berhasil dihapus");
        view.getKodeMatkul().setText("");
        view.getNamaMatkul().setText("");
    }
    
    public void cariData(){
        String cari = view.getTextCari().getText();
        listMatkul = infcMatkul.search(cari);
        TabelModelMatkul tmk = new TabelModelMatkul(listMatkul);
        view.getTabelMatkul().setModel(tmk);
    }

}
