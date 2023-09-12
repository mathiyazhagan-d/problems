public class PascalsTriangleII {
    public List<Integer> getRow(int numRows) {


        List<Integer> row=new ArrayList<>();
        row.add(1);


        List<Integer> prev=row;

        for(int i=1;i<=numRows;i++){
            List<Integer> current=new ArrayList<>();
            current.add(1);
            for(int j=1;j<i;j++)
                current.add(prev.get(j)+prev.get(j-1));
            current.add(1);

            if(i==numRows)
                return current;
            prev=current;
        }
        return row;

    }
}
