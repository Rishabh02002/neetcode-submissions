class Solution {
    public String encode(List<String> strs) {
        StringBuilder enc = new StringBuilder();
        for (String str : strs) {
            enc.append(str.length()).append("#").append(str);
        }
        return enc.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            i = j + 1;

            String s = str.substring(i, i + length);
            list.add(s);

            i += length;
        }

        return list;
    }
}
