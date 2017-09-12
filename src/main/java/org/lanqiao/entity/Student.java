package org.lanqiao.entity;

public class Student {
    private Integer sid;

    private String name;

    private Integer classId;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

	@Override
	public String toString() {
		return "Student [name=" + name +"]";
	}
    
}