package com.fiap.cp.cp3_api.model;

public class SequenceRequest {

    private String sequence_uuid;
    private String sequence;

    // Getters e Setters
    public String getSequence_uuid() { 
        return sequence_uuid; 
    }
    public void setSequence_uuid(String sequence_uuid) { 
        this.sequence_uuid = sequence_uuid; 
    }

    public String getSequence() { 
        return sequence; 
    }
    public void setSequence(String sequence) { 
        this.sequence = sequence; 
    }

}