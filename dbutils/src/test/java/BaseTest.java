import dome.base.DBConf;
import dome.base.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * base test
 * @author Somin
 */
public class BaseTest
{

	QueryRunner queryRunner = new QueryRunner();
	Connection conn= null;
	@Before
	public void init()
	{
		conn= DBConf.getConnection();
	}

	@Test
	@Ignore
	public void insertTest() throws  Exception
	{
		String sql = "INSERT INTO user(name, age) VALUES(?,?)";

		Object[] objectArr= queryRunner.insert(conn, sql, new ArrayHandler(), "root", 18);
		System.out.println("数组长度：" + objectArr.length + "；第0个元素的值：" +objectArr[0]);

		objectArr = queryRunner.insert(conn, sql, new ArrayHandler(), "test", 19);
		System.out.println("数组长度：" + objectArr.length + "；第0个元素的值：" +objectArr[0]);
	}

	@Test
	@Ignore
	public void queryBeanTest() throws Exception
	{
		ResultSetHandler<User> resultSetHandler=new BeanHandler<User>(User.class);
		String sql ="SELECT * FROM user where id =?";
		User user=queryRunner.query(conn,sql,resultSetHandler,1);
		System.out.println("ID:"+user.getId()+",name:"+user.getName());

		ResultSetHandler<List<User>> resultSetHandlers=new BeanListHandler<User>(User.class);
		String sqlList="SELECT * FROM user";
		List<User> users=queryRunner.query(conn,sqlList,resultSetHandlers);
		users.forEach(u->{
			System.out.println("id:"+u.getId()+",name:"+u.getName());
		});
	}

	@Test
	public void queryMapTest() throws Exception
	{
		String sql ="SELECT * FROM user where id =?";
		Map<String, Object> resultMap =	queryRunner.query(conn,sql,new MapHandler(),1);
		System.out.println("获取一条数据："+resultMap);

		String sql2 ="SELECT * FROM user ";
		List<Map<String, Object>> resultMaps =	queryRunner.query(conn,sql2,new MapListHandler());
		resultMaps.forEach(result->{
			System.out.println(result);
		});
	}

	@Test
	@Ignore
	public void queryListTest() throws Exception
	{
		String sql="SELECT * FROM user";
		List<Object[]> objects=  queryRunner.query(conn,sql,new ArrayListHandler());
		objects.forEach(object->{
			System.out.println(Arrays.toString(object));
		});
	}
}
