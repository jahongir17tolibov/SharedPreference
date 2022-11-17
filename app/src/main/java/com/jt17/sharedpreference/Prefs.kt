package com.jt17.sharedpreference

import android.content.Context

class Prefs(context: Context){
    companion object{
        private const val PREFERENCE_NAME = "share_pr"
        private const val STR_KEY = "str_key"
        private const val AGE_KEY = "age_key"
    }
    val initPrefreance = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

    //string
    fun setName(s:String){
        with(initPrefreance.edit()){
            putString(STR_KEY, s)
            apply()
        }
    }
    fun getName(): String{
        return initPrefreance.getString(STR_KEY, "empty")?: "empty str"
    }
    //int
    fun setAge(i:Int){
        with(initPrefreance.edit()){
            putInt(AGE_KEY, i)
            apply()
        }
    }
    fun getAge(): Int{
        return initPrefreance.getInt(AGE_KEY, 0)
    }

    //remove , clear
    fun removeStr(): Boolean{
       return initPrefreance.edit().remove(STR_KEY).commit()
    }
    fun clearStr(): Boolean{
       return initPrefreance.edit().clear().commit()
    }
}