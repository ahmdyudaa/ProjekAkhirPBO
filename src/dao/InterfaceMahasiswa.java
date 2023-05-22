package dao;

import model.ModelMahasiswa;
import java.util.List;

public interface InterfaceMahasiswa {
    
    public void insert(ModelMahasiswa mahasiswa);

    public void update(ModelMahasiswa mahasiswa);

    public void delete(ModelMahasiswa mahasiswa);
    
    public List<ModelMahasiswa> getData();
    
    public List<ModelMahasiswa> search(String keyword);
    
}