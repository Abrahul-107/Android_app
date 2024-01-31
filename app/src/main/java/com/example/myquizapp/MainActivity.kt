package com.example.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    /*  onCreate(savedInstanceState: Bundle?)
      Purpose: This method is a lifecycle method that is called when the activity is
      first created. It sets the content view to the layout defined in activity_main.xml.

      Parameters:
      savedInstanceState: Bundle?: A Bundle object containing the activity's previously saved state, or null if there is no saved state.*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Button Click Listener
        Purpose: Listens for clicks on the "Start" button (btnStart). If the user has entered their name,
        it initiates the quiz by transitioning to the QuizQuestionsActivity.*/


        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)
        /*Input Validation
        If the user's name is empty, a Toast message is displayed indicating that the user should enter their name.

        If the name is not empty, it creates an Intent to start the QuizQuestionsActivity and passes the user's name as an extra.*/
        btnStart.setOnClickListener {
            if(etName.text.isEmpty()) {
                Toast.makeText(this,"Please enter your name ",Toast.LENGTH_LONG).show()
            } else
            {
                /*Usage of Intent and putExtra
                Purpose: The Intent is used to switch from the current activity (MainActivity) to the QuizQuestionsActivity.
                The user's name is passed as an extra using putExtra.
                 */
                val intent = Intent(this,QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME,etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}
/*
This documentation template provides a structured overview of the `MainActivity` class, its methods, and the key functionalities.
Adjust the details and formatting based on your specific project conventions and documentation standards. 200 line for count */
