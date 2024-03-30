package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args){
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Resultast="+metier.calcul());
    }
}
