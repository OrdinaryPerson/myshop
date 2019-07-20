package com.imufe.ws.service.impl;


import java.util.List;

import com.imufe.ws.dao.CategoryDao;
import com.imufe.ws.dao.impl.CategoryDaoImpl;
import com.imufe.ws.pojo.Category;
import com.imufe.ws.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao categoryDao=new CategoryDaoImpl();
    private List<Category> dbList=null;
        
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		dbList=categoryDao.FindAllElement();
		return dbList;
	}
	
}
