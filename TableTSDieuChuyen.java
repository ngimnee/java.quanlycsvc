package QL_DieuChuyen;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vanqu
 */
public class TableTSDieuChuyen extends AbstractTableModel{
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    
    private String Name[] = {"Mã tài sản","Tên tài sản","Khoa quản lý","Danh mục","Tình trạng","Chuyển tới","Ngày sử dụng","Vị trí đặt","CB quản lý","CB sử dụng"};
    
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    
    ArrayList<TSDieuChuyen> dsDC = new ArrayList<>();

    public TableTSDieuChuyen(ArrayList<TSDieuChuyen> ds) {
        dsDC = ds;
    }
    
    
    @Override
    public int getRowCount() {
        return dsDC.size();
    }

    @Override
    public int getColumnCount() {
        return Name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return dsDC.get(rowIndex).getTsX().getMaTS();
            
            case 1: return dsDC.get(rowIndex).getTsX().getTenTS();
            
            case 2: return dsDC.get(rowIndex).getTsX().getKhoaQl();
             
            case 3: return dsDC.get(rowIndex).getTsX().getDanhMuc();
            
            case 4: return dsDC.get(rowIndex).getTsX().getTinhTrang();
            
            case 5: return dsDC.get(rowIndex).getNoiDC();
            
            case 6: return dsDC.get(rowIndex).getNgaySD();
            
            case 7: return dsDC.get(rowIndex).getVtDat();
            
            case 8: return dsDC.get(rowIndex).getCbQL();
            
            case 9: return dsDC.get(rowIndex).getCbSD();
            
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
