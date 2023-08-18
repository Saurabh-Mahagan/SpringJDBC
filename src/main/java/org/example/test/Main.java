package org.example.test;

import org.example.dao.ProjectDeo;
import org.example.doman.Project;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("application-context.xml");
        ProjectDeo  projectDeo=applicationContext.getBean("projectDao",ProjectDeo.class);
        Project project=new Project();
        project.setProjectNo(3);
        project.setTitle("Hotel Managment System");
        project.setDescription("HMS");
        project.setDuration(45);project.setStatus("Test");
        System.out.println(projectDeo.insertProjects(project));
    }
}