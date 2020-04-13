package 剑指offer;

public class 二维数组中的查找 {
    public boolean Find(int target, int [][] array) {
        if (array.length != 0 && array[0].length != 0){
            for(int i = 0; i < array.length; i++){
                if(array[i][0] > target){
                    break;
                }else{
                    for(int j = 0; j < array[i].length; j++){
                        if(array[i][j]>target) break;
                        else if (array[i][j] == target) return true;
                    }
                }
            }
        }
        return false;
    }
}
