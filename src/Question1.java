public class Question1 {
    public String thousandSeparator(int n) {
        String numToString = Integer.toString(n);
        if (numToString.length()<4)
            return numToString;

        int count = 1;
        for (int i = numToString.length()-1; i>=0; i--){
            if (count != 3){
                count++;
            }
            else if (i == 0)
                break;
            else {
                numToString = numToString.substring (0,i) + "." + numToString.substring(i);
                count = 1;
            }

        }

        return numToString;
    }
}

