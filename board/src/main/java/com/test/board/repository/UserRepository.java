package com.test.board.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

import com.test.board.entity.UserEntity;

@Repository
public interface UserRepository extends JpaAttributeConverter<UserEntity, String>{

}
