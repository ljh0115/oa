package UtilDemo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC1 {
	public static void main(String[] args) {
		//��ȡ����
		Connection conn=null;
		try {
			conn=TestUtil.getConn();
			System.out.println("���ӳɹ�");
			/*
			 * ����Statement���� �����ǽ�sql��䷢�͵����ݿ���ִ��
			 * ���÷�����
			 * 1.executeUpdate() ��������ɾ�����
			 * 2.executeQuery() ʹ�����ѯ���
			 * 3.execute() �������κ����͵����
			 * 
			 */
			Statement st=conn.createStatement();
			//��������
			String s1="insert into stuinfo values(2,'����','��')";
			st.execute(s1);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			//�ر���Դ
			TestUtil.getClose(conn);
		}
	}
}