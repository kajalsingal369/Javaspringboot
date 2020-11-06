package com.training.org;

public class Project {
private String  projectId;
private String projectName;
 
public Project() {
	this.projectId= "";
	this.projectName= "";
}

public Project(String projectId, String projectName) {
	
	this.projectId = projectId;
	this.projectName = projectName;
}

public String getProjectId() {
	return projectId;
}

public void setProjectId(String projectId) {
	this.projectId = projectId;
}

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

@Override
public String toString() {
	return "Project [projectId=" + projectId + ", projectName=" + projectName + "]";
}


	
}
