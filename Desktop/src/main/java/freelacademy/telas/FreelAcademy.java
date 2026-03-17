package freelacademy.telas;

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
