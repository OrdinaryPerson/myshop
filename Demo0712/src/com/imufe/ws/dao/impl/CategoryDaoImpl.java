package com.imufe.ws.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.imufe.ws.dao.CategoryDao;
import com.imufe.ws.pojo.Category;
import com.imufe.ws.util.JdbcUtil;

public class CategoryDaoImpl implements CategoryDao {

    @Override
    public List<Category> FindAllElement() {
        List<Category> list=null;
        try {
            //1.连接
            Connection conn=JdbcUtil.getConnection();
            String sql="select * from ws_category";
            list = null;
            Category category=null;
            //获取执行语句对象
            Statement stmt= conn.createStatement();
            //获取结果集
            ResultSet rs=stmt.executeQuery(sql);
            list=new ArrayList<>();
            while(rs.next()) {
                category=new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                category.setCreateTime(rs.getDate("create_time"));
                category.setUpdateTime(rs.getDate("update_time"));
                list.add(category);            
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }       
        return list;
    }
    
}
