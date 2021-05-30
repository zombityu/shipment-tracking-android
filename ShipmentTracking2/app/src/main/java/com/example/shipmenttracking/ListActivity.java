package com.example.shipmenttracking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class ListActivity extends AppCompatActivity {

    private FirebaseUser user;

    private FirebaseFirestore mFirestore;
    private CollectionReference mOrders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        user = FirebaseAuth.getInstance().getCurrentUser();
        if(user == null){
            finish();
        }

        mFirestore = FirebaseFirestore.getInstance();
        mOrders = mFirestore.collection("Orders");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.list_menu, menu);
        MenuItem menuItem = menu.findItem(R.id.search_bar);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(menuItem);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();
                finish();
            case R.id.add:
                Intent intent = new Intent(this, NewOrder.class);
                startActivity(intent);
            case R.id.view_selector:
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}