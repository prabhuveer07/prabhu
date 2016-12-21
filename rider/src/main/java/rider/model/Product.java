package rider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;


 
@Entity
//@Table(name = "Product")
public class Product {
   
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	@NotEmpty
	@Size(min=2,max=70)
    private String category;
	@NotEmpty
	@Size(min=2,max=70)
    private String description;
	@NotEmpty
	@Size(min=2,max=70)
    private String manufacturer;
	@NotEmpty
	@Size(min=2,max=70)
    private String name;
	@NotNull
	private int price;
	@NotNull
	
    private int available;
	
	@Transient
	private MultipartFile file;
		
	
	
	
	
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	
	
    
}	
    
