package _04_bai4_ClassAndObject.bai_tap;

import java.time.LocalTime;


class StopWatch {
  private  long startTime,endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.endTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();}

    public long getElapsedTime() {
//        int hour = endTime.getHour() - startTime.getHour();
//        int minute = endTime.getMinute() - startTime.getMinute();
//        int second = endTime.getSecond() - startTime.getSecond();
        long start= getStartTime();
        long end=getEndTime();
        long mSecond = end-start;
        return mSecond;
    }
}

class CountTime {
    public static int[] sort(int... a) {
        int indexMin, i, j;
        for (i = 0; i < a.length - 1; i++) {
            indexMin = i;

            for (j = i + 1; j < a.length; j++) {
                if (a[j] < a[indexMin]) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                int temp = a[indexMin];
                a[indexMin] = a[i];
                a[i] = temp;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
//        LocalTime start = LocalTime.now();
//        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        arr = sort(arr);
        stopWatch.end();;
        System.out.println("Time: " + stopWatch.getElapsedTime());

    }

}




