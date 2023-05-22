package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelModelMatkul extends AbstractTableModel {
    List<ModelMatkul> mMatkul;

    public TabelModelMatkul(List<ModelMatkul> mMatkul) {
        this.mMatkul = mMatkul;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public int getRowCount() {
        return mMatkul.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Matkul";
            case 1:
                return "Nama Matkul";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return mMatkul.get(row).getKd_matkul();
            case 1:
                return mMatkul.get(row).getNm_matkul();
            default:
                return null;
        }
    }
}