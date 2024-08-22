import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FilePersistence implements IFilePersistence{

    @Override
    public void saveData(String fileName, Object object){
        try(FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object loadData(String fileName){
        try(FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis)){
            return ois.readObject();
        } catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
            return null;
        }
    }
}
