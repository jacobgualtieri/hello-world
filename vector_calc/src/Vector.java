import java.util.ArrayList;

public class Vector {
    private int a;
    private int b;
    private int c;

    public Vector(ArrayList<Integer> coordinates){
        this.a = coordinates.get(0);
        this.b = coordinates.get(1);
        this.c = coordinates.get(2);
    }

    public int dotProduct(Vector o){
        return Math.multiplyExact(this.a, o.a)+Math.multiplyExact(this.b, o.b)+Math.multiplyExact(this.c, o.c);
    }

    public Vector crossProduct(Vector o){
        ArrayList<Integer> result = new ArrayList<>();
        result.add(Math.multiplyExact(this.b, o.c) - Math.multiplyExact(this.c, o.b));
        result.add(Math.multiplyExact(-1, Math.multiplyExact(this.a, o.c) - Math.multiplyExact(this.c, o.a)));
        result.add(Math.multiplyExact(this.a, o.b) - Math.multiplyExact(this.b, o.a));
        return new Vector(result);
    }

    public double getMagnitude(){
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2) + Math.pow(this.c, 2));
    }

    public boolean equals(Vector o){
        return this.a == o.a && this.b == o.a && this.c == o.c;
    }

    @Override
    public String toString(){
        return "Vector Object: "+
                "<"+this.a+
                ", "+this.b+
                ", "+this.c+
                ">";
    }

    public String componentForm(){
        return "Component Form: "+this.a
                +"i + "+this.b+
                "j + "+this.c+
                "k";
    }

    public static void main(String[] args){
        ArrayList<Integer> testAL1 = new ArrayList<>();
        ArrayList<Integer> testAL2 = new ArrayList<>();

        testAL1.add(1);
        testAL1.add(2);
        testAL1.add(3);
        testAL2.add(4);
        testAL2.add(5);
        testAL2.add(6);

        Vector testV1 = new Vector(testAL1);
        Vector testV2 = new Vector(testAL2);

        System.out.println(testV1.toString());
        System.out.println(testV2.toString());
        System.out.println(testV1.dotProduct(testV2));
        System.out.println(testV1.getMagnitude());
        System.out.println(testV1.crossProduct(testV2).toString());
    }
}