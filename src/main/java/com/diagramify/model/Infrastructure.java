package com.diagramify.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Infrastructure {

    private String infrastructureId;
    private String getInfrastructureName;
    List<Environment> environmentList;
}
