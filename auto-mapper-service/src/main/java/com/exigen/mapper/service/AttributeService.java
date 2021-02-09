package com.exigen.mapper.service;

import com.exigen.mapper.domain.Attribute;

import java.util.List;

public interface AttributeService {
     void save(Attribute attribute);
     List<Attribute> findAll();
}
