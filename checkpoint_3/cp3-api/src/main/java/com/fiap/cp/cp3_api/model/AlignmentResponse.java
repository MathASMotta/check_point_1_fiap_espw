package com.fiap.cp.cp3_api.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class AlignmentResponse {

    private String tracing_id;
    private String alignment_uuid;
    private MethodDetails method;
    private Result result;
    private String status;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    // Construtor padrão
    public AlignmentResponse() {
        this.alignment_uuid = UUID.randomUUID().toString();  // Gera um UUID único para cada resposta
        this.created_at = LocalDateTime.now();               // Marca a data/hora de criação
        this.updated_at = LocalDateTime.now();               // Inicializa a data/hora de atualização
        this.status = "PROCESSED";                           // Define o status padrão
    }

    // Getters e Setters
    public String getTracing_id() { 
        return tracing_id; 
    }
    public void setTracing_id(String tracing_id) { 
        this.tracing_id = tracing_id; 
    }

    public String getAlignment_uuid() { 
        return alignment_uuid; 
    }
    public void setAlignment_uuid(String alignment_uuid) { 
        this.alignment_uuid = alignment_uuid; 
    }

    public MethodDetails getMethod() { 
        return method; 
    }
    public void setMethod(MethodDetails method) { 
        this.method = method; 
    }

    public Result getResult() { 
        return result; 
    }
    public void setResult(Result result) { 
        this.result = result; 
    }

    public String getStatus() { 
        return status; 
    }
    public void setStatus(String status) { 
        this.status = status; 
    }

    public LocalDateTime getCreated_at() { 
        return created_at; 
    }
    public void setCreated_at(LocalDateTime created_at) { 
        this.created_at = created_at; 
    }

    public LocalDateTime getUpdated_at() { 
        return updated_at; 
    }
    public void setUpdated_at(LocalDateTime updated_at) { 
        this.updated_at = updated_at; 
    }

}
