package QL_DanhSachTaiSan;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author vanqu
 */
public class TableTaiSan extends AbstractTableModel {
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
    //Thuộc tính mảng chuỗi Name để tạo tiêu đề
    private String Name[] = {"Mã TS","Tên TS","DV Tính","Danh mục","Tình trạng","Hạn bảo hành","Nguồn vốn","Sở hữu","Mục đích sử dụng","Khoa quản lý"};
    //Thuộc tính mảng class để hiển thị thông tin lấy được từ đối tượng tài sản
    private Class classess[]  = {String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    //Thuộc tính dsTS để lấy thông tin về các tài sản từ file dữ liệu
    ArrayList<TaiSan> dsTS = new ArrayList<>();
    public TableTaiSan(ArrayList<TaiSan> ts) {
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
            
            case 2: return dsTS.get(rowIndex).getDvTinh();
             
            case 3: return dsTS.get(rowIndex).getDanhMuc();
            
            case 4: return dsTS.get(rowIndex).getTinhTrang();
            
            case 5: return dsTS.get(rowIndex).getNgayBH();
            
            case 6: return dsTS.get(rowIndex).getNguonVon();
            
            case 7: return dsTS.get(rowIndex).getSoHuu();
            
            case 8: return dsTS.get(rowIndex).getMucDich();
            
            case 9: return dsTS.get(rowIndex).getKhoaQl();
            
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
