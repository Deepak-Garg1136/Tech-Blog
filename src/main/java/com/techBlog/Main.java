package com.techBlog;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Main {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080); // Port where the app will run
        tomcat.getConnector(); // Create and configure the connector
        tomcat.addWebapp("/", new File("src/main/webapp").getAbsolutePath()); // Path to webapp directory
        System.out.println("Starting TechBlog application...");
        tomcat.start();
        tomcat.getServer().await(); // Keep the server running
    }
}

