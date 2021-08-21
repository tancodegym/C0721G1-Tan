package _04_bai4_ClassAndObject.bai_tap;

class StopWatch {
    private long startTime, endTime;

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
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long start = getStartTime();
        long end = getEndTime();
        long mSecond = end - start;
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
}

class TestTime {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        arr = CountTime.sort(arr);
        stopWatch.end();
        System.out.println("Time: " + stopWatch.getElapsedTime());

    }
}




