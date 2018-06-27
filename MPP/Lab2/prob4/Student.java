package prob4;

import java.util.*;

public class Student {

    String name;
    String id;
    List<TranscriptEntry> grades = new ArrayList<>();

    public Transcript getTranscript() {
        return new Transcript(grades, this);

    }

}
