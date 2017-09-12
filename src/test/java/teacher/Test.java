package teacher;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lanqiao.dao.ClassesDao;
import org.lanqiao.entity.Classes;
import org.lanqiao.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-Config.xml");
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession session=sessionFactory.openSession();
			ClassesDao dao=session.getMapper(ClassesDao.class);
			List<Classes> list=dao.getAllClasses();
			for(Classes obj : list){
				System.out.println(obj.toString());
				for (Student stu : obj.getStudentResult()) {
					System.out.println(stu.toString());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
                  
	}

}
