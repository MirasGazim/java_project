package java_1;
public class gazim {
    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;

    public gazim(float _speed, int _weight, String _color, byte[] _coordinate){
        System.out.println("Object created");
        setvalues(_speed, _weight, _color, _coordinate);
        System.out.println(getValues());
    }

    public gazim(int _weight, byte[] _coordinate){
        weight = _weight;
        coordinate = _coordinate;
        System.out.println(getValues());

    }

    public void setvalues(float _speed, int _weight, String _color, byte[] _coordinate){
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;


    }

    public String getValues(){
        String info = "object speed: " + speed + ". weight: " + weight + ". color: " + color + "\n";
        String info_coordinate = "Coordinate:\n";
        for(int i = 0; i < coordinate.length; i++ ) {
            info_coordinate += coordinate[i] + "\n";
        }

        return info + info_coordinate;

    }
    
    
    void vark(){
        System.out.println("hello world");
    }

}
