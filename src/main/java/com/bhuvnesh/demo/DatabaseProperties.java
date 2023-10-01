package com.bhuvnesh.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("classpath:/customProperties/db.properties")
public class DatabaseProperties
{
    @Value("${db.name}")
    private String name;

    @Value("${db.cluster.ip}")
    private List<String> clusterIP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getClusterIP() {
        return clusterIP;
    }

    public void setClusterIP(List<String> clusterIP) {
        this.clusterIP = clusterIP;
    }
}
