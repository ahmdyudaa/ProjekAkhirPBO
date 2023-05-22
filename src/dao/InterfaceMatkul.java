package dao;

import model.ModelMatkul;
import java.util.List;

public interface InterfaceMatkul {
    
    public void insert(ModelMatkul matkul);

    public void update(ModelMatkul matkul);

    public void delete(ModelMatkul matkul);
    
    public List<ModelMatkul> getData();
    
    public List<ModelMatkul> search(String keyword);
    
}