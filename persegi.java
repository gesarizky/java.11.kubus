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
public class persegi {
    public double Sisi ;
    public void setSisi(double nilaiBaru){
        this.Sisi=nilaiBaru;
    }
    public double luaspersegi(){
        return (Sisi * Sisi);
    }
    public double kelilingpersegi(){
        return (4 * Sisi);
    }
}
