import greenfoot.*;
import java.util.List;

/**
 * Write a description of class Naruto here.
 * @author (your name) @version (a version number or a date)
 */
public class Naruto extends Actor
{
    protected int deplasare = 2;
    protected int lungime;
    GreenfootSound myMusic= new  GreenfootSound("naruto.mp3");
    GreenfootSound nar= new  GreenfootSound("Serious motivation.mp3");
    GreenfootSound da= new  GreenfootSound("ju.mp3");

    class Directie{
        public static final int UP=270;
        public static final int DOWN=30;
        public static final int LEFT=60;
        public static final int RIGHT=0;
    }

    /**
     * 
     */
    public Naruto()
    {
        lungime = getImage ( ) . getWidth ( );
    }

    /**
     * Act - do whatever the Naruto wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot . isKeyDown ( "up" )) {
            setRotation ( Directie . UP );
            MutaJucator ( );
        }
        else if (Greenfoot . isKeyDown ( "down" )) {
            setRotation ( Directie . DOWN );
            MutaJucator ( );
        }
        if (Greenfoot . isKeyDown ( "left" )) {
            setRotation ( Directie . LEFT );
            MutaJucator ( );
        }
        if (Greenfoot . isKeyDown ( "right" )) {
            setRotation ( Directie . RIGHT );
            MutaJucator ( );
        }
        AtingeInamic();
        Mananca();

    }
    /**
     * 
     */
    public void MutaJucator()
    {
        int currentX = getX ( );
        int currentY = getY ( );
        int directie = getRotation ( );
        int schimbaX = getSchimbaX ( directie );
        int schimbaY = getSchimbaY ( directie );
        int adjustedChangeX = adjustOffset ( schimbaX );
        int adjustedChangeY = adjustOffset ( schimbaY );
        Actor Zid = getOneObjectAtOffset ( adjustedChangeX , adjustedChangeY , zid . class );
        if (Zid == null) {
            setLocation ( currentX + schimbaX , currentY + schimbaY );
        }
    }

    /**
     * 
     */
    public void Mananca(){
        Actor ramen =getOneIntersectingObject(Ramen.class);
        if(ramen!=null){
            World myWorld=getWorld();
            nar.play();
            myWorld.removeObject(ramen);
            Konoha konoha=(Konoha)myWorld;
            Scor scor=konoha.getScore();
            scor.AdaugaScor() ;
        }

    }

    private int getSchimbaX(int directie)
    {
        if (directie == Directie . RIGHT) {
            return deplasare;
        }
        if (directie == Directie . LEFT) {
            return - deplasare;
        }
        return 0;
    }

    /**
     * 
     */
    private int getSchimbaY(int directie)
    {
        if (directie == Directie . DOWN) {
            return deplasare;
        }
        if (directie == Directie . UP) {
            return - deplasare;
        }
        return 0;
    }

    /**
     * 
     */
    private int adjustOffset(int offset)
    {
        int signOfOffset = ( int ) Math . signum ( offset );
        int distantaDinFata = lungime / 2;
        int adjustAmount = distantaDinFata * signOfOffset;
        return offset + adjustAmount;
    }

    public void AtingeInamic(){

        Actor Inamic=getOneIntersectingObject(inamic.class);
       // World konoha=getOneIntersectingObject(Konoha.class);
        
        if(Inamic!= null){
            World myWorld=getWorld();//
            //ScoateZid();
           // myWorld.setBackground("gameover.jpg");
           GameOver gameover = new GameOver();
           myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
           myWorld.removeObject(null);
             Greenfoot.stop(); 
              
            da.play();
            //if(myWorld != null)
       //    {
         //     myWorld.removeObject(zid);
           // }
          
        }
    }
}
/* public void ScoateTot(){ 
   List<Actor> actors = getObjects(null);
            removeObjects(getObjects(null));
    }*/
  /*   public void ScoateZid(){ 
    Actor zid = getOneIntersectingObject(zid.class);
    if (zid != null) {
    getWorld().removeObject(zid);
    }
} */
