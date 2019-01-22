import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; 
//culoarea la scor
/**
 * Write a description of class Scor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scor extends Actor
{
    int scorul=0;
    public void act() 
    {
       GreenfootImage img =new GreenfootImage("Scor:"+ scorul, 24 , Color.ORANGE ,Color.BLACK);
       setImage(img);
       System.out.println("SCOR="+scorul);
    }   
    public void AdaugaScor()  {
        scorul++;    
    } 
}