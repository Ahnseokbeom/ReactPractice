package com.test.board.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="User")
@Table(name="User")
public class UserEntity {
	@Id
	private String userEmail;
	
	private String userPassword;
	private String userNickname;
	private String userPhone;
	private String userAddress;
	private String UserProfile;
}
