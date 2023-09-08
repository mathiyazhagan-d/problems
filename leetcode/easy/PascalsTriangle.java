public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();

        List<Integer> row=new ArrayList<>();
        row.add(1);
        result.add(row);

        List<Integer> prev=row;

        for(int i=1;i<numRows;i++){
            List<Integer> current=new ArrayList<>();
            current.add(1);
            for(int j=1;j<i;j++)
                current.add(prev.get(j)+prev.get(j-1));
            current.add(1);
            result.add(new ArrayList<>(current));
            prev=current;
        }

        return result;



    }
}
