public class Marks {
    // Section A: attributes
    private float[] marks;
    private int numdata;

    public Marks(int num) {
        createData(num);
    }

    // Section B: operation
    public void createData(int numdata) {
        marks = new float[numdata];   // an array
        for (int i=0; i<numdata; i++) {
            marks[i] =  (float)(Math.random() * 100);
        }
        this.numdata = numdata;
    }

    public float calcAvg() {
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }
        return sum / numdata;
    }

    public double calSdev() {
        double sum = 0.0, s_dev = 0.0;
        float mean = calcAvg();

        for(int i = 0; i < numdata; i++) {
            s_dev += Math.pow(marks[i] - mean, 2);
        }
        return Math.sqrt(s_dev/numdata);
    }
    public void setMark(int mark, int index) {
        this.marks[index] = mark;
    }
    public float getMark(int index) {
        return marks[index];
    }

    public float[] getMarksArray() {
        return this.marks;
    }

}
