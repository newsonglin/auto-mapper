package com.exigen.mapper.service.support;

import com.exigen.mapper.domain.Attribute;
import com.exigen.mapper.repository.AttributeRepository;
import com.exigen.mapper.service.AttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Slf4j
public class AttributeServiceImpl implements AttributeService {

    private final AttributeRepository attributeRepository;

    public AttributeServiceImpl(AttributeRepository attributeRepository) {
        this.attributeRepository = attributeRepository;
    }


    public void save(Attribute attribute){
        this.attributeRepository.save(attribute);
    }

    public List<Attribute> findAll(){
        return StreamSupport.stream(this.attributeRepository.findAll().spliterator(),false).collect(Collectors.toList());
    }

}
