package Fecha;

/* Fecha */
public class Fecha {
    
    /* Atributos */
    private int day; 
    private int month; 
    private int year; 

    /* Constructores */

    /* Por defecto sin parametros */
    public Fecha(){
        day = 1;
        month = 1; 
        year = 1900; 
    }

    /* Constructor con parametros */
    public Fecha(int dd, int mm, int yy){
        day = dd; 
        month = mm; 
        year = yy; 
        valida();
    }

    /* Metodos */

    public boolean bisiesto(){
        return (year%4==0) && (year%100!=0) || (year%400==0); 
    }

    public int diasMes(){
        switch(month){
            case 1,3,5,7,8,10,12 ->{
                return 31; 
            }
            case 2 ->{
                if(bisiesto()){
                    return 29;
                } else {
                    return 28; 
                }
            }
            case 4,6,9,11 ->{
                return 30; 
            }
        }
    }

    private void valida(){
        if(day<1 || day>31){
            if(month<1 || month>12){
                if(year<1900 || year>2050){ 
                    year = 1900; 
                }
            month = 1; 
            }
        day = 1; 
        }
    }
}
