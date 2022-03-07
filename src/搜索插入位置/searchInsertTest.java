package 搜索插入位置;

/**
 * @Author: Pumpkin
 * @Date: 2022/3/7
 */
public class searchInsertTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int searchInsert = solution.searchInsert(new int[]{1, 3, 5, 6}, 2);
        System.out.println(searchInsert);
    }
}
