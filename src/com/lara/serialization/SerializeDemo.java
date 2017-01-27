package com.lara.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat2 = new Cat();

        System.out.println("BEFORE SERIALIZE : LEGS=" + cat.legs + "\n" + "EARS=" + cat.ears + "\n" + "EYES=" + cat.eyes);
        try {
            FileOutputStream fs = new FileOutputStream("catSeri.txt");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(cat);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();

        }

        System.out.println("AFTER SERIALIZE : LEGS=" + cat.legs + "\n" + "EARS=" + cat.ears + "\n" + "EYES=" + cat.eyes);
        try {
            FileInputStream fis = new FileInputStream("catSeri.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            cat2 = (Cat) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("AFTER DESERIALIZE : LEGS=" + cat2.legs + "\n" + "EARS=" + cat2.ears + "\n" + "EYES=" + cat2.eyes);
    }
}
