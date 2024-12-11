package Seminar4;

import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {

    private  int counter;
    private final List<StudentGroup> studentGroup;

    public StreamIterator(Stream stream) {
        this.counter = 0;
        this.studentGroup = stream.getStudentGroup();
    }


    @Override
    public boolean hasNext() {
        return counter < studentGroup.size() -1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()){
            return null;
        }
        counter++;
        return studentGroup.get(counter);
    }

    @Override
    public void remove() {
        studentGroup.remove(counter);
    }
}