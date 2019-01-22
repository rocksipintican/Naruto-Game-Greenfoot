import greenfoot.*;
import java.util.List; 

/**
 * Write a description of class MyWorld here.
 * @author (Pintican Roxana) @version (a version number or a date)
 */
public class Konoha extends World
{

    //sunet fundal:
    GreenfootSound myMusic= new  GreenfootSound("naruto.mp3");
    Scor scor= new Scor();
    public Konoha()
    {
        super(1024, 512, 1);
        /* Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
    }
public void started()
    {
        if (getObjects(null).isEmpty())
        {  
         
         setBackground(new GreenfootImage("background.jpg"));
            prepare();
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Naruto naruto = new Naruto();
        addObject(naruto,26,26);
        naruto.setLocation(28,28);
        zid zid = new zid();
        addObject(zid,43,107);
        zid.setLocation(23,90);
        zid zid2 = new zid();
        addObject(zid2,82,93);
        zid2.setLocation(71,91);
        zid zid3 = new zid();
        addObject(zid3,75,145);
        zid3.setLocation(70,138);
        zid zid4 = new zid();
        addObject(zid4,29,326);
        zid4.setLocation(24,299);
        zid zid5 = new zid();
        addObject(zid5,901,187);
        zid5.setLocation(70,299);
        zid2.setLocation(67,90);
        zid2.setLocation(70,90);
        zid3.setLocation(68,134);
        zid zid6 = new zid();
        addObject(zid6,751,181);
        zid6.setLocation(115,134);
        zid6.setLocation(114,133);
        zid zid7 = new zid();
        addObject(zid7,231,21);
        zid zid8 = new zid();
        addObject(zid8,288,29);
        zid8.setLocation(279,21);
        zid zid9 = new zid();
        addObject(zid9,260,74);
        zid9.setLocation(257,67);
        zid zid10 = new zid();
        addObject(zid10,120,304);
        zid10.setLocation(116,298);
        zid zid11 = new zid();
        addObject(zid11,119,259);
        zid11.setLocation(115,251);
        zid zid12 = new zid();
        addObject(zid12,134,357);
        zid12.setLocation(117,345);
        zid zid13 = new zid();
        addObject(zid13,171,304);
        zid13.setLocation(163,297);
        zid zid14 = new zid();
        addObject(zid14,173,351);
        zid14.setLocation(162,342);
        zid14.setLocation(162,342);
        zid zid15 = new zid();
        addObject(zid15,263,123);
        zid15.setLocation(257,115);
        zid zid16 = new zid();
        addObject(zid16,167,398);
        zid16.setLocation(162,389);
        zid zid17 = new zid();
        addObject(zid17,217,397);
        zid17.setLocation(210,392);
        zid zid18 = new zid();
        addObject(zid18,315,127);
        zid18.setLocation(306,120);
        zid18.setLocation(305,115);
        zid zid19 = new zid();
        addObject(zid19,361,124);
        zid19.setLocation(353,117);
        zid zid20 = new zid();
        addObject(zid20,334,169);
        zid20.setLocation(331,161);
        zid zid21 = new zid();
        addObject(zid21,343,231);
        zid21.setLocation(330,206);
        zid zid22 = new zid();
        addObject(zid22,339,261);
        zid22.setLocation(329,250);
        zid zid23 = new zid();
        addObject(zid23,382,260);
        zid23.setLocation(376,249);
        zid zid24 = new zid();
        addObject(zid24,309,492);
        zid zid25 = new zid();
        addObject(zid25,377,494);
        zid25.setLocation(354,491);
        zid zid26 = new zid();
        addObject(zid26,339,451);
        zid26.setLocation(332,445);
        zid zid27 = new zid();
        addObject(zid27,605,310);
        zid zid28 = new zid();
        addObject(zid28,948,164);
        zid28.setLocation(605,263);
        zid zid29 = new zid();
        addObject(zid29,832,189);
        zid29.setLocation(651,292);
        zid zid30 = new zid();
        addObject(zid30,563,291);
        zid30.setLocation(559,288);
        zid30.setLocation(559,293);
        zid zid31 = new zid();
        addObject(zid31,566,248);
        zid31.setLocation(604,219);
        zid zid32 = new zid();
        addObject(zid32,409,123);
        zid32.setLocation(402,117);
        zid zid33 = new zid();
        addObject(zid33,606,22);
        zid33.setLocation(598,39);
        zid33.setLocation(600,27);
        zid33.setLocation(600,24);
        zid zid34 = new zid();
        addObject(zid34,612,83);
        zid34.setLocation(601,69);
        zid zid35 = new zid();
        addObject(zid35,412,499);
        zid35.setLocation(333,394);
        zid35.setLocation(333,395);
        zid35.setLocation(333,400);
        zid35.setLocation(333,398);
        zid zid36 = new zid();
        addObject(zid36,947,263);
        zid36.setLocation(381,397);
        zid zid37 = new zid();
        addObject(zid37,486,391);
        zid26.setLocation(338,447);
        zid26.setLocation(351,442);
        zid26.setLocation(354,443);
        zid37.setLocation(430,399);
        zid zid38 = new zid();
        addObject(zid38,485,405);
        zid38.setLocation(479,400);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(309,492);
        zid24.setLocation(454,354);
        zid24.setLocation(452,354);
        zid37.setLocation(427,398);
        zid38.setLocation(473,400);
        zid24.setLocation(452,354);
        addObject(naruto,904,187);
        removeObject(naruto);
        zid zid39 = new zid();
        addObject(zid39,556,74);
        zid39.setLocation(552,69);
        zid zid40 = new zid();
        addObject(zid40,658,346);
        zid40.setLocation(652,338);
        zid zid41 = new zid();
        addObject(zid41,1007,32);
        zid41.setLocation(999,25);
        zid zid42 = new zid();
        addObject(zid42,954,200);
        zid42.setLocation(951,25);
        zid zid43 = new zid();
        addObject(zid43,911,28);
        zid43.setLocation(901,24);
        zid43.setLocation(905,24);
        zid42.setLocation(953,23);
        zid43.setLocation(906,24);
        zid zid44 = new zid();
        addObject(zid44,920,79);
        zid44.setLocation(905,71);
        zid zid45 = new zid();
        addObject(zid45,911,134);
        zid45.setLocation(907,117);
        zid zid46 = new zid();
        addObject(zid46,914,171);
        zid46.setLocation(914,172);
        zid46.setLocation(909,162);
        zid zid47 = new zid();
        addObject(zid47,1009,290);
        zid zid48 = new zid();
        addObject(zid48,889,317);
        zid47.setLocation(1001,293);
        zid48.setLocation(954,293);
        zid zid49 = new zid();
        addObject(zid49,842,356);
        zid49.setLocation(744,489);
        zid zid50 = new zid();
        addObject(zid50,798,259);
        zid50.setLocation(791,488);
        zid50.setLocation(791,488);
        zid zid51 = new zid();
        addObject(zid51,705,299);
        zid51.setLocation(698,293);
        zid zid52 = new zid();
        addObject(zid52,755,297);
        zid52.setLocation(743,292);
        zid zid53 = new zid();
        addObject(zid53,862,119);
        zid53.setLocation(859,118);
        zid zid54 = new zid();
        addObject(zid54,811,122);
        zid54.setLocation(811,117);
        zid zid55 = new zid();
        addObject(zid55,657,78);
        zid55.setLocation(648,387);
        zid55.setLocation(650,384);
        zid zid56 = new zid();
        addObject(zid56,910,300);
        zid56.setLocation(906,295);
        zid zid57 = new zid();
        addObject(zid57,916,352);
        zid57.setLocation(907,341);
        zid zid58 = new zid();
        addObject(zid58,1006,500);
        zid58.setLocation(997,490);
        zid zid59 = new zid();
        addObject(zid59,954,496);
        zid59.setLocation(949,490);
        zid49.setLocation(838,489);
        zid zid60 = new zid();
        addObject(zid60,856,205);
        zid60.setLocation(747,439);
        zid60.setLocation(790,441);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(838,489);
        zid49.setLocation(574,499);

        Naruto naruto2 = new Naruto();
        addObject(naruto2,29,34);
        naruto2.setLocation(30,26);
        naruto2.setLocation(29,29);
        inamic inamic = new inamic();
        addObject(inamic,884,466);
        inamic.setLocation(870,460);

        Ramen[] ramen= new Ramen[16];
        for(int i=0; i<ramen.length;i++){
            ramen[i]=new Ramen();
            int ramX=Greenfoot.getRandomNumber(getWidth());
            int ramY=Greenfoot.getRandomNumber(getHeight());
            addObject( ramen[i], ramX,ramY);
        }

        // Scor scor = new Scor();
        addObject(scor,18,500);
        scor.setLocation(34,478);
        inamic inamic2 = new inamic();
        addObject(inamic2,169,470);
        GameOver gameover = new GameOver();
        addObject(gameover,496,171);
        GameOver gameover2 = new GameOver();
        addObject(gameover2,496,180);
    }

    public void act(){
        myMusic.play();
        if(getObjects(Ramen.class).isEmpty()){
            // ScoateZid();
            List<Actor> actors = getObjects(null);
            removeObjects(getObjects(null));
            setBackground(new GreenfootImage("goodJob.jpg"));
            Greenfoot.stop();

        }

    }

    public Scor getScore(){
        return scor;

    }
 /*    
    public void ScozteZid(){ 
    Actor zid = getOneIntersectingObject(zid.class);
    if (zid != null) {
    getWorld().removeObject(zid);
    }
    }*/
}

