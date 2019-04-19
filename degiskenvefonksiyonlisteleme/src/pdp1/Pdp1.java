/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdp1;

/**  
 *   
 * <p>  
 *  Istenen alt degiskenler,uye fonksiyonlarin listelenmesi   
 * </p>  */
import java.lang.reflect.*;//reflection (yansıma) kutuphanesi
import java.util.ArrayList;

public class Pdp1 {

    /**
     * @param args the command line arguments
     */
      
    public static void main(String[] args) {
        // TODO code application logic here
        int sayac=0;
        int sayac2=0;
        Class<Sayi> sayi = Sayi.class;//sayi.java class ini cagiriyoruz
        String className = sayi.getSimpleName();//sayi.java class ismini alir
        Method[] methods = sayi.getDeclaredMethods(); //metodlar icin
        Constructor[] cons = sayi.getDeclaredConstructors();//yapicilar icin
        Field[] field = sayi.getDeclaredFields();//degiskenler icin
     
    
             ArrayList<String> methodList = new ArrayList<>(); //alinanlar listeye atanmasi icin liste olusturulur
             ArrayList<String> methodList2 = new ArrayList<>();
             for(int i =0 ; i<field.length ; i++){ //degiskennler icinde donmesi icin
                    methodList.add(field[i].getName()+"-"+(field[i].getType())); //alt degiskenlerin ismi ve tipi alinir
                   
                    sayac++;//sayisinin bulunmasi icin sayc attirilir
                    
                }
              
              for(int i =0 ; i<cons.length ; i++){ //yapicilar arasında donulur
                  //ikinci olusturulan listeye adi,donus turu(yapicilarda donus turu yoktur.) ve parametre sayisi alinir.
                   methodList2.add(cons[i].getName()+"\nDonus Turu:Yok"+"\nAldigi parametre:"+cons[i].getParameterCount()+"\n");
                
              sayac2++; //uye fonksiyonlar icin sayac attirilir.
                    
                }
             
             for(int i=0;i<methods.length;i++){//metodlar arasında donulur
                 //ikinci olusturulan listeye adi,donus turu ve parametre sayisi alinir.
                 methodList2.add(methods[i].getName()+"\nDonus Turu:"+(methods[i].getReturnType()+"\nAldigi parametre:"+methods[i].getParameterCount())+"\n");
                 
                 sayac2++;//uye fonksiyonlar icin sayac attirilir.
                 
             }

             //Ekran ciktilari istenen sirayla yazdirilir
                System.out.println("Sinif Adi:"+className);
                System.out.println("Alt eleman sayisi: "+sayac+"adet");
          
                 for(String name: methodList){
                    System.out.println(name+" ");
                }
             System.out.println("Uye Fonksiyonlar: "+sayac2+"adet");
                 for(String name: methodList2){
                    System.out.println(name+" ");
                    System.out.println("--------------------");
                }
    }
    
}
