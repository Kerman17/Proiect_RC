package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

           // setContentView(R.layout.activity_wifi_devices)

            setContentView(R.layout.login_layout);

            val username = findViewById<EditText>(R.id.username);
            val password = findViewById<EditText>(R.id.password);


            val loginbtn = findViewById<Button>(R.id.loginbtn);

            // admin and admin

            loginbtn.setOnClickListener(View.OnClickListener {
                if(username.text.toString().equals("admin") && password.text.toString().equals("admin")){
                                setContentView(R.layout.activity_main);



            val checkBoxAutomat = findViewById<CheckBox>(R.id.checkBox2)
            val checkBoxManual = findViewById<CheckBox>(R.id.checkBox3)


            // Set up an OnCheckedChangeListener for checkBox1
            checkBoxAutomat.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    checkBoxManual.isChecked = false
                    val textSensor = findViewById<TextView>(R.id.textViewSensor)

                    //textSensor.setText(" ");
                }
            }

            // Set up an OnCheckedChangeListener for checkBoxManual
            checkBoxManual.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) {
                    checkBoxAutomat.isChecked = false
                    val textSensor = findViewById<TextView>(R.id.textViewSensor)
                    textSensor.setText("Sensor Reading");
                }

            }
                }else{
                    Toast.makeText(this,"LOGIN FAILED",Toast.LENGTH_SHORT).show();
                }
            })

//            class ConnectedThread2(ipaddress: String?) : Thread() {
//                init {
//                    Log.e("Status", "Device connected")
//                }
//
//                override fun run() {
//                    Log.e("Status", "Device running")
//                }
//
//                fun send(cmdText: Int, ipaddress: String) {
//                    Log.e("Status", "Sending data $cmdText")
//                    val url = "http://$ipaddress/post"
//                    val stringRequest: StringRequest = object : StringRequest(
//                        Request.Method.POST, url,
//                        Response.Listener<String> { response ->
//                            Log.e(
//                                "Status",
//                                response.trim { it <= ' ' })
//                        },
//                        Response.ErrorListener { error -> Log.e("Status", error.toString()) }) {
//                        override fun getParams(): Map<String, String>? {
//                            val params: MutableMap<String, String> = HashMap()
//                            val value = cmdText.toString()
//                            params["data"] = value
//                            Log.e("Status", value)
//                            return params
//                        }
//                    }
//                    val requestQueue = Volley.newRequestQueue(this@MainActivity)
//                    requestQueue.add(stringRequest)
//                }
//            }
//
//            class CreateConnectThread2(ipaddress: String?) : Thread() {
//                init {
//                    Log.e("Status", ipaddress!!)
//                }
//
//                override fun run() {
//                    // Cancel discovery because it otherwise slows down the connection.
//
//                    Log.e("Status", "Device connected")
////                    handler.obtainMessage(CONNECTING_STATUS, 2, -2).sendToTarget()
//                    val connectedThread2 = ConnectedThread2(ipAddress.toString())
//                    connectedThread2.start()
//                }
//
////                fun cancel() {
////                    try {
////                        mySocket.close()
////                    } catch (e: IOException) {
////                        Log.e(TAG, "Could not close the client socket", e)
////                    }
////                }
//            }
//
//        }





    }

}}


