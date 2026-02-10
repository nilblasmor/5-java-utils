package javautils.level1.exercise5;

import java.io.*;

public class Serializer_Deserializer  {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Thing thing = new Thing("Being", 34);

        //Serialize
        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("thing.ser"));
        out.writeObject(thing);
        out.close();

        //Deserialize
        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("thing.ser"));
        Thing loaded = (Thing) in.readObject();
        in.close();

        System.out.println(loaded);
    }

}
