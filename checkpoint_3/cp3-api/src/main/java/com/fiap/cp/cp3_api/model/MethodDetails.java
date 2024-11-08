package com.fiap.cp.cp3_api.model;

public class MethodDetails {
    
    private String name = "HAMMING_DISTANCE";
    private String about = "The Hamming Distance measures the difference between two strings of equal length by counting the number of positions where the corresponding characters differ.";
    private String[] references = {
        "https://www.sciencedirect.com/topics/computer-science/hamming-distance",
        "https://en.wikipedia.org/wiki/Hamming_distance"
    };

    // Getters e Setters
    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public String getAbout() { 
        return about; 
    }
    public void setAbout(String about) { 
        this.about = about; 
    }

    public String[] getReferences() { 
        return references; 
    }
    public void setReferences(String[] references) { 
        this.references = references; 
    }
    
}