package algoritms;

public class SearchAlgoritms {

    public int linearSearch(int[] list, int value){

        for(int i=0; i<list.length;i++){
            if (list[i] == value){
                return i;
            }
        }
        return -1;
    }


    public int binarySearch(int[] list, int value){

        int start = 0;
        int end = list.length -1;

        while (start <= end){
            int middle = (start + end) / 2;

            if (list[middle] == value){
                return middle;
            }
            if (list[middle] < value){
                start = middle + 1;
            } else{
                end = middle - 1;
            }
        }
        return -1;
    }

}
