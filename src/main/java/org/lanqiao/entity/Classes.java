package org.lanqiao.entity;

import java.util.List;

public class Classes {
    private Integer cid;

    private String className;

    /*private Integer teacherId;*/
    private Teacher teacher;
//在一的一方，添加一个list用于存放多的一方对象
    private List<Student> stulist;
    public Integer getCid() {
        return cid;
    }

    public List<Student> getStudentResult() {
		return stulist;
	}

	public void setStudentResult(List<Student> studentResult) {
		stulist = studentResult;
	}

	public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	
public String toString() {
		return "Classes [cid=" + cid + ", className=" + className + ", teacherName=" + teacher.getName() + ", StudentResult="
				+ stulist + "]";
	}
	
	


  
}