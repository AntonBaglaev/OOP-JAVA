package Seminar3;

import java.util.ArrayList;
import java.util.List;

public class StreamService {

    private  Stream stream;

    public List<StudentGroup> getSortedStudentGroup() {
        List<StudentGroup> studentGroup = new ArrayList<>(stream.getStudentGroup());
        studentGroup.sort(new StreamComparator());
        return studentGroup;
    }
}
