import java.sql.Connection;

public class TestJDBC {
	public static void main(String[] args) {
		//获取连接
		Connection conn=null;
		try {
			conn=JDBCUtil.getConn();
			System.out.println("连接成功");
			/*
			 * 创建Statement对象 作用是将sql语句发送到数据库中执行
			 * 常用方法：
			 * 1.executeUpdate() 适用于增删改语句
			 * 2.executeQuery() 使用与查询语句
			 * 3.execute() 适用于任何类型的语句
			 * 
			 */
		}finally{
			//关闭资源
			JDBCUtil.getClose(conn);
		}
	}
}
