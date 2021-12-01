package org.zerock.web;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

//JDBC 연결 테스트
public class MySQLConnectionTest {


private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
private static final String URL = "jdbc:mysql://127.0.0.1:3305/book_ex?serverTimezone=UTC";
private static final String USER = "crud";
private static final String PW = "crud";

@Test
public void testConnection() throws Exception{
Class.forName(DRIVER);

try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
System.out.println(con);
} catch (Exception e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}


}