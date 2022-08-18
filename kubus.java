/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kubusinheri;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class kubus extends persegi {
    public double Tinggi ;
    public void setTinggi(double nilaiBaru){
        this.Tinggi=nilaiBaru;
    }
    public double volumekubus (){
        return luaspersegi()*Tinggi;
    }
    public double luaspermukaankubus (){
        return luaspersegi()* 6;
    }
}
