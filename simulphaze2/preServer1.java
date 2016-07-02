package simulphaze2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class preServer1 {

    public ArrayList<job> jobList = new ArrayList<>();

    public void addToList(job j) {

        jobList.add(j);

        Collections.sort(jobList, new Comparator<job>() {
            @Override
            public int compare(job j1, job j2) {
                if (j1.preDurationTime < j2.preDurationTime) {
                    return -1;
                }
                if (j1.preDurationTime > j2.preDurationTime) {
                    return 1;
                }
                return 0;
            }
        });
    }

}
