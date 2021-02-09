package com.exigen.mapper.domain;

import com.exigen.mapper.domain.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Attribute extends BaseEntity {
    private String name;

    private String path;

    private String keywords;
}
