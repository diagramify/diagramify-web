package com.diagramify.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HttpEndpoint {

    private String url;
    private String method;
    private String type;
}
