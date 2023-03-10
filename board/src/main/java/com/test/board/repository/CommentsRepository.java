package com.test.board.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

import com.test.board.entity.CommentsEitnty;

@Repository
public interface CommentsRepository extends JpaAttributeConverter<CommentsEitnty, Integer>{

}
