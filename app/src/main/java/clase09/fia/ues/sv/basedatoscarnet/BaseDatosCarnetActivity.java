package clase09.fia.ues.sv.basedatoscarnet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BaseDatosCarnetActivity extends AppCompatActivity {

    String[] menu={"Tabla Alumno","Tabla Nota","Tabla Materia","LLenar Base de Datos"};
    String[] activities={"AlumnoMenuActivity","NotaMenuActivity","MateriaMenuActivity"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu));
    }
    @Override
    protected void onListItemClick(ListView l,View v,int position,long id){
        super.onListItemClick(l, v, position, id);
        if(position!=3){
            String nombreValue=activities[position];
            try{
                Class<?> clase=Class.forName("sv.ues.fia.basedatoscarnet."+nombreValue);
                Intent inte = new Intent(this,clase);
                this.startActivity(inte);
            }catch(ClassNotFoundException e){
                e.printStackTrace();
            }
        }else{
//CODIGO PARA LLENAR BASE DE DATOS
        }
    }

}
