package com.example.gridalert;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.provider.ContactsContract.Directory;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Save extends Activity {
	TextView t1,t2;
	String t;
	Button save,send,open;
/*	private String filename="MyFile.txt";
	private String  filepath="MyFileStorage";*/
	File myInternalFile;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_save);
		/*ContextWrapper con=new ContextWrapper(getApplicationContext());
		File directory=con.getDir(filepath, Context.MODE_PRIVATE);
		myInternalFile= new File(directory,filename);*/
		open=(Button)findViewById(R.id.button9);
		save=(Button)findViewById(R.id.button50);
		send=(Button)findViewById(R.id.button51);
		t2=(TextView)findViewById(R.id.textView4);
		t1=(TextView)findViewById(R.id.textView5);
		Bundle bun1=getIntent().getExtras();
		t=bun1.getString("Text");
		Log.i("Text",t);
		t1.setText(t);
	send.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent s=new Intent(Intent.ACTION_SEND);
			s.setType("message/rfc822");
			s.putExtra(Intent.EXTRA_EMAIL,new String[]{"thoufeekkingmaker@gmail.com"});
			s.putExtra(Intent.EXTRA_SUBJECT,"WELCOME TO THE APP");
			s.putExtra(Intent.EXTRA_TEXT, t);
			startActivity(Intent.createChooser(s,"sending mail..."));
			
			
		}
	});
	/*save.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String myData="";
			switch(v.getId()){
			case R.id.button50:
				try{
					FileOutputStream fos=new FileOutputStream(myInternalFile);
					fos.write(t.toString().getBytes());
				fos.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
				t1.setText("");
				t1.setText("MySampleFile.txt");
				break;
			case R.id.button9:
			try {
				FileInputStream fis=new FileInputStream(myInternalFile);
				DataInputStream in=new DataInputStream(fis);
				BufferedReader br=new BufferedReader(new InputStreamReader(in));
				String strLine;
				while((strLine=br.readLine())!=null)
				{
					myData=myData + strLine;
				}
				in.close();
				
			}catch(IOException e){
				e.printStackTrace();
			}
			t1.setText(myData);
			t1.setText("MySampleFile.txt");
			break;
			
			
				
			
				
			}
			
		}
	});
	*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.save, menu);
		return true;
	}

}
