package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelModelDosen extends AbstractTableModel {

    List<ModelDosen> mDosen;

    public TabelModelDosen(List<ModelDosen> mDosen) {
        this.mDosen = mDosen;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return mDosen.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIM";
            case 1:
                return "Nama";
            case 2:
                return "No Telp";
            case 3:
                return "Alamat";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return mDosen.get(row).getNip();
            case 1:
                return mDosen.get(row).getNama();
            case 2:
                return mDosen.get(row).getTlp();
            case 3:
                return mDosen.get(row).getAlamat();
            default:
                return null;
        }
    }
}
