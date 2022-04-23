package com.ericaskari.healthapplication.services;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.ericaskari.healthapplication.daos.MedicineDao;
import com.ericaskari.healthapplication.daos.PainLogDao;
import com.ericaskari.healthapplication.daos.UserDao;
import com.ericaskari.healthapplication.models.Medicine;
import com.ericaskari.healthapplication.models.PainLog;
import com.ericaskari.healthapplication.models.User;


@Database(
        entities = {User.class, Medicine.class, PainLog.class},
        version = 1
)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();

    public abstract MedicineDao medicineDao();

    public abstract PainLogDao painLogDao();
}