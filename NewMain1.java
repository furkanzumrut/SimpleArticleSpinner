
import com.sun.xml.internal.ws.util.StringUtils;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author furkanzumrut
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String yazi = "Demokratik hak ve hürriyetler kullanılırken esas olan başkalarının temel hak ve hürriyetlerinin gözetilmesidir.";
        String[] sayilar = yazi.split(" ");
        String esanlam[][] = new String[10][10];
        
        esanlam[0][0] = "özgürlük";
        esanlam[1][0] = "hürriyet";
        
        
        for(int i=0;i<sayilar.length;i++){
            //System.out.println(sayilar[i]);
            for(int j=0;j<1;j++){
            if(kiyasla.getLevenshteinDistance(sayilar[i], esanlam[0][j])<4){
            sayilar[i] = esanlam[1][j];
            }else if(kiyasla.getLevenshteinDistance(sayilar[i], esanlam[1][j])<4)
            {sayilar[i] = esanlam[0][j];}    
            }
            
        }
        
        for(int i=1;i<sayilar.length;i++){
            System.out.print(sayilar[i]+" ");
            
        }
        
        
        
    }
}
