package java_1;

public class car extends gazim {

    public car(float _speed, int _weight, String _color, byte[] _coordinate){
        System.out.println("Object created");
        setvalues(_speed, _weight, _color, _coordinate);
        System.out.println(getValues());
    }
}
