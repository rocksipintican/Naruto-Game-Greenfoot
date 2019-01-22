import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inamic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inamic extends Actor
{         private int timer = 0, ydirection = -1, xdirection = 1;
 
  
    public void act() 
    {
         {
    if (getX() < getWorld().getWidth()/2) xdirection=1;
    if (getX() > getWorld().getWidth()-10) xdirection=-1;
     
    timer++;
    if (timer > 50 && Greenfoot.getRandomNumber(20)==0 || ydirection==-1 && getY() < 100 || xdirection==1 && getY()>getWorld().getHeight()-10)
    {
        timer=0;
        ydirection *= -1;
    }
    setLocation(getX()+xdirection,getY()+ydirection);
}

}
}