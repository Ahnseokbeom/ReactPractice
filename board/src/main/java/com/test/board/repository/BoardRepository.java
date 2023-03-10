package com.test.board.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.stereotype.Repository;

import com.test.board.entity.BoardEntity;

@Repository
public interface BoardRepository extends JpaAttributeConverter<BoardEntity, Integer>{

}
