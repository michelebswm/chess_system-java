package boardgame;

public class Position {
    private Integer row;
    private Integer column;

    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public Integer getrow() {
        return row;
    }

    public void setrow(Integer row) {
        this.row = row;
    }

    public Integer getcolumn() {
        return column;
    }

    public void setcolumn(Integer column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return row +
                ", " +
               column ;
    }
}
