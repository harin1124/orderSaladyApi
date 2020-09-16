package orderSaladyApi.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USER_INFO")
@NoArgsConstructor
@Data
public class UserInfoEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rowId;
	
	@Column(nullable=true)
	private String userId;
	
	@Column(nullable=true)
	private String userName;
	
	@Column(nullable=true)
	private String userPassword;
	
	@Column(nullable=true)
	private LocalDateTime regDate=LocalDateTime.now();
	
	@Column(nullable=true)
	private String topAdminYn="N";
}