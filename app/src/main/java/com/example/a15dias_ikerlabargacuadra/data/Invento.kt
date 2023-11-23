package com.example.a15dias_ikerlabargacuadra.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a15dias_ikerlabargacuadra.R

data class Invento(
    @DrawableRes val imageId: Int,
    @StringRes val nombre: Int,
    @StringRes val descripcion: Int,
    @StringRes val año: Int
)

val invetos = listOf(
    Invento(R.drawable.fuego,R.string.fuego_name,R.string.fuego_desc,R.string.fuego_año),
    Invento(R.drawable.rueda,R.string.rueda_name,R.string.rueda_desc,R.string.rueda_año),
    Invento(R.drawable.arado,R.string.arado_name,R.string.arado_desc,R.string.arado_año),
    Invento(R.drawable.polvora,R.string.polvora_name,R.string.polvora_desc,R.string.polvora_año),
    Invento(R.drawable.hormigon,R.string.hormigon_name,R.string.hormigon_desc,R.string.hormigon_año),
    Invento(R.drawable.bombilla,R.string.bombilla_name,R.string.bombilla_desc,R.string.bombilla_año),
    Invento(R.drawable.maquina_de_vapor,R.string.maquina_vapor_name,R.string.maquina_vapor_desc,R.string.maquina_vapor_año),
    Invento(R.drawable.imprenta,R.string.imprenta_name,R.string.imprenta_desc,R.string.imprenta_año),
    Invento(R.drawable.avion,R.string.avion_name,R.string.avion_desc,R.string.avion_año),
    Invento(R.drawable.antibioticos,R.string.antibioticos_name,R.string.antibioticos_desc,R.string.antibioticos_año),
    Invento(R.drawable.motor_combustion,R.string.motor_combustion_name,R.string.motor_combustion_desc,R.string.motor_combustion_año),
    Invento(R.drawable.telegrafo,R.string.telegrafo_name,R.string.telegrafo_desc,R.string.telegrafo_año),
    Invento(R.drawable.ordenador,R.string.ordenador_name,R.string.ordenador_desc,R.string.ordenador_año),
    Invento(R.drawable.movil,R.string.telefono_name,R.string.telefono_desc,R.string.telefono_año),
    Invento(R.drawable.internet,R.string.internet_name,R.string.internet_desc,R.string.internet_año),
)
