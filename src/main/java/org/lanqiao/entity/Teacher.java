package org.lanqiao.entity;

public class Teacher {
    private Integer tid;

    private String name;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", name=" + name + "]";
	}
}