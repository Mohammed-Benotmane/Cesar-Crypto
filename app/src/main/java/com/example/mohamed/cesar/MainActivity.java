package com.example.mohamed.cesar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public int chiffrage(char c){
        switch (c){
            case 'a':
                return 0;

            case 'b':
                return 1;

            case 'c':
                return 2;
           // break;
            case 'd':
                return 3;
           // break;
            case 'e':
                return 4;
            //break;
            case 'f':
                return 5;
          //  break;
            case 'g':
                return 6;
           // break;
            case 'h':
                return 7;
           // break;
            case 'i':
                return 8;
           // break;
            case 'j':
                return 9;
          //  break;
            case 'k':
                return 10;
         //   break;
            case 'l':
                return 11;
          //  break;
            case 'm':
                return 12;
         //   break;
            case 'n':
                return 13;
        //    break;
            case 'o':
                return 14;
       //     break;
            case 'p':
                return 15;
        //    break;
            case 'q':
                return 16;
          //  break;
            case 'r':
                return 17;
          //  break;
            case 's':
                return 18;
          //  break;
            case 't':
                return 19;
          //  break;
            case 'u':
                return 20;
         //   break;
            case 'v':
                return 21;
         //   break;
            case 'w':
                return 22;
         //   break;
            case 'x':
                return 23;
         //   break;
            case 'y':
                return 24;
         //   break;
            case 'z':
                return 25;
         //   break;
            default:
                return -1;

        }
    }
    public char dechiffrage(int c){
        switch (c){
            case 0:
                return 'a';

            case 1:
                return 'b';

            case 2:
                return 'c';
            // break;
            case 3:
                return 'd';
            // break;
            case 4:
                return 'e';
            //break;
            case 5:
                return 'f';
            //  break;
            case 6:
                return 'g';
            // break;
            case 7:
                return 'h';
            // break;
            case 8:
                return 'i';
            // break;
            case 9:
                return 'j';
            //  break;
            case 10:
                return 'k';
            //   break;
            case 11:
                return 'l';
            //  break;
            case 12:
                return 'm';
            //   break;
            case 13:
                return 'n';
            //    break;
            case 14:
                return 'o';
            //     break;
            case 15:
                return 'p';
            //    break;
            case 16:
                return 'q';
            //  break;
            case 17:
                return 'r';
            //  bk;
            case 18:
                return 's';
            //  beak;
            case 19:
                return 't';
            //  break;
            case 20:
                return 'u';
            //   break;
            case 21:
                return 'v';
            //   break;
            case 22:
                return 'w';
            //   break;
            case 23:
                return 'x';
            //   break;
            case 24:
                return 'y';
            //   break;
            case 25:
                return 'z';
            //   break;
            default:
                return ',';

        }
    }
    public void decriptez(View view){
        EditText code = (EditText)findViewById(R.id.editText);
        EditText cle = (EditText)findViewById(R.id.editText2);
        String resultat="";
        int cleNum = chiffrage(cle.getText().toString().charAt(0));
       for (int i = 0; i < code.getText().toString().length(); i++) {
           if (chiffrage(code.getText().toString().charAt(i))<cleNum){
            resultat+=String.valueOf(dechiffrage((chiffrage(code.getText().toString().charAt(i))-cleNum)+26));
            }
            else{
               resultat+=String.valueOf(dechiffrage(chiffrage(code.getText().toString().charAt(i))-cleNum));
           }
       }
        Intent intent = new Intent(MainActivity.this,Resultat.class);
        intent.putExtra("a",resultat);
        startActivity(intent);
    }
    public void criptez(View view){
        EditText code = (EditText)findViewById(R.id.editText);
        EditText cle = (EditText)findViewById(R.id.editText2);
        String resultat="";
        int cleNum = chiffrage(cle.getText().toString().charAt(0));
        for (int i = 0; i < code.getText().toString().length(); i++) {
                resultat += String.valueOf(dechiffrage((chiffrage(code.getText().toString().charAt(i))+cleNum) % 26));
        }
        Intent intent = new Intent(MainActivity.this,Resultat.class);
        intent.putExtra("a",resultat);
        startActivity(intent);

    }
}
