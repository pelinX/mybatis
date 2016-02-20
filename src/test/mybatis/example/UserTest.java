package test.mybatis.example;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.example.dao.UserMapper;
import org.mybatis.example.entity.User;

public class UserTest {
	public static void main(String[] args) throws IOException {
		String resource = "properties/Configuration.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlSessionFactory.openSession();
		try {
			UserMapper mapper = session.getMapper(UserMapper.class);
			User user = mapper.getUser(1);
			System.out.println("end");
//			Map user = mapper.getUser(1);
		} finally {
		session.close();
		}
	}
}
