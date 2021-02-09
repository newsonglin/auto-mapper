package com.exigen.mapper.repository;

import com.exigen.mapper.domain.Attribute;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends CrudRepository<Attribute,String> {
}
