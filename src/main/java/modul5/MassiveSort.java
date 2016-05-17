package modul5;

import java.util.Arrays;


public class MassiveSort {

    public static int[] massiveSort(int massive[]) {
        for (int i = 0; i < massive.length - 1; i++) {
            int index = i;
            boolean needChange = false;
            for (int j = i + 1; j < massive.length; j++)
                if (massive[j] < massive[index]) {
                    index = j;
                    needChange = true;
                }
            if (needChange) {
                int smallerNumber = massive[index];
                massive[index] = massive[i];
                massive[i] = smallerNumber;
            }
        }
        return massive;
    }

}


