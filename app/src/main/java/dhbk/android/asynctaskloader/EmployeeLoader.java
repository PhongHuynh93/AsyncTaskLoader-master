package dhbk.android.asynctaskloader;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.util.ArrayList;

import hugo.weaving.DebugLog;

/**
 * Created by huynhducthanhphong on 4/15/16.
 */
public class EmployeeLoader extends AsyncTaskLoader<ArrayList<Employee>> {
    private static final String TAG = EmployeeLoader.class.getName();

    public EmployeeLoader(Context context) {
        super(context);
    }

    /**
     * todo 5 Called on a worker thread to perform the actual load and to return the result of the load operation.
     * todo
     * @return
     */
    // background, add to database
    @Override
    @DebugLog
    public ArrayList<Employee> loadInBackground() {
        Log.i(TAG, Constant.LOADER_ACTIVITY + "loadInBackground: ");
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("emp1", "Brahma"));
        list.add(new Employee("emp2", "Vishnu"));
        list.add(new Employee("emp3", "Mahesh"));
        return list;
    }
}
