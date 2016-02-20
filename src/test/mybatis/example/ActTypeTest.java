package test.mybatis.example;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.dao.ActivitytypeMapper;
import org.mybatis.example.entity.Activitytype;

public class ActTypeTest {
	public static void main(String[] args) throws IOException {
		String resource = "properties/Configuration.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		try {
			ActivitytypeMapper mapper = session.getMapper(ActivitytypeMapper.class);
			Activitytype activitytype = mapper.getUserById(1);
			System.out.println("end");
//			Map user = mapper.getUser(1);
		} finally {
		session.close();
		}
	}
}
