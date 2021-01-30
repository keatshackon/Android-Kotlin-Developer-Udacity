package com.keatssalazar.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.keatssalazar.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;
    private val myname: MyName = MyName("Mr. Keats")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        // bind the layout to Activity
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //bind laytout file to data class file
        binding.myname = myname

        binding.doneButton.setOnClickListener {
            addNickName(it)
        }

//        findViewById<Button>(R.id.done_button).setOnClickListener {
//            addNickName(it)
//        }

    }

    private fun addNickName(view: View) {
        val nicknameEditText: EditText = findViewById(R.id.nickname_editText)
        val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

        binding.apply {
            invalidateAll();
//            nicknameTextView.text = nicknameEditText.text
            myname?.NICKNAME = nicknameEditText.text.toString()
            nicknameEditText.visibility = View.GONE
            nicknameTextView.visibility = View.VISIBLE
            view.visibility = View.GONE
        }

        // Hide the keyboard.

        val im = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        im.hideSoftInputFromWindow(view.windowToken, 0)


    }

}