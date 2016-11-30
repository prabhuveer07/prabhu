package rider.dao;

import java.util.List;

import rider.model.RiderModel;

public interface UserDAO {
   
   
    public void Update(RiderModel obj);
    public void insert(RiderModel obj);
    public void delete(RiderModel obj); 
    public List<RiderModel> list1(String username,String password);
}