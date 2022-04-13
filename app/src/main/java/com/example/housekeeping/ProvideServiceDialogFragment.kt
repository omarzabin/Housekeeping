package com.example.housekeeping

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment

class ProvideServiceDialogFragment:DialogFragment(R.layout.fragment_service_provide_dialog) {
    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v: View =inflater.inflate(R.layout.fragment_service_provide_dialog,container,false)
        var flag = "Choose the service "
        var flag2 = "Choose hours "
        var flag3=0

        val enrollBT: Button = v.findViewById(R.id.enrollBT)
        val spinnerVal1: Spinner = v.findViewById(R.id.categorySP2)
        val spinnerVal2: Spinner = v.findViewById(R.id.hoursSP2)
        val price:EditText=v.findViewById(R.id.editNumPrice)

        var i=0

        var opt = arrayOf("cooking", "washing", "dusting", "dog walking")
        var hou = arrayOf("1","7","9")
        var pricePerHour = arrayOf(0)

        spinnerVal1.adapter=
            activity?.let{
                ArrayAdapter<String>(it, android.R.layout.simple_expandable_list_item_1,opt)
            }
        // If you are working with Fragments it will not be resolved
        // You must call the activity context like this.
        //val adapter = activity?.let {
        //        ArrayAdapter<String>(
        //            it,
        //            android.R.layout.simple_spinner_item,
        //            campaignsType
        //        )
        //    }
        spinnerVal2.adapter= activity?.let{
            ArrayAdapter<String>(it ,android.R.layout.simple_expandable_list_item_1,hou)
        }

        enrollBT.setOnClickListener{view ->
            var p:Int = price.text.toString().toInt()
            if (flag == "cooking") {
                if (flag2 == "1") {
                        pricePerHour.set(i,p)
                        i++
                }
                else if (flag2 == "2") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "7") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "9") {
                    pricePerHour.set(i,p)
                    i++
                }

            }
            else if (flag == "washing") {
                if (flag2 == "1") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "2") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "7") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "9") {
                    pricePerHour.set(i,p)
                    i++
                }
            }
            else if (flag == "dusting") {
                if (flag2 == "1") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "2") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "7") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "9") {
                    pricePerHour.set(i,p)
                    i++
                }
            }
            else if (flag == "dog walking") {
                if (flag2 == "1") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "2") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "7") {
                    pricePerHour.set(i,p)
                    i++
                }
                else if (flag2 == "9") {
                    pricePerHour.set(i,p)
                    i++
                }
            }

        }
        spinnerVal1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = opt.get(p2) // p2 is the index of selected ite

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        spinnerVal2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag2 = hou.get(p2) // p2 is the index of selected ite
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }
        return v
    }

}