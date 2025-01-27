package com.jdbcpractice.jdbcpractice;
import java.sql.*;

import com.mysql.jdbc.Driver;


public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        Student student=new Student();
        student.rollNo=15;
        student.name="Pranay";
        String query="insert into student values (?,?)";
        String url="jdbc:mysql://localhost/student?"+"user=root&password=Blackcat1308*#";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, "root", "Blackcat1308*#");
        PreparedStatement st=con.prepareStatement(query);
        st.setInt(1, 68);
        st.setString(2, "Aman");
        int result=st.executeUpdate();
        //result.next();
        //System.out.println(result.getInt(1)+" : "+result.getString(2));
        System.out.println(result);
        st.close();
        con.close();

        
    }
}
