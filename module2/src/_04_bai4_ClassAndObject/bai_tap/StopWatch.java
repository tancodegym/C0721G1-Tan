package _04_bai4_ClassAndObject.bai_tap;

import java.time.LocalTime;

class StopWatch {
    private LocalTime startTime, endTime;

    public StopWatch() {
        startTime = LocalTime.now();
    }

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void start() {
        startTime = LocalTime.now();
    }

    public void end() {
        endTime = LocalTime.now();
    }

    public int getElapsedTime() {
        int hour = endTime.getHour() - startTime.getHour();
        int minute = endTime.getMinute() - startTime.getMinute();
        int second = endTime.getSecond() - startTime.getSecond();
        int mSecond = (hour * 3600 + minute * 60 + second) * 1000;
        return mSecond;
    }
}

 class DemThoiGianThucThiCuaThuatToanSapXepChon {
    public static int[] sapXep(int ...a) {
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
        int[] a=new int[100000];
        for (int i =0;i<a.length;i++){
            a[i]=(int)(Math.random()*1000);
        }
        LocalTime start = LocalTime.now();
        a= sapXep(a);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start, end);
        System.out.println("Time: "+stopWatch.getElapsedTime());

    }

    }



