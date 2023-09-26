public class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        StringBuffer sb=new StringBuffer();

        while(columnNumber!=0){
            columnNumber-=1;
            int rem = columnNumber%26;
            sb.append((char)(rem+65));
            columnNumber/=26;
        }
        sb=sb.reverse();
        return sb.toString();

    }
}
