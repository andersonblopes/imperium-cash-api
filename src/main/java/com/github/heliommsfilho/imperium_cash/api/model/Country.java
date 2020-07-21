package com.github.heliommsfilho.imperium_cash.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "country")
@Getter @Setter
@EqualsAndHashCode(of = {"id"}, callSuper = true)
public class Country extends BaseEntity {

    private static final long serialVersionUID = 1L;
    
    @NotBlank
    @Size(min = 1, max = 2)
    @Column(name = "code")
    @ApiModelProperty(value = "Country ISO code", required = true)
    private String code;

    @NotBlank
    @Size(min = 1, max = 50)
    @Column(name = "name")
    @ApiModelProperty(value = "Country name", required = true)
    private String name;
}