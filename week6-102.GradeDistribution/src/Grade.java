/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author traanh
 */
public class Grade {
    private int point; 
    public Grade(int point){
        this.point = point; 
}
    public void countGrade(int point){
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0; 
        if(point >0 && point < 30) {
             c0++;
        } else if (point < 35) {
             c1++;
        } else if (point < 40) {
             c2++;
        } else if (point < 45) {
             c3++;
        } else if (point < 50) {
             c4++;
        } else if (point < 61) {
             c5++; 
        }
    }
}
