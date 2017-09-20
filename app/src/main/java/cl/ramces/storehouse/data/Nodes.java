package cl.ramces.storehouse.data;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import cl.ramces.storehouse.models.CurrentUser;

/**
 * Created by sebas on 14-09-2017.
 */

public class Nodes {

    private DatabaseReference root = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference todayShift(){
        //String uid = new CurrentUser().uid();
        String uid = "tEXVRgJyPhTVzzX1q9H7wB0WiOp1";
        //String date = ?
        String date = "20170913";
        return root.child("shifts").child(uid).child(date);
    }
 }
