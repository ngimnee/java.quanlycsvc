/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_MuaSam;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrator
 */
public class TableThietBi extends AbstractTableModel{
    
    private final String Name[] = {"STT","Tên tài sản","SL kho còn","SL đề nghị","Đơn vị tính","Danh mục tài sản"};
    
    private final Class classess[]  = {String.class,String.class,int.class,int.class,String.class,String.class};
    
    ArrayList<ThietBi> dsTB = new ArrayList<>();
    public TableThietBi(ArrayList<ThietBi> tb){
        dsTB = tb;
    }
    
    @Override
    public int getRowCount(){
        return dsTB.size();
    }
    
    @Override
    public int getColumnCount(){
        return Name.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex){
        return switch (columnIndex) {
            case 0 -> rowIndex + 1;
            case 1 -> dsTB.get(rowIndex).getTenTB();
            case 2 -> dsTB.get(rowIndex).getsLKho();
            case 3 -> dsTB.get(rowIndex).getsLDeNghi();
            case 4 -> dsTB.get(rowIndex).getDvTinh();
            case 5 -> dsTB.get(rowIndex).getDanhMuc();
            default -> null;
        };
    }
    
    @Override
    public Class getColumnClass(int columnIndex){
        return classess[columnIndex];
    }
    
    @Override
    public String getColumnName(int column){
        return Name[column];
    }
}
