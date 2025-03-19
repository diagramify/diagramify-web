package com.diagramify.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Application {

    private String applicationId;
    private String applicationName;
    private String applicationType;
    private String applicationGroup;
    private String applicationPort;
    private String applicationContextPath;

}
