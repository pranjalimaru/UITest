package com.example.android.uitest;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.ValueDependentColor;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import java.io.InputStream;


public class Graph122 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String TAG = Graph122.class.getSimpleName();
    private GraphView mGraph;
    private TextView fileContent;
    private CheckBox Total, Rural, Urban;
    private Button btnDisplay;
    Spinner ageSpinner, choiceSpinner;
    List<String> age, choice;
    Button mSelect;
    TextView mItemSelected;
    List<String> listItems = new ArrayList<>();
    boolean[] checkedItems;
    ArrayList<Integer> mUserItems = new ArrayList<>();
    ArrayList<String []> TotalData = new ArrayList<>();
    ArrayList<String []> RuralData = new ArrayList<>();
    ArrayList<String []> UrbanData = new ArrayList<>();
    String[] content;
    String TotRuUrb, StringAge=" ";
    private String result = " ";
    ArrayList<Integer> SeriesToAdd = new ArrayList<>();
    int rowNo;
    int flagTotal=0, flagUrban=0, flagRural=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph122);

        mGraph = (GraphView) findViewById(R.id.graph);
        ageSpinner = (Spinner)findViewById(R.id.ageSpinner);
        choiceSpinner=(Spinner)findViewById(R.id.choiceSpinner);
        //mSelect = (Button) findViewById(R.id.multiSelect);
        mItemSelected = (TextView) findViewById(R.id.textViewMultiple);
        //listItems = getResources().getStringArray(R.array.choices);
        //checkedItems = new boolean[listItems.length];
        Total = (CheckBox)findViewById(R.id.total);
        Rural = (CheckBox)findViewById(R.id.rural);
        Urban = (CheckBox)findViewById(R.id.urban);
        btnDisplay = (Button) findViewById(R.id.btnDisplay);


        choiceSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                rowNo = parent.getSelectedItemPosition();
                String name = parent.getSelectedItem().toString();
                listItems.add(name);
                Log.d(TAG, "rowNo" + rowNo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        choice = new ArrayList<String>();
        choice.add("Total Persons");
        choice.add("Total Males");
        choice.add("Total Females");


        choice.add("Educated People who are Main Workers");
        choice.add("Educated Men who are Main Workers");
        choice.add("Educated Women who are Main Workers");
        choice.add("Educated People who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Educated Men who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Educated Women who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Educated People who are Marginal Workers and worked for less than 3 months");
        choice.add("Educated Men who are Marginal Workers and worked for less than 3 months");
        choice.add("Educated Women who are Marginal Workers and worked for less than 3 months");
        choice.add("Educated People who are Non-Workers");
        choice.add("Educated Men who are Non-Workers");
        choice.add("Educated Women who are Non-Workers");
        choice.add("Un-Educated People who are Main Workers");
        choice.add("Un-Educated Men who are Main Workers");
        choice.add("Un-Educated Women who are Main Workers");
        choice.add("Un-Educated People who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Un-Educated Men who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Un-Educated Women who are Marginal Workers and worked for 3 to 6 months");
        choice.add("Un-Educated People who are Marginal Workers and worked for less than 3 months");
        choice.add("Un-Educated Men who are Marginal Workers and worked for less than 3 months");
        choice.add("Un-Educated Women who are Marginal Workers and worked for less than 3 months");
        choice.add("Un-Educated People who are Non-Workers");
        choice.add("Un-Educated Men who are Non-Workers");
        choice.add("Un-Educated Women who are Non-Workers");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, choice);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        choiceSpinner.setAdapter(dataAdapter);


        ageSpinner.setOnItemSelectedListener(this);
        age = new ArrayList<String>();
        // age.add("Select age");
        age.add("5"); age.add("6");
        age.add("7"); age.add("8");
        age.add("9"); age.add("10");
        age.add("11"); age.add("12");
        age.add("13"); age.add("14");
        age.add("16"); age.add("17");
        age.add("18"); age.add("19");
        age.add("5-19");
        // Creating adapter for spinner
        ArrayAdapter<String> ageAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, age);
        // Drop down layout style - list view with radio button
        ageAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        ageSpinner.setAdapter(ageAdapter);


        //Graph code
        mGraph.getViewport().setScalable(true);  // activate horizontal zooming and scrolling
        mGraph.getViewport().setScrollable(true);  // activate horizontal scrolling
        mGraph.getViewport().setScalableY(true);  // activate horizontal and vertical zooming and scrolling
        mGraph.getViewport().setScrollableY(true);  // activate vertical scrolling
        fileContent = (TextView)findViewById(R.id.content_from_server);
        Button loadTextButton = (Button)findViewById(R.id.load_file_from_server);

        //Checkbox code
        // TotRuUrb = addListeneronButton();
        btnDisplay.setOnClickListener(new View.OnClickListener() {
            //Run when button is clicked
            @Override
            public void onClick(View v) {
                if(Total.isChecked()){
                    flagTotal=1;
                }
                if(Rural.isChecked()){
                    flagRural=1;
                }
                if(Urban.isChecked()){
                    flagUrban=1;
                }
            }
        });

        loadTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String[]> csvContent = readCVSFromAssetFolder();
                TotalData = totalAnother(csvContent,StringAge);
                RuralData = ruralAnother(csvContent,StringAge);
                UrbanData = urbanAnother(csvContent,StringAge);
                //createLineGraph(trial);

                //  createBarGraphSeries(trial,rowNo,listItems);
                //createBarChartGraph(trial);
                //printCVSContent(trial);
                if(flagUrban==1){
                    createLineGraphSeries(UrbanData,rowNo,"Urban");
                }
                if(flagRural==1){
                    createLineGraphSeries(RuralData,rowNo,"Rural");
                }
                if(flagTotal==1){
                    createLineGraphSeries(TotalData,rowNo,"Total");
                }

            }
        });

        StaticLabelsFormatter staticLabelsFormatter = new StaticLabelsFormatter(mGraph);
        //staticLabelsFormatter.setHorizontalLabels(new String[] {"old", "middle", "new"});
        mGraph.getGridLabelRenderer().setLabelFormatter(staticLabelsFormatter);

    }

    private ArrayList<String[]> totalAnother(List<String[] > result, String age){
        for(int i=0;i<result.size();i++){
            String rows[] = result.get(i);
            if(rows[3].matches(age)){
                if(rows[2].contains("Total")) {
                    TotalData.add(rows);
                }
            }
        }
        return TotalData;
    }

    private ArrayList<String[]> ruralAnother(List<String[] > result, String age){
        for(int i=0;i<result.size();i++){
            String rows[] = result.get(i);
            if(rows[3].matches(age)){
                if(rows[2].contains("Rural")) {
                    RuralData.add(rows);
                }
            }
        }
        return RuralData;
    }

    private ArrayList<String[]> urbanAnother(List<String[] > result, String age){
        for(int i=0;i<result.size();i++){
            String rows[] = result.get(i);
            if(rows[3].matches(age)){
                if(rows[2].contains("Urban")) {
                    UrbanData.add(rows);
                }
            }
        }
        return UrbanData;
    }

    private List<String[]> readCVSFromAssetFolder(){
        List<String[]> csvLine = new ArrayList<>();
        //String[] content = null;
        try {
            InputStream inputStream = getAssets().open("data_2.csv");
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while((line = br.readLine()) != null){
                content = line.split(",");
                csvLine.add(content);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return csvLine;
    }

    private void printCVSContent(List<String[]> result){
        String cvsColumn = "";
        for (int i = 0; i < result.size(); i++){
            String rows []  = result.get(i);
            cvsColumn += rows[0] + " " + rows[1] + " " + rows[2] + " " + rows[3] + "\n";
        }

        fileContent.setText(cvsColumn);
    }

    private void createLineGraph(List<String[]> result){
        DataPoint[] dataPoints = new DataPoint[result.size()];
        // DataPoint[] dataPoints_1 = new DataPoint[result.size()];

        for (int i = 0; i < result.size(); i++){
            String [] rows = result.get(i);
            Log.d(TAG, "Output " + Integer.parseInt(rows[0]) + " " + Integer.parseInt(rows[2]));
            dataPoints[i] = new DataPoint(Integer.parseInt(rows[0]), Integer.parseInt(rows[2]));
            // dataPoints_1[i] = new DataPoint(Integer.parseInt(rows[0]), Integer.parseInt(rows[2]));

        }
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(dataPoints);
        // LineGraphSeries<DataPoint> series_1 = new LineGraphSeries<>(dataPoints_1);
        mGraph.addSeries(series);
        //mGraph.addSeries(series_1);
    }

    private void createBarGraphSeries(List<String[]> result, int rowNo, String title){
        DataPoint[] dataPoints = new DataPoint[result.size()];
        for(int i=0;i<result.size();i++){
            String [] rows = result.get(i);
            dataPoints[i] = new DataPoint(Integer.parseInt(rows[0]),Integer.parseInt(rows[rowNo+4]));
        }
        BarGraphSeries<DataPoint> series = new BarGraphSeries<DataPoint>(dataPoints);
        mGraph.addSeries(series);
        series.setDrawValuesOnTop(true);
        //series.setValuesOnTopColor(Color.RED);
        series.setTitle(title);
        //series.setColor(Color.GREEN);
        series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
            @Override
            public int get(DataPoint data) {
                return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
            }
        });
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(Graph122.this, "Series1: On Data Point clicked: "+ dataPoint, Toast.LENGTH_SHORT).show();
            }
        });

        mGraph.getLegendRenderer().setVisible(true);
        mGraph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
        series.setSpacing(50);
    }

    private void createLineGraphSeries(List<String[]> result, int rowNo, String title){
        DataPoint[] dataPoints = new DataPoint[result.size()];
        for(int i=0;i<result.size();i++){
            String [] rows = result.get(i);
            dataPoints[i] = new DataPoint(Integer.parseInt(rows[0]),Integer.parseInt(rows[rowNo+4]));
        }
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(dataPoints);
        mGraph.addSeries(series);
        // series.setDrawValuesOnTop(true);
        //series.setValuesOnTopColor(Color.RED);
        series.setTitle(title);
        series.setDrawDataPoints(true);
        series.setDataPointsRadius(10);
        series.setThickness(8);
        series.setDrawBackground(true);
        series.setAnimated(true);
        //series.setColor(Color.GREEN);
      /* series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
           @Override
           public int get(DataPoint data) {
               return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
           }
       });*/
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(Graph122.this, "Series1: On Data Point clicked: "+ dataPoint, Toast.LENGTH_SHORT).show();
            }
        });

        // custom paint to make a dotted line
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        paint.setPathEffect(new DashPathEffect(new float[]{8, 5}, 0));
        // paint.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
        series.setCustomPaint(paint);

        mGraph.getLegendRenderer().setVisible(true);
        mGraph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);
        //series.setSpacing(50);
    }

    private void createBarChartGraph(List<String[]> result){
        DataPoint[] dataPoints = new DataPoint[result.size()];
        DataPoint[] dataPoints_1 = new DataPoint[result.size()];


        for (int i = 0; i < result.size(); i++){
            String [] rows = result.get(i);
            //Log.d(TAG, "Output " + Integer.parseInt(rows[0]) + " " + Integer.parseInt(rows[1]));
            dataPoints[i] = new DataPoint(Integer.parseInt(rows[0]), Integer.parseInt(rows[4]));
            dataPoints_1[i] = new DataPoint(Integer.parseInt(rows[0]), Integer.parseInt(rows[5]));
        }
        BarGraphSeries<DataPoint> series = new BarGraphSeries<DataPoint>(dataPoints);
        BarGraphSeries<DataPoint> series_1 = new BarGraphSeries<DataPoint>(dataPoints_1);

        mGraph.addSeries(series);
        series.setTitle("Education Graph");
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.RED);
        series.setColor(Color.GREEN);
        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(Graph122.this, "Series1: On Data Point clicked: "+ dataPoint, Toast.LENGTH_SHORT).show();
            }
        });

        mGraph.addSeries(series_1);
        series_1.setDrawValuesOnTop(true);
        series_1.setValuesOnTopColor(Color.RED);
        series_1.setColor(Color.BLUE);

        mGraph.getLegendRenderer().setVisible(true);
        mGraph.getLegendRenderer().setAlign(LegendRenderer.LegendAlign.TOP);

       /*series.setValueDependentColor(new ValueDependentColor<DataPoint>() {
           @Override
           public int get(DataPoint data) {
               return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
           }
       }); */
        series.setSpacing(50);

      /* series_1.setValueDependentColor(new ValueDependentColor<DataPoint>() {
          @Override
           public int get(DataPoint data) {
               return Color.rgb((int) data.getX()*255/4, (int) Math.abs(data.getY()*255/6), 100);
           }
       }); */
        series_1.setSpacing(50);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        StringAge = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        //  Toast.makeText(parent.getContext(), "Selected: " + StringAge, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        ageSpinner.setPrompt("Select an age");

    }

}




