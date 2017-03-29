package id.ac.unsyiah.android.belajarnavigationdrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

/**
 * Created by uchiha on 25/03/2017.
 */

public class KotaSaya extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.kota_saya_layout, container, false);

        CalendarView calendar = (CalendarView) rootView.findViewById(R.id.calendarView);

        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener(){
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                TextView textView = (TextView) rootView.findViewById(R.id.section_label);
                textView.append(dayOfMonth + "/" + month + "/" + year + "\n");
            }
        });

        return rootView;
    }

}
