/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Worapat
 */
public class Car_object {
     private String id,car_type,all_eastern,nakhon_nayok,prachin_buri,chachoengsao,chon_buri,rayong,chanthaburi,trat,sa_kaeo;

    public Car_object(String id, String car_type, String all_eastern, String nakhon_nayok, String prachin_buri, String chachoengsao, String chon_buri, String rayong, String chanthaburi, String trat, String sa_kaeo) {
        this.id = id;
        this.car_type = car_type;
        this.all_eastern = all_eastern;
        this.nakhon_nayok = nakhon_nayok;
        this.prachin_buri = prachin_buri;
        this.chachoengsao = chachoengsao;
        this.chon_buri = chon_buri;
        this.rayong = rayong;
        this.chanthaburi = chanthaburi;
        this.trat = trat;
        this.sa_kaeo = sa_kaeo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public String getAll_eastern() {
        return all_eastern;
    }

    public void setAll_eastern(String all_eastern) {
        this.all_eastern = all_eastern;
    }

    public String getNakhon_nayok() {
        return nakhon_nayok;
    }

    public void setNakhon_nayok(String nakhon_nayok) {
        this.nakhon_nayok = nakhon_nayok;
    }

    public String getPrachin_buri() {
        return prachin_buri;
    }

    public void setPrachin_buri(String prachin_buri) {
        this.prachin_buri = prachin_buri;
    }

    public String getChachoengsao() {
        return chachoengsao;
    }

    public void setChachoengsao(String chachoengsao) {
        this.chachoengsao = chachoengsao;
    }

    public String getChon_buri() {
        return chon_buri;
    }

    public void setChon_buri(String chon_buri) {
        this.chon_buri = chon_buri;
    }

    public String getRayong() {
        return rayong;
    }

    public void setRayong(String rayong) {
        this.rayong = rayong;
    }

    public String getChanthaburi() {
        return chanthaburi;
    }

    public void setChanthaburi(String chanthaburi) {
        this.chanthaburi = chanthaburi;
    }

    public String getTrat() {
        return trat;
    }

    public void setTrat(String trat) {
        this.trat = trat;
    }

    public String getSa_kaeo() {
        return sa_kaeo;
    }

    public void setSa_kaeo(String sa_kaeo) {
        this.sa_kaeo = sa_kaeo;
    }
     
}
