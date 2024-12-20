package QL_SuaChua;

import java.text.SimpleDateFormat;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author ASUS
 */
public class TableSuaChua extends AbstractTableModel {
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    
    private String Name[] = {"Mã sửa chữa","CB bảo trì","Đơn vị","Tài sản SC","Nội dung","CB kiểm tra","Ngày sửa chữa","Trạng thái"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<SuaChua> dsTT = new ArrayList<>();
    public TableSuaChua(ArrayList<SuaChua> tt) {
        dsTT = tt;
    }
    @Override
    public int getRowCount() {
        return dsTT.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsTT.get(rowIndex).getMaSC();
            
            case 1: return dsTT.get(rowIndex).getNguoiBT();
            
            case 2: return dsTT.get(rowIndex).getDvTinh();
             
            case 3: return dsTT.get(rowIndex).getMaTS();
            
            case 4: return dsTT.get(rowIndex).getNoiDung();
            
            case 5: return dsTT.get(rowIndex).getCBKiemTra();
            
            case 6: return dsTT.get(rowIndex).getNgaySC();
            
            case 7: return dsTT.get(rowIndex).getTrangThai();
            
            case 8: return dsTT.get(rowIndex).getyKien();   
            
            default : return null;
        }
    }
    
    public Class getColumnClass(int columnIndex){
        return classess[columnIndex];
    }
    
    public String getColumnName(int column){
        return Name[column];
    }
}

