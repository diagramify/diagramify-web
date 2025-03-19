package com.diagramify.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class QueueWrapper {

    private String queueWrapperId;
    private String queueWrapperName;
    private String queueWrapperType;
    private List<Queue> inBoundQueueList;
    private List<Queue> outBoundQueueList;

}
