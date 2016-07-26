
package taxiservice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import taxiservice.Location;


public class UI extends javax.swing.JFrame {

    private int length;
    private int breadth;
    private List<Car> list;
    
    public UI() {
        initComponents();
        length=20;
        breadth=20;
        list=new ArrayList<Car>();
    }

    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        int x=evt.getX();
        int y=evt.getY();
        System.out.println(x+" "+y);
        repaint();
    }//GEN-LAST:event_formMouseClicked

    
    public static void main(String args[]) {
        

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UI ui=new UI();
                List<Car> list=ui.getList();
                list.add(new Car(new Location(20,20),true,"1"));
                list.add(new Car(new Location(100,100),false,"2"));
                list.add(new Car(new Location(80,40),true,"3"));
                list.add(new Car(new Location(70,70),false,"4"));
                ui.setVisible(true);
                
            }
        });
        
        
        
        
        
        
    }
    
    @Override
    public void paint(Graphics g){
       // Graphics2D g2d=(Graphics2D) g;
       for(Car c:list)
       {          
           g.setColor(Color.BLACK);
           g.drawString(c.getCarID(),c.getLocation().getX(),c.getLocation().getY()-5);
           if(c.isBusy())
            g.setColor(Color.RED);
           else
               g.setColor(Color.GREEN);
           g.fillRect(c.getLocation().getX(),c.getLocation().getY(),length,breadth);
           
       }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
