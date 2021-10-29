package Programme;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import ClassObjects.Collection;


public class Storage {

	public void Serialisation(Collection collection) {
		File fichier =  new File(collection.getName() + ".ser") ;
		try {
			ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(fichier));
			oos.writeObject(collection);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public Collection Deserialisation(String fileName) throws ClassNotFoundException {
		File fichier =  new File(fileName) ;
		Collection nothing = new Collection("nothing");
		try {
			ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(fichier));
			Collection collection = (Collection)ois.readObject();
			ois.close();
			return collection;

		} catch (IOException e) {
			e.printStackTrace();
			return nothing;
		}
	}

}