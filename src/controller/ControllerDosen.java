package controller;

import dao.DAODosen;
import dao.InterfaceDosen;
import java.util.List;
import javax.swing.JOptionPane;
import model.ModelDosen;
import model.TabelModelDosen;
import view.ViewDosen;

public class ControllerDosen {

    private ViewDosen view;
    InterfaceDosen infcDosen;
    List<ModelDosen> listDosen;

    public ControllerDosen(ViewDosen view) {
        this.view = view;
        infcDosen = new DAODosen();
        listDosen = infcDosen.getData();
    }

    public void load_table() {
        listDosen = infcDosen.getData();
        TabelModelDosen tmk = new TabelModelDosen(listDosen);
        view.getTabelDosen().setModel(tmk);
    }

    public void insertData() {
        ModelDosen dosen = new ModelDosen();
        dosen.setNip(view.getNipDosen().getText());
        dosen.setNama(view.getNamaDosen().getText());
        dosen.setAlamat(view.getAlamatDosen().getText());
        dosen.setTlp(view.getTlpDosen().getText());
        infcDosen.insert(dosen);
        JOptionPane.showMessageDialog(view, "Berhasil menambahkan data baru");
        view.getNipDosen().setText("");
        view.getNamaDosen().setText("");
        view.getAlamatDosen().setText("");
        view.getTlpDosen().setText("");
        load_table();
    }
    
    public void getEditRow(){
        int i = view.getTabelDosen().getSelectedRow();

        if (i > -1) {
            view.getNipDosen().setText(view.getTabelDosen().getValueAt(i, 0).toString());
            view.getNamaDosen().setText(view.getTabelDosen().getValueAt(i, 1).toString());
            view.getAlamatDosen().setText(view.getTabelDosen().getValueAt(i, 3).toString());
            view.getTlpDosen().setText(view.getTabelDosen().getValueAt(i, 2).toString());
        }
    }
    
    public void editData() {
        ModelDosen dosen = new ModelDosen();
        dosen.setNip(view.getNipDosen().getText());
        dosen.setNama(view.getNamaDosen().getText());
        dosen.setAlamat(view.getAlamatDosen().getText());
        dosen.setTlp(view.getTlpDosen().getText());
        infcDosen.update(dosen);
        JOptionPane.showMessageDialog(view, "Berhasil diedit");
        view.getNipDosen().setText("");
        view.getNamaDosen().setText("");
        view.getAlamatDosen().setText("");
        view.getTlpDosen().setText("");
        load_table();
    }
    
    public void deleteData() {
        ModelDosen dosen = new ModelDosen();
        dosen.setNip(view.getNipDosen().getText());
        infcDosen.delete(dosen);
        JOptionPane.showMessageDialog(view, "Berhasil dihapus");
        view.getNipDosen().setText("");
        view.getNamaDosen().setText("");
        view.getAlamatDosen().setText("");
        view.getTlpDosen().setText("");
        load_table();
    }
    
    public void cariData(){
        String cari = view.getTextCari().getText();
        listDosen = infcDosen.search(cari);
        TabelModelDosen tmk = new TabelModelDosen(listDosen);
        view.getTabelDosen().setModel(tmk);
    }

}
