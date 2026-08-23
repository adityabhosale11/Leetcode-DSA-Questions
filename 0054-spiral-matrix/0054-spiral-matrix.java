class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            // 1. Top row: left -> right
            for (int j = startcol; j <= endcol; j++) {
                ans.add(matrix[startrow][j]);
            }
            startrow++;

            // 2. Right column: top -> bottom
            for (int i = startrow; i <= endrow; i++) {
                ans.add(matrix[i][endcol]);
            }
            endcol--;

            // 3. Bottom row: right -> left
            if (startrow <= endrow) {
                for (int j = endcol; j >= startcol; j--) {
                    ans.add(matrix[endrow][j]);
                }
                endrow--;
            }

            // 4. Left column: bottom -> top
            if (startcol <= endcol) {
                for (int i = endrow; i >= startrow; i--) {
                    ans.add(matrix[i][startcol]);
                }
                startcol++;
            }
        }

        return ans;
    }
}