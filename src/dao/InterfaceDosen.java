package dao;

import model.ModelDosen;
import java.util.List;

public interface InterfaceDosen {
    
    public void insert(ModelDosen dosen);

    public void update(ModelDosen dosen);

    public void delete(ModelDosen dosen);
    
    public List<ModelDosen> getData();
    
    public List<ModelDosen> search(String keyword);
    
}