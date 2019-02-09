package jorge.cecyt9.mx.ipn.bdjorgedavod;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AuxiliarSql extends SQLiteOpenHelper {

    String sql_tabla = "CREATE TABLE Reservacion (" + "_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "Nombre Text)";

    public AuxiliarSql(Context context, String DBname, SQLiteDatabase.CursorFactory factory, int version){

        super(context, DBname, factory, version);

    }

    @Override
    public void onCreate(SQLiteDatabase baseDatos){
        baseDatos.execSQL(sql_tabla);
    }

    @Override
    public  void onUpgrade(SQLiteDatabase baseDatos, int oldVersion, int newVersion){
        baseDatos.execSQL("DROP TABLE IF EXISTS Reservacion");
        baseDatos.execSQL(sql_tabla);
    }
}
