package com.example.doan.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.doan.Model.Category;
import com.example.doan.Model.Food;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Random;

public class DBFood {
    Context context;
    Input input;

    static final String dbName = "food.db";

    public DBFood(Context context) {
        this.context = context;
        input = new Input(context);

    }

    public DBFood() {
    }

    public SQLiteDatabase openDB() {
        return context.openOrCreateDatabase(dbName, context.MODE_PRIVATE, null);
    }

    public int checkDBFood() {
        SQLiteDatabase db = openDB();
        String sqlFood = "select * from tblFood";
        Cursor cursor = db.rawQuery(sqlFood, null);

        return cursor.getCount();
    }

    public Category addFurnitureToCategories(int categoriesId) {
        Category categories = findByCatetgoriesID(categoriesId);
        ArrayList<Food> arrFurniture = getALLFood();
        for (Food furniture : arrFurniture) {
            if (furniture.getCategory().getMaDM() == categoriesId) {
                categories.getFoodArrayList().add(furniture);
            }
        }
        return categories;
    }

    public int checkDBCategory() {
        SQLiteDatabase db = openDB();
        String sqlFood = "select * from tbtCategory";
        Cursor cursor = db.rawQuery(sqlFood, null);

        return cursor.getCount();
    }

    public int checkLike(int id) {
        SQLiteDatabase db = openDB();
        String sqlFood = "select YeuThich from tblFood where MaMA =" + id;
        Cursor cursor = db.rawQuery(sqlFood, null);
        return cursor.getCount();
    }


    private void closeDB(SQLiteDatabase db) {
        db.close();
    }

    public void updateFood(int id) {
        SQLiteDatabase db = openDB();
        ContentValues contentValues = new ContentValues();
        contentValues.put("YeuThich", 1);
        db.update("tblFood", contentValues, "MaMA=" + id, null);
        closeDB(db);
    }

    public void updateFood2(int id) {
        SQLiteDatabase db = openDB();
        ContentValues contentValues = new ContentValues();
        contentValues.put("YeuThich", 0);
        db.update("tblFood", contentValues, "MaMA=" + id, null);
        closeDB(db);
    }

    public void createTable() {
        SQLiteDatabase db = openDB();
        String sqlFurniture = "CREATE TABLE IF NOT EXISTS tblFood (" +
                " MaMA INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " Ten TEXT," +
                " Anh TEXT," +
                " CachLam TEXT," +
                " YeuThich INTEGER," +
                " MaDM INTEGER );";
        String sqlCategories = "CREATE TABLE IF NOT EXISTS tbtCategory (" +
                " MaDM INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                " Ten TEXT," +
                " AnhDM INTEGER );";
        db.execSQL(sqlFurniture);
        db.execSQL(sqlCategories);
        closeDB(db);
    }

    public ArrayList<Food> getALLFood() {
        SQLiteDatabase db = openDB();
        ArrayList<Food> arr = new ArrayList<>();
        String sql = "select * from tblFood";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String name = csr.getString(1);
                    String image = csr.getString(2);
                    String description = csr.getString(3);
                    int like = csr.getInt(4);
                    int categoryID = csr.getInt(5);

                    arr.add(new
                            Food(id, findByCatetgoriesID(categoryID), name, description, Integer.valueOf(image), like));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }
    public static ArrayList<Food> foodHistory = new ArrayList<>();


    public static ArrayList<Food> getFoodHistory() {
        return foodHistory;
    }
    public ArrayList<Food> getFoodFromCategory(int pos) {
        SQLiteDatabase db = openDB();
        ArrayList<Food> arr = new ArrayList<>();
        String sql = "select * from tblFood where MaDM = "+pos;
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String name = csr.getString(1);
                    String image = csr.getString(2);
                    String description = csr.getString(3);
                    int like = csr.getInt(4);
                    int categoryID = csr.getInt(5);
                    arr.add(new
                            Food(id, findByCatetgoriesID(categoryID), name, description, Integer.valueOf(image), like));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }
    public ArrayList<Category> getALLCategories() {
        SQLiteDatabase db = openDB();
        ArrayList<Category> arr = new ArrayList<>();
        String sql = "select * from tbtCategory";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String name = csr.getString(1);
                    String image = csr.getString(2);
                    arr.add(new Category(name, Integer.valueOf(image)));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }

    public ArrayList<Food> getLike() {
        SQLiteDatabase db = openDB();
        ArrayList<Food> arr = new ArrayList<>();
        String sql = "select * from tblFood where YeuThich = 1";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String name = csr.getString(1);
                    String image = csr.getString(2);
                    String description = csr.getString(3);
                    int like = csr.getInt(4);
                    int categoryID = csr.getInt(5);

                    arr.add(new
                            Food(id, findByCatetgoriesID(categoryID), name, description, Integer.valueOf(image), like));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;

    }

    public ArrayList<Food> getFood(String namefind) {
        SQLiteDatabase db = openDB();
        ArrayList<Food> arr = new ArrayList<>();
        String sql = "select * from tblFood where tenMA ='" + namefind + "' ";
        Cursor csr = db.rawQuery(sql, null);
        if (csr != null) {
            if (csr.moveToFirst()) {
                do {
                    int id = csr.getInt(0);
                    String name = csr.getString(1);
                    String image = csr.getString(2);
                    String description = csr.getString(3);
                    int like = csr.getInt(4);
                    int categoriesID = csr.getInt(5);

                    arr.add(new
                            Food(id, categoriesID, name, description, like, Integer.valueOf(image)));
                } while (csr.moveToNext());
            }
        }
        closeDB(db);
        return arr;
    }

    public Category findByCatetgoriesID(int id) {
        ArrayList<Category> arr = getALLCategories();
        for (Category ca : arr) {
            if (ca.getMaDM() == id) {
                return ca;
            }
        }
        return null;
    }

    public Category addFoodToCategories(int categoriesId) {
        Category categories = findByCatetgoriesID(categoriesId);
        ArrayList<Food> arrFood = getALLFood();
        for (Food food : arrFood) {
            if (food.getCategory().getMaDM() == categoriesId) {
                categories.getFoodArrayList().add(food);
            }
        }
        return categories;
    }

    public void insertCategories() {
        ArrayList<Category> arrCa = input.getMockDataCategory();
        SQLiteDatabase db = openDB();
        for (Category ca : arrCa) {
            ContentValues cv = new ContentValues();
            cv.put("AnhDM", ca.getHinAnhDM());
            cv.put("Ten", ca.getTenDM());
            db.insert("tbtCategory", null, cv);
        }
        closeDB(db);
    }

    public void insertFood() {
        ArrayList<Food> arrFood = input.getMockData();
        SQLiteDatabase db = openDB();
        Random random = new Random();
        for (Food fu : arrFood) {
            ContentValues cv = new ContentValues();
            cv.put("Ten", fu.getTenMA());
            cv.put("Anh", fu.getHinhAnh());
            cv.put("CachLam", fu.getCachLam());
            cv.put("YeuThich", fu.getYeuThich());
            cv.put("MaDM", random.nextInt(14) + 1);
            db.insert("tblFood", null, cv);
        }
        closeDB(db);
    }

    private void copyDatabase() {
        File file = context.getDatabasePath(dbName);
        if (!file.exists()) {
            try {
                InputStream is = context.getAssets().open(dbName);
                OutputStream os = new FileOutputStream(file);
                byte[] buffer = new byte[1024];
                while (is.read(buffer) > 0) {
                    os.write(buffer);
                }
                os.flush();
                os.close();
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
