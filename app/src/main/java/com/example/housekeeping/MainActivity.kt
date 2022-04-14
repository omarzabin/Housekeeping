package com.example.housekeeping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       /* val firstFragment = BookServiceDialogFragment()
        val secondFragment = ProvideServiceDialogFragment()*/
        val fragment1: Button = findViewById(R.id.bookBT)
        val fragment2: Button = findViewById(R.id.provideBT)
//        supportFragmentManager.beginTransaction().apply {
//            replace(R.id.mainLY, firstFragment)
//            commit()
//        }
        fragment1.setOnClickListener {
            var dialog_var = BookServiceDialogFragment()
            dialog_var.show(supportFragmentManager, "Custom Dialog")
        }
        fragment2.setOnClickListener {
            var dialog_var2 = ProvideServiceDialogFragment()
            dialog_var2.show(supportFragmentManager, "hi")

//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.mainLY, secondFragment)
//                commit()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item2->Toast.makeText(this,"Click one of the two buttons to start." +
                    " Contact us by Email for more Help!", Toast.LENGTH_LONG).show()
        }
        return true;
    }


//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//
//        }
}

