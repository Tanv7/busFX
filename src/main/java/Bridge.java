public class Bridge {


    int height;

    public Bridge(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "height=" + height +
                '}';
    }