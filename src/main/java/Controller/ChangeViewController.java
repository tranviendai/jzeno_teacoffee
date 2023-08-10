package Controller;

import Bean.MenuBean;
import View.HomePanel;
import View.BillPanel;
import View.ProductPanel;
import View.StatisticPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChangeViewController {
    private JPanel root;
    private String itemSelected = "";
    
    private List<MenuBean> listItem = null;
    
    public ChangeViewController(JPanel jpn){
    this.root = jpn;
    }
    
    public void setView(JPanel jpnItem, JLabel jlbItem){
        itemSelected = "HomePanel";
        jpnItem.setBackground(new Color(0,153,255));
        jlbItem.setBackground(new Color(0,153,255));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new HomePanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<MenuBean> listItem){
        this.listItem = listItem;
        for(MenuBean item : listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
        }
        
    }
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String select;
        
        private JPanel jpnItem;
        private JLabel jlbItem;
        public LabelEvent(String select, JPanel jpnItem, JLabel jlbItem) {
            this.select = select;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch(select){
                case "Home":
                    node = new HomePanel();
                    break;
                case "Menu":
                    node = new BillPanel();
                    break;
                case "Product":
                    node = new ProductPanel();               
                    break;
                case "Statistic":
                    node = new StatisticPanel();
                    break;
                default:
                    node = new HomePanel();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(select);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            itemSelected = select;
            jpnItem .setBackground(new Color(0,153,255));
            jlbItem .setBackground(new Color(0,153,255));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem .setBackground(new Color(0,153,255));
            jlbItem .setBackground(new Color(0,153,255));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!itemSelected.equalsIgnoreCase(select)){
                jpnItem .setBackground(Color.white);
            jlbItem .setBackground(Color.white);
            }
        }
        private void setChangeBackground(String select){
            for(MenuBean item : listItem){
                 if(item.getKind().equalsIgnoreCase(select)){
                     item.getJlb().setBackground(new Color(0,153,255));
                     item.getJpn().setBackground(new Color(0,153,255));
                     item.getJlb().setForeground(Color.white);
                 }else{
                      item.getJlb().setBackground(Color.white);
                     item.getJpn().setBackground(Color.white);
                     item.getJlb().setForeground(Color.black);
                 }
            }
        }
        
        
    }
}
