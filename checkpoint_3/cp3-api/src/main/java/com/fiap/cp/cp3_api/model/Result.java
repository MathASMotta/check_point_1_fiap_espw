package com.fiap.cp.cp3_api.model;

import java.time.LocalDateTime;

public class Result {

    private double distance_score;
    private double similarity_score;
    private String observations;
    private int length;
    private String format;
    private double processing_time;
    private LocalDateTime created_at;
    private String status;

    // Getters e Setters
    public double getDistance_score() { 
        return distance_score; 
    }
    public void setDistance_score(double distance_score) { 
        this.distance_score = distance_score; 
    }

    public double getSimilarity_score() { 
        return similarity_score; 
    }
    public void setSimilarity_score(double similarity_score) { 
        this.similarity_score = similarity_score; 
    }

    public String getObservations() { 
        return observations; 
    }
    public void setObservations(String observations) { 
        this.observations = observations; 
    }

    public int getLength() { 
        return length; 
    }
    public void setLength(int length) { 
        this.length = length; 
    }

    public String getFormat() { 
        return format; 
    }
    public void setFormat(String format) { 
        this.format = format; 
    }

    public double getProcessing_time() { 
        return processing_time; 
    }
    public void setProcessing_time(double processing_time) { 
        this.processing_time = processing_time; 
    }

    public LocalDateTime getCreated_at() { 
        return created_at; 
    }
    public void setCreated_at(LocalDateTime created_at) { 
        this.created_at = created_at; 
    }

    public String getStatus() { 
        return status; 
    }
    public void setStatus(String status) { 
        this.status = status; 
    }
    
}