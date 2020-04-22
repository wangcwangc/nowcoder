package 剑指offer;

public class 矩形覆盖 {
    public int RectCover(int target) {
        if (target <= 0) return 0;
        else if (target == 2) {
            return 2;
        } else if (target == 1) {
            return 1;
        } else {
            return RectCover(target - 2) + RectCover(target - 1);
        }
    }
}
