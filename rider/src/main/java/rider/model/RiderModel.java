package rider.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
 
@Entity
@Table(name = "USERS")
public class RiderModel {
   
	@NotEmpty
	@Size(min=2,max=70)   
	private String username;
	@NotEmpty
	@Size(min=2,max=70)
    @Id private String email;
	@NotEmpty
	@Size(min=2,max=70)
	private String password;
	@NotEmpty
	@Size(min=2,max=70)
    private String passwordconfirm;
	
    private boolean enabled;
    private String roleId;
    
    
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordconfirm() {
		return passwordconfirm;
	}
	public void setPasswordconfirm(String passwordconfirm) {
		this.passwordconfirm = passwordconfirm;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}
	