package QL_DieuChuyen;

import QL_DanhSachTaiSan.TaiSan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vanqu
 */
public class TableChonTS extends AbstractTableModel{
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    
    private String Name[] = {"Mã TS","Tên TS","Danh mục"};
    
    private Class classess[]  = {String.class,String.class,String.class};
    
    ArrayList<TaiSan> dsTS = new ArrayList<>();
    public TableChonTS(ArrayList<TaiSan> ts) {
        dsTS = ts;
    }
    @Override
    public int getRowCount() {
        return dsTS.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsTS.get(rowIndex).getMaTS();
            
            case 1: return dsTS.get(rowIndex).getTenTS();
            
            case 2: return dsTS.get(rowIndex).getDanhMuc();
             
//            case 3: return dsTS.get(rowIndex).getSoHuu();
//            
//            case 4: return dsTS.get(rowIndex).getKhoaQl();                        
            
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
