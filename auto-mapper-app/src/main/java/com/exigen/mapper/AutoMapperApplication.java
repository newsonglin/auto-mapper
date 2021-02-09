package com.exigen.mapper;

import com.exigen.mapper.domain.Attribute;
import com.exigen.mapper.service.AttributeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * TODO description
 *
 * @author Songlin Li
 * @since 1.0
 */
@SpringBootApplication
@Slf4j
public class AutoMapperApplication  implements CommandLineRunner {

    @Autowired
    private AttributeService attributeService;

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Hello World!");
        Attribute attribute= new Attribute();
        attribute.setName("Number");
        attribute.setPath("abc>def");
        attribute.setKeywords("abc;def;ghk");

        attributeService.save(attribute);

        List<Attribute> list=attributeService.findAll();
     log.info("list size is :{}" ,list==null?0:list.size());


    }
    public static void main(String[] args) {
        new SpringApplication(AutoMapperApplication.class).run(args);
    }
}