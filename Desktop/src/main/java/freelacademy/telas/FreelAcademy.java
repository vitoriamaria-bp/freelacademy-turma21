package freelacademy.telas;

/**
 * Descrição da classe
 * Classe inicial, configurando qual a primeira tela sera iniciada
 * 
 * @author Marcos Tavares
 */

public class FreelAcademy {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new TelaHome().setVisible(true);
            }
        });        
               
    }
}
