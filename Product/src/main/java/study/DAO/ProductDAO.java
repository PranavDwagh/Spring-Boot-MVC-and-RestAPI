package study.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepository;
import study.entity.ProductEntity;

@Service
public class ProductDAO {

	@Autowired
	MyRepository rs;

	public void addProduct(ProductEntity obj) {
		
		rs.save(obj);
		
	}

	public List<ProductEntity> getAll() {

		return rs.findAll();
		
	}

	/*
	 * public void update(int id, String name) {
	 * 
	 * ProductEntity obj = rs.findById(id).get(); obj.setProdName(name);
	 * rs.save(obj);
	 * 
	 * }
	 */

	public void deleteProduct(int id) {

		ProductEntity obj = rs.findById(id).get();
		if(obj!=null)
		{
			rs.delete(obj);
		}
		
	}

	public void update(ProductEntity obj) {
		
		ProductEntity newObj = rs.findById(obj.getProdId()).get();
		if(newObj!=null)
		{
			if(!obj.getProdName().equals(""))
			{
				System.out.println("in the name"+obj.getProdName());
				newObj.setProdName(obj.getProdName());
			}
			if(obj.getProdDesc()!="")
			{
				System.out.println("in the desc"+obj.getProdDesc());
				newObj.setProdDesc(obj.getProdDesc());
			}
			
			if(obj.getProdCost()!="")
			{
				System.out.println("in the cost"+obj.getProdCost());
				newObj.setProdCost(obj.getProdCost());
			}
			
			if(obj.getExpiryDate()!=null)
			{
				System.out.println("in the date"+obj.getExpiryDate());
				newObj.setExpiryDate(obj.getExpiryDate());
			}
			
		}
		rs.save(newObj);
	}
	
	
	
}
