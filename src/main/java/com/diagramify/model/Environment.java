package com.diagramify.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Environment {

    private String environmentId;
    private String environmentName;
    private String getEnvironmentType;
    private List<Application> applicationList;
    private Jms jms;
    private Http http;
    private List<Database> databaseList;
}
