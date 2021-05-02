/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Worapat
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import view.*;
import model.*;
public class Maincontroller implements ActionListener{
    private Apicontroller model;
    private Main_view mainview;
    private Api1_view api1_view;
    private Api2_view api2_view;
    
     public Maincontroller(Apicontroller model, Main_view mainview, Api1_view api1_view, Api2_view api2_view) {
        this.model = model;
        this.mainview = mainview;
        this.api1_view = api1_view;
        this.api2_view = api2_view;
    }
     public Main_view getmainview(){
         return mainview;
     }
     public Api1_view getapi1view(){
         return api1_view;
     }
     public Api2_view getapi2view(){
         return api2_view;
     }
     public void Useapi1()throws Exception{
         ArrayList<Covid_object> covidList = model.Getapi1();
         api1_view.setClearTable();
         api1_view.setTable1(covidList);
     }
      public void Useapi2()throws Exception{
         ArrayList<Car_object>carList = model.Getapi2();
         api2_view.setClearTable();
         api2_view.setTable1(carList);
     }
     
      public void actionPerformed(ActionEvent e) {
       String command=e.getActionCommand();
          if(command.equals("Test API 1")){
              try{
                            Useapi1();
            }catch(Exception e1){} 
        }else if(command.equals("Test API 2")){
            try{         
                            Useapi2();
            }catch(Exception e1){} 
        }
    }
}
