package com.example.gridalert;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
public class Table extends Activity {
	final Context context=this;	
 private Button phy,che,phy1,che1,pt,evs,ood,phy2,che2,ooad,pcd,abc,phy3,phy4,pe,spm,pe1,spm1,dsp,spm2,pt1,pt2,dsp2,pt3,phy5,che3,
 dsp3,dep;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_table);
		phy=(Button)findViewById(R.id.button12);
		che=(Button)findViewById(R.id.button13);
		phy1=(Button)findViewById(R.id.button14);
		che1=(Button)findViewById(R.id.button15);
		pt=(Button)findViewById(R.id.button16);
		evs=(Button)findViewById(R.id.button17);
		ood=(Button)findViewById(R.id.button18);
		phy2=(Button)findViewById(R.id.button22);
		che2=(Button)findViewById(R.id.button23);
		ooad=(Button)findViewById(R.id.button24);
		pcd=(Button)findViewById(R.id.button25);
		abc=(Button)findViewById(R.id.button26);
		phy3=(Button)findViewById(R.id.button27);
		phy4=(Button)findViewById(R.id.button28);
		pe=(Button)findViewById(R.id.button32);
		spm=(Button)findViewById(R.id.button33);
		pe1=(Button)findViewById(R.id.button34);
		spm1=(Button)findViewById(R.id.button35);
		dsp=(Button)findViewById(R.id.button36);
		spm2=(Button)findViewById(R.id.button37);
		pt1=(Button)findViewById(R.id.button38);
		pt2=(Button)findViewById(R.id.button42);
		dsp2=(Button)findViewById(R.id.button43);
		pt3=(Button)findViewById(R.id.button44);
		phy5=(Button)findViewById(R.id.button45);
		che3=(Button)findViewById(R.id.button46);
		dsp3=(Button)findViewById(R.id.button47);
		dep=(Button)findViewById(R.id.button48);
		phy.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder alert=new AlertDialog.Builder(context);
				alert.setTitle("Attention");
				alert.setIcon(R.drawable.alert);
				alert.setMessage("Note");
				final EditText input= new EditText(context);
				alert.setView(input);
			
				alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int arg1) {
						// TODO Auto-generated method stub
						String srt= input.getEditableText().toString();
						Bundle bun=new Bundle();
						Intent i1=new Intent(Table.this,Save.class);
						 bun.putString("Text", srt);
						  i1.putExtras(bun);
						    Log.i("value sent", "ok");
						startActivity(i1);
						
					}
				});
			
			
				alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int arg1) {
						// TODO Auto-generated method stub
						dialog.cancel();
						
					}
				});
				
			AlertDialog alertDialog=alert.create();
			alertDialog.show();
			
	
		}
		});
    che.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder alert=new AlertDialog.Builder(context);
				alert.setTitle("Attention");
				alert.setIcon(R.drawable.alert);
				alert.setMessage("Note");
				final EditText input= new EditText(context);
				alert.setView(input);
			
				alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int arg1) {
						// TODO Auto-generated method stub
						String srt= input.getEditableText().toString();
						Bundle bun=new Bundle();
						Intent i1=new Intent(Table.this,Save.class);
						 bun.putString("Text", srt);
						  i1.putExtras(bun);
						    Log.i("value sent", "ok");
						startActivity(i1);
						
					}
				});
			
			
				alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int arg1) {
						// TODO Auto-generated method stub
						dialog.cancel();
						
					}
				});
				
			AlertDialog alertDialog=alert.create();
			alertDialog.show();
			
	
		}
		});
    
    phy1.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    che1.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    pt.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    evs.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    ood.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    phy2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    che2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    ooad.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    pcd.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
		
    abc.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    phy3.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    phy4.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    pe.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    spm.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
		
    pe1.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    spm1.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    dsp.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    spm2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    pt1.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    pt2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    dsp2.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    pt3.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    phy5.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    che3.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    dsp3.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    
    dep.setOnClickListener(new OnClickListener() {
		
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			AlertDialog.Builder alert=new AlertDialog.Builder(context);
			alert.setTitle("Attention");
			alert.setIcon(R.drawable.alert);
			alert.setMessage("Note");
			final EditText input= new EditText(context);
			alert.setView(input);
		
			alert.setPositiveButton("OK",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					String srt= input.getEditableText().toString();
					Bundle bun=new Bundle();
					Intent i1=new Intent(Table.this,Save.class);
					 bun.putString("Text", srt);
					  i1.putExtras(bun);
					    Log.i("value sent", "ok");
					startActivity(i1);
					
				}
			});
		
		
			alert.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int arg1) {
					// TODO Auto-generated method stub
					dialog.cancel();
					
				}
			});
			
		AlertDialog alertDialog=alert.create();
		alertDialog.show();
		

	}
	});
    

	}
	 


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.table, menu);
		return true;
		
		
		

	}

}
	
