package application;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Lista {

    public static void main(String args[]) throws IOException
    {

        class Minha {

            String ip;
            int cont;

            public Minha(String ip, Integer c) {
                this.ip = ip;
                this.cont = c;
            }
            
            public void setCont() {
            	this.cont +=1;
            }
            
        }
        FileInputStream stream = new FileInputStream("C:\\Users\\FRANKBRUNO\\Documents\\UFPA\\Estrutura de Dados\\lista 7\\access.log");
        InputStreamReader reader = new InputStreamReader(stream);
        BufferedReader br = new BufferedReader(reader);
        String ipLog;// Ler linha por linha
        String[] ipL;
        
        // Creating an empty LinkedList
        LinkedList<Minha> lista = new LinkedList<Minha>();

        try {
        	while((ipLog = br.readLine()) != null) {
        		ipL = ipLog.split(" ");
            	boolean contem = false;
            	
            	// Setting the ListIterator at a specified position
                ListIterator<Minha> list_Iter = lista.listIterator(); 
                
                // Verifica se ip existe
                while(list_Iter.hasNext()){
                    Minha i = list_Iter.next();
                    if (i.ip.equals(ipL[0])) {
                    	i.setCont();			//Soma 1 ao contador do ip
                    	contem = true;
                    	break;					//finaliza o loop
                    }
                }
                if(!contem) { 			//Se o ip nao existe adiciona a lista 
                    lista.add(new Minha(ipL[0],0)); 
                }
            }
        }catch(Exception e){
        	System.out.println("Leitura de Log finalizada");
        }
        System.out.println("Leitura de Log finalizada");
        FileInputStream streamIps = new FileInputStream("C:\\Users\\FRANKBRUNO\\Documents\\UFPA\\Estrutura de Dados\\lista 7\\ips.txt");
        InputStreamReader readerIps = new InputStreamReader(streamIps);
        BufferedReader brIps = new BufferedReader(readerIps);
        String ipConsulta;
        
        try {
        	while((ipConsulta = brIps.readLine()) != null) {
        		ListIterator<Minha> list_It = lista.listIterator();
        		 while(list_It.hasNext()){
        			 Minha a = list_It.next();
             		if (a.ip.equals(ipConsulta)) {
             			System.out.println(a.ip+": "+ a.cont);
             			}
             		}
        		 }
        }catch(Exception e) {
        	System.out.println("erro");        	
        }
          
    }
}