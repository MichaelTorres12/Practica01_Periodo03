package com.example.clase01_periodo03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.navigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var = navegacion : BottonNavigationView
    private val opcionMenuSeleccionada = NavigationView.OnNavigationItemSelectedListener {item ->

        when(item.itemId){
            R.id.fragemento1->{
                supportFragmentManager.commit {
                    replace<primer_fragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragemento2->{
                supportFragmentManager.commit {
                    replace<primer_fragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragemento3->{
                supportFragmentManager.commit {
                    replace<primer_fragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragemento4->{
                supportFragmentManager.commit {
                    replace<primer_fragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace<primer_fragmento>(R.id.fragment_container_view)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }

        navegacion = findViewById(R.id.nav_menu)
        val OpcionMenuSeleccionada
        navegacion = setOnNavigationItemSelectedListener(OpcionMenuSeleccionada)

    }
}