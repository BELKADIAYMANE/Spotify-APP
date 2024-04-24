package media;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
public class MediaCollection {
private static List<Media> medias;
private static final String path ="</Users/mac/eclipse-workspace>/data/spotify.ser";

public MediaCollection() {
	medias = new ArrayList<>();
}

public boolean addMedia(Media proj) {
    if (!medias.contains(proj)) {
    	medias.add(proj);
        return true;
    }
    return false;
}

public boolean removeMedia(Media proj) {
    return medias.remove(proj);
}

public void modifyMedia(Media oldproj, Media newproj) {
    int index = medias.indexOf(oldproj);
    if (index >= 0) {
    	medias.set(index, newproj);
    }
}

public void modifyMedia(String title, Media newproj) {
    ListIterator<Media> iter = medias.listIterator();
    while (iter.hasNext()) {
    	Media proj = iter.next();
        if (proj.gettitle().equals(title)) {
            iter.set(newproj);
        }
    }
}

public List<Media> searchByTitle(String title) {
    ArrayList<Media> results = new ArrayList<>();
    ListIterator<Media> iter = medias.listIterator();

    while (iter.hasNext()) {
    	Media proj = iter.next();
        if (proj.gettitle() == title) {
            results.add(proj);
        }
    }
    return results;
}

@SuppressWarnings("unchecked")
public void sortMedias(@SuppressWarnings("rawtypes") Comparator comp) {
    Collections.sort(medias, comp);
}

@Override
public String toString() {
    String str = "";
    ListIterator<Media> iter = medias.listIterator();
    while (iter.hasNext()) {
    	Media proj = iter.next();
        str += proj.toString() + "\n";
    }
    return str;
}

public ListIterator<Media> getProjects() {
    return medias.listIterator();
}

public void save() throws FileNotFoundException, IOException {
    File f = new File(path);
    FileOutputStream fos = new FileOutputStream(f);
    ObjectOutput oos = new ObjectOutputStream(fos);

    oos.writeObject(medias);

    oos.close();
    fos.close();
}

@SuppressWarnings("unchecked")
public void load() throws FileNotFoundException, IOException, ClassNotFoundException {
    FileInputStream fis = new FileInputStream(path);
    ObjectInputStream ois = new ObjectInputStream(fis);

    medias = (ArrayList<Media>) ois.readObject();

    ois.close();
    fis.close();

}
}
