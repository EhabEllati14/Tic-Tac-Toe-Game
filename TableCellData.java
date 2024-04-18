package application;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class TableCellData {
    private final SimpleIntegerProperty row;
    private final SimpleIntegerProperty column;
    private final SimpleStringProperty status;

    public TableCellData(int row, int column, String status) {
        this.row = new SimpleIntegerProperty(row);
        this.column = new SimpleIntegerProperty(column);
        this.status = new SimpleStringProperty(status);
    }

    public int getRow() {
        return row.get();
    }

    public int getColumn() {
        return column.get();
    }

    public String getStatus() {
        return status.get();
    }
}
