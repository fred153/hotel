package control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.*;
import vista.*;
public class Control implements ActionListener{
    Modelo model;
    Vista1 vis;
    Vista2 vis1;
    Vista3 vis2;
    Listas listV;
    public Control() {
        model=new Modelo();
        this.vis = new Vista1();
        this.vis1 = new Vista2();
        this.vis2 = new Vista3();
        this.listV = new Listas();
        vis.getBtnAsignar().addActionListener(this);
        vis.getBtnHabi().addActionListener(this);
        vis.getBtnRetirar().addActionListener(this);
        vis1.getBtnComida().addActionListener(this);
        vis1.getBtnLimpieza().addActionListener(this);
        vis1.getBtnRenta().addActionListener(this);
        vis2.getBtnAceptar().addActionListener(this);
        vis.setVisible(true);
    }
    public void setVisible(boolean bln){
        this.vis.pack();
        this.vis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.vis.setLocationRelativeTo(null);
        vis.setVisible(bln);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
                vis1.setVisible(false);
        vis2.setVisible(false);
     if(this.vis.getBtnAsignar()==e.getSource()){
         if(!(this.vis.getTxtNombre().getText().equals(" "))
          ||!(this.vis.getTxtIdenti().getText().equals(" "))
          ||!(this.vis.getTxtTel().getText().equals(" "))){
         if(this.model.agregarC(this.vis.getTxtNombre().getText(), this.vis.getTxtIdenti().getText(), this.vis.getTxtTel().getText())!=null){
         model.agregarC(this.vis.getTxtNombre().getText(), this.vis.getTxtIdenti().getText(), this.vis.getTxtTel().getText());
         this.vis.getLblNhab1().setText(model.getZ()+"");
         this.vis.getTxtNombre().setText(null);
         this.vis.getTxtIdenti().setText(null);
         this.vis.getTxtTel().setText(null);
         this.model=new Modelo();
         }
         else{
            this.vis2 = new Vista3();
             cerrar3(vis);
             this.vis2.getLblMensaje().setText("Datos no validos, por favor ingrese los datos nuevamente");
             cerrar(vis2);
         }
         }
     }
     if(this.vis.getBtnHabi()==e.getSource()){
         if(!(this.vis.getTxtNhabi().getText().equals(" "))){
             Cliente cli=new Cliente();
             cli=this.model.encontrarC(this.vis.getTxtNhabi().getText());
             vis1.getLblNombre1().setText(cli.getNombre());
         }
     }
     if(this.vis.getBtnRetirar()==e.getSource()){
     if(!(this.vis.getTxtReH().getText().equals(" "))){
         this.model.retirarC(this.vis.getTxtReH().getText());
     }
     }
     if(this.vis2.getBtnAceptar()==e.getSource()){
         cerrar(vis2);
     }
    }
    public void seleccionH(){
        
    }
    public void cerrar(Vista3 vis2){
    this.vis2.dispose();
    this.vis.setVisible(true);
    }
    public void cerrar1(Vista1 vis){
    this.vis.dispose();
    this.vis1.setVisible(true);
    }
    public void cerrar2(Vista2 vis1){
    this.vis1.dispose();
    this.vis.setVisible(true);
    }
    public void cerrar3(Vista1 vis){
    this.vis.dispose();
    this.vis2.setVisible(true);
    }
    public void cerrar4(Vista2 vis1){
    this.vis1.dispose();
    this.vis2.setVisible(true);
    }
}