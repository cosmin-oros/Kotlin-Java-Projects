package Problems.CountAndSay;

class CAndSSol {
    public String countAndSay(int n) {
        if(n == 1) {
            return "1";
        }else if(n == 2) {
            return "11";
        }

        String prev = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for(int i = 0;i < prev.length()-1;i++){
            char curr = prev.charAt(i);
            if(curr != prev.charAt(i+1)){
                sb.append(String.valueOf(count));
                sb.append(curr);
                count = 1;
            }
            else
                count++;
        }
        char last = prev.charAt(prev.length()-1);
        if(last != prev.charAt(prev.length()-2))
            sb.append("1");
        else
            sb.append(String.valueOf(count));
        sb.append(last);
        return sb.toString();
    }
}
