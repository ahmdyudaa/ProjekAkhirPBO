package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelModelMahasiswa extends AbstractTableModel {

    List<ModelMahasiswa> mMahasiswa;

    public TabelModelMahasiswa(List<ModelMahasiswa> mMahasiswa) {
        this.mMahasiswa = mMahasiswa;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return mMahasiswa.size();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "NIM";
            case 1:
                return "Nama";
            case 2:
                return "Jurusan";
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
                return mMahasiswa.get(row).getNim();
            case 1:
                return mMahasiswa.get(row).getNama();
            case 2:
                return mMahasiswa.get(row).getJurusan();
            case 3:
                return mMahasiswa.get(row).getAlamat();
            default:
                return null;
        }
    }
}
