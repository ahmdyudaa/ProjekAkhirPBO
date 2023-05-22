package dao;

import model.ModelJurusan;
import java.util.List;

public interface InterfaceJurusan {
    
    public void insert(ModelJurusan jurusan);

    public void update(ModelJurusan jurusan);

    public void delete(ModelJurusan jurusan);
    
    public List<ModelJurusan> getData();
    
    public List<ModelJurusan> search(String keyword);
    
}