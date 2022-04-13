package com.example.housekeeping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = BookServiceDialogFragment()
        val secondFragment = ProvideServiceDialogFragment()
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
            var dialog_var = ProvideServiceDialogFragment()
            dialog_var.show(supportFragmentManager, "Custom Dialog")

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

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when (item.itemId) {
//
//        }
}

