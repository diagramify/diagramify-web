package com.diagramify.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Jms {

    private List<QueueWrapper> queueWrapperList;
}
