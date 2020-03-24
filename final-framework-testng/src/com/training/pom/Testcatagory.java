package com.training.pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.bean.LoginBean;
import com.training.bean.LoginCatagoryBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

public class Testcatagory {
	private WebDriver driver; 
	
	public static void main (String arg[]) throws IOException {

List<LoginCatagoryBean> list = getdata();
        
        Object[][] result = new Object[list.size()][]; 
        int count = 0; 
        for(LoginCatagoryBean temp : list){
            Object[]  obj = new Object[1]; 
            obj[0] = temp.getcatagoryName(); 
          //  obj[1] = temp.getPassword(); 
            
            result[count ++] = obj; 
        }
        System.out.println(result);
        for(Object[] a:result)
        {
            for(Object b: a)
                System.out.println(b);
        }}
        
        static List<LoginCatagoryBean> getdata() throws IOException {
            Properties properties = new Properties();
            FileInputStream inStream = new FileInputStream("./resources/sql.properties");
            properties.load(inStream);
            String sql = properties.getProperty("get.logins"); 
            
            GetConnection gc  = new GetConnection(); 
            List<LoginCatagoryBean> list = null;
            try {
                gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
                list = new ArrayList<LoginCatagoryBean>(); 
                
                gc.rs1 = gc.ps1.executeQuery(); 
                
                while(gc.rs1.next()) {
                
                	LoginCatagoryBean temp = new LoginCatagoryBean(); 
                    temp.setcatagoryName(gc.rs1.getString(1));
                    //temp.setPassword(gc.rs1.getString(2));
                    list.add(temp); 
                    
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
            return list;
        }
        }
