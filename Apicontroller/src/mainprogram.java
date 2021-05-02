/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Worapat
 */
import controller.*;
import javax.swing.JFrame;
import model.*;
import view.*;
public class mainprogram {
      public static void main(String []args) throws Exception{
        Apicontroller model=new Apicontroller();
        Main_view mainview =new Main_view();
        Api1_view api1view =new Api1_view();
        Api2_view api2view =new Api2_view();
        Maincontroller controller=new Maincontroller(model,mainview,api1view,api2view);
        mainview.registerListenerjPanel(controller);
        api1view.registerListenerjPanel(controller);
        api2view.registerListenerjPanel(controller);
        mainview.setVisible(true);
        mainview.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
    
    
}
