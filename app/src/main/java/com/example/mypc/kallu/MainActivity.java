package com.example.mypc.kallu;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ArrayList<heading> list_1=new ArrayList<heading>();
        list_1.add(new heading("Manushyatham Marikkunnidathe Yuddhangal Janikunnu","Muhsin Moidu Vayat"));
        list_1.add(new heading("Charithrathe Kuriche","Nithin Prakash"));
        list_1.add(new heading("Mangiya Varnangal","Tania Thomas"));
        list_1.add(new heading("Jihhua","Shahan P P"));
        list_1.add(new heading("Thoni","Mohammed Shafeeq N"));
        list_1.add(new heading("Of Opression and the Tenacity of Human Spirit ","Farheen Thaha"));
        list_1.add(new heading("Anaathathwam","Jishnu Raj"));
        list_1.add(new heading("A P J Abdul Kalam","Athul Jack"));
        list_1.add(new heading("Fire that Ever Flame","Dr. B Premlet"));
        list_1.add(new heading("Prarthana","Dr. Ushadevi Amma"));
        list_1.add(new heading("Chennai Pralayam","Dawn Ivan"));
        list_1.add(new heading("Bheed Mein Akele","Mujeeb Rehman"));
        list_1.add(new heading("Price Tag","Kiran Chand"));
        list_1.add(new heading("Aham","Sharon Maria Sajan"));
        list_1.add(new heading("Interview with Dr. Biju","Bijeesh T P and Vivek N S"));
        list_1.add(new heading("Time to Change","Vishnu Prakash"));
        list_1.add(new heading("Matha Pitha Guru Daivam","Shinoj P"));
        list_1.add(new heading("Life in the Andaman and Nicobar Islands","Abrar Abdullah"));
        list_1.add(new heading("Avarude Katha","Sebin Sabu"));
        list_1.add(new heading("Puthiya Paadangal","Pranav Nelliat"));

        final ArrayList<heading> list_2=new ArrayList<heading>();
        list_2.add(new heading("Let us not take this planet for granted..","Veni R Nair"));
        list_2.add(new heading("Ottukaran","Arun Das"));
        list_2.add(new heading("Saving the Internet","Sachin P"));
        list_2.add(new heading("Elon Musk","Nihal Mohamed"));
        list_2.add(new heading("Feminism is for Everyone","Veena S Suthan"));
        list_2.add(new heading("Retrospection","Irene Miriam Issac"));
        list_2.add(new heading("Down the Parisian Street","Rex Mathew"));
        list_2.add(new heading("IFFK Remniscences","Nihal Seethi"));
        list_2.add(new heading("Nadar Muthal Napkin Vare","Aswin C S"));
        list_2.add(new heading("Olivil Poya Daivam","Nitha V"));
        list_2.add(new heading("Iyal thirinju ninnu mattullavare varaykunnu","Vaishak A"));
        list_2.add(new heading("Ammavan Kanda TKM",""));
        list_2.add(new heading("Aventura 2014","Abhinand M T "));
        list_2.add(new heading("Down The Road","Nidal Shaheed"));
        list_2.add(new heading("As the ground shook in Nepal","Srishti Adhikari"));
        list_2.add(new heading("Marikkondirikunna Navamadhyama Samskaram","Daya Abraham"));
        list_2.add(new heading("Uttharam Chodhyathine Verukunnuvo","Pranoy Vijay"));
        list_2.add(new heading("Randu Thullikal","Shubhad Sharma"));
        list_2.add(new heading("1 hour at M301","Joel Abees"));
        list_2.add(new heading("Vilakki Vachathil Ninnu","Vaishnav Nelliyottan"));
        
        final ArrayList<heading> list_3=new ArrayList<heading>();
        list_3.add(new heading("Rohith Vemula Parayan Bakki Vechathe","Fawas Abdul Nasar"));
        list_3.add(new heading("Vedipperiya Theruvukal","Pranav Nelliat"));
        list_3.add(new heading("Interview with Sethu","Vaishak A and Avinash O K"));
        list_3.add(new heading("Naushad","Ameen Malayil"));
        list_3.add(new heading("Susthira Vikasanathinte Praadheshika Paadangal","Dr. UdayaKumar J"));
        list_3.add(new heading("Kaathirippu","Dhanya K"));
        list_3.add(new heading("Niranjana","Soumya M"));
        list_3.add(new heading("Sandman","Arjun Sajeev"));
        list_3.add(new heading("STEPS",""));
        list_3.add(new heading("Ottaykane","Avinash O K"));
        list_3.add(new heading("Srishti","Nandakishore U M"));
        list_3.add(new heading("Role of Feminism in Modern Society","Sera Maria Joshu"));
        list_3.add(new heading("Madakkam","Anuvind Malayil"));
        list_3.add(new heading("Paalappookkal","Abin O Panicker"));
        list_3.add(new heading("In Search of India","Mohammed Jaseel C K"));
        list_3.add(new heading("A Life with Technology","Gayathri V Nair"));
        list_3.add(new heading("Chila Kerala Literary Fest Anubhavangal",""));
        list_3.add(new heading("Pazhuthilakal Kozhiyarayi","Abi Abraham"));
        list_3.add(new heading("#loveWins ","Rex Mathew"));
        list_3.add(new heading("College Union Report",""));

        Button button1= (Button) findViewById(R.id.part1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, list.class);
                i.putExtra("list", list_1);
                i.putExtra("section", 1);
                startActivity(i);
            }
        });
        Button button2= (Button) findViewById(R.id.part2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,list.class);
                i.putExtra("list",list_2);
                i.putExtra("section",2);
                startActivity(i);
            }
        });
        Button button3= (Button) findViewById(R.id.part3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,list.class);
                i.putExtra("list",list_3);
                i.putExtra("section",3);
                startActivity(i);
            }
        });
        Button button4= (Button) findViewById(R.id.part4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,list.class);
                i.putExtra("section",4);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
