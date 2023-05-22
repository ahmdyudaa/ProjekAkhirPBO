package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelModelJurusan extends AbstractTableModel {
    List<ModelJurusan> mJurusan;

    public TabelModelJurusan(List<ModelJurusan> mJurusan) {
        this.mJurusan = mJurusan;
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public int getRowCount() {
        return mJurusan.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Kode Jurusan";
            case 1:
                return "Nama Jurusan";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return mJurusan.get(row).getKd_jurusan();
            case 1:
                return mJurusan.get(row).getNm_jurusan();
            default:
                return null;
        }
    }
}