/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import org.json.JSONObject;

public class Apicontroller {
   public ArrayList<Covid_object> Getapi1() throws Exception{
       ArrayList<Covid_object> list = new ArrayList<>();
        try { 
            URL url = new URL("https://opend.data.go.th/get-ckan/datastore_search?resource_id=be19a8ad-ab48-4081-b04a-8035b5b2b8d6&");
            HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
            httpURLConnection.setRequestMethod("GET");

             //adding header
            httpURLConnection.setRequestProperty("api-key","Your Token");

            String line="";
            InputStreamReader inputStreamReader=new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuilder response=new StringBuilder();
            while ((line=bufferedReader.readLine())!=null){
                response.append(line);
            }
            bufferedReader.close();
          
            JSONObject jsonObject=new JSONObject(response.toString());
            for (int i=0;i<jsonObject.getJSONObject("result").getJSONArray("records").length();i++){
                String id_temp =jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("_id").toString();
                String Announce_date_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("announce_date").toString();
                String Notified_date_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("Notified date").toString(); 
                String Sex_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("sex").toString(); 
                String Age_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("age").toString(); 
                String Nationality_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("nationality").toString(); 
                String Province_of_isolation_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("province_of_isolation").toString(); 
                String Risk_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("risk").toString();
                String Province_of_onset_temp  = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("province_of_onset").toString();
                String District_of_onset_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("district_of_onset").toString(); 
                
                Covid_object data_temp=new Covid_object( id_temp,  Announce_date_temp,Notified_date_temp,Sex_temp,Age_temp, Nationality_temp,
                        Province_of_isolation_temp, Risk_temp,Province_of_onset_temp, District_of_onset_temp);
               
                list.add(data_temp);
            }
                
        }
        catch (Exception e){
            System.out.println("Error in Making Get Request");
        }
        return list;
    }
   
   public ArrayList<Car_object> Getapi2() throws Exception{
       ArrayList<Car_object> list = new ArrayList<>();
        try { 
            URL url = new URL("https://opend.data.go.th/get-ckan/datastore_search?resource_id=1a9a81ad-50ff-4694-a905-1bff352f821e&");
            HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
            httpURLConnection.setRequestMethod("GET");

             //adding header
            httpURLConnection.setRequestProperty("api-key","Your Token");

            String line="";
            InputStreamReader inputStreamReader=new InputStreamReader(httpURLConnection.getInputStream());
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuilder response=new StringBuilder();
            while ((line=bufferedReader.readLine())!=null){
                response.append(line);
            }
            bufferedReader.close();
          
            JSONObject jsonObject=new JSONObject(response.toString());
            for (int i=0;i<jsonObject.getJSONObject("result").getJSONArray("records").length();i++){
                String id_temp =jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("_id").toString();
                String car_type_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("ประเภทรถ").toString();
                String all_eastern_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("รวมภาคตะวันออก").toString(); 
                 String nakhon_nayok_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("นครนายก").toString(); 
                String prachin_buri_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("ปราจีนบุรี").toString(); 
                String chachoengsao_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("ฉะเชิงเทรา").toString(); 
                String chon_buri_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("ชลบุรี").toString(); 
                String rayong_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("ระยอง").toString();
                String chanthaburi_temp  = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("จันทบุรี").toString();
                String trat_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("ตราด").toString(); 
                String sa_kaeo_temp = jsonObject.getJSONObject("result").getJSONArray("records").optJSONObject(i).get("สระแก้ว").toString(); 
                
                Car_object data_temp =new Car_object(id_temp , car_type_temp ,all_eastern_temp  ,nakhon_nayok_temp  ,prachin_buri_temp  ,chachoengsao_temp 
                 , chon_buri_temp , rayong_temp , chanthaburi_temp , trat_temp ,sa_kaeo_temp );
               
                list.add(data_temp);
            }
                
        }
        catch (Exception e){
            System.out.println("Error in Making Get Request");
        }
        return list;
    }
   
}
