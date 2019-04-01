package ru.geekbrains.cityinfo;

import android.os.Parcelable;


public class Parcel implements Parcelable {
    private int imageIndex;
    private String cityName;

    public int getImageIndex() {
        return imageIndex;
    }

    public String getCityName() {
        return cityName;
    }

    public Parcel(int imageIndex, String cityName) {
        this.imageIndex = imageIndex;
        this.cityName = cityName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeInt(this.imageIndex);
        dest.writeString(this.cityName);
    }

    protected Parcel(android.os.Parcel in) {
        this.imageIndex = in.readInt();
        this.cityName = in.readString();
    }

    public static final Creator<Parcel> CREATOR = new Creator<Parcel>() {
        @Override
        public Parcel createFromParcel(android.os.Parcel source) {
            return new Parcel(source);
        }

        @Override
        public Parcel[] newArray(int size) {
            return new Parcel[size];
        }
    };
}
