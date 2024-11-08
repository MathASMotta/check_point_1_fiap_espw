package com.fiap.cp.cp3_api.model;

import java.util.List;

public class AlignmentRequest {

    private String tracing_uuid;
    private String format;
    private String method;
    private List<SequenceRequest> sequences;

    // Getters e Setters
    public String getTracing_uuid() { 
        return tracing_uuid; 
    }
    public void setTracing_uuid(String tracing_uuid) { 
        this.tracing_uuid = tracing_uuid; 
    }

    public String getFormat() { 
        return format; 
    }
    public void setFormat(String format) { 
        this.format = format; 
    }

    public String getMethod() { 
        return method; 
    }
    public void setMethod(String method) { 
        this.method = method; 
    }

    public List<SequenceRequest> getSequences() { 
        return sequences; 
    }
    public void setSequences(List<SequenceRequest> sequences) { 
        this.sequences = sequences; 
    }

}