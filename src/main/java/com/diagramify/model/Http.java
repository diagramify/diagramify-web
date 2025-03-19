package com.diagramify.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Http {

    private List<HttpEndpoint> inBoundHttpListEndpoint;
    private List<HttpEndpoint> outBoundHttpListEndpoint;

}
