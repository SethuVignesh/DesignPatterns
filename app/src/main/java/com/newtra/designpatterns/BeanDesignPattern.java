package com.newtra.designpatterns;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by sethu on 7/25/2016.
 */
public class BeanDesignPattern implements Parcelable {
    private String name;
    private String type;
    private String purpose;
    private String useWhen;
    private String example;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getUseWhen() {
        return useWhen;
    }

    public void setUseWhen(String useWhen) {
        this.useWhen = useWhen;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    private int mData;

    /* everything below here is for implementing Parcelable */

    // 99.9% of the time you can just ignore this
    @Override
    public int describeContents() {
        return 0;
    }

    // write your object's data to the passed-in Parcel
    @Override
    public void writeToParcel(Parcel out, int flags) {
        out.writeInt(mData);
    }

    // this is used to regenerate your object. All Parcelables must have a CREATOR that implements these two methods
    public static final Parcelable.Creator<BeanDesignPattern> CREATOR = new Parcelable.Creator<BeanDesignPattern>() {
        public BeanDesignPattern createFromParcel(Parcel in) {
            return new BeanDesignPattern(in);
        }

        public BeanDesignPattern[] newArray(int size) {
            return new BeanDesignPattern[size];
        }
    };

    public BeanDesignPattern() {

    }

    // example constructor that takes a Parcel and gives you an object populated with it's values
    private BeanDesignPattern(Parcel in) {
        mData = in.readInt();
    }
}
