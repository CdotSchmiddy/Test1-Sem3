/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1sem3;

import javafx.scene.image.Image;

/**
 *
 * @author Calum
 */
public class LiquidSoap {
    private String brandName;
    private String intendedUse;
    private int volume;
    private Image photo;

    public LiquidSoap(String brandName, int volume, Image photo) {
        setBrandName(brandName);
        setIntendedUse(intendedUse);
        setVolume(volume);
        setPhoto(photo);
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        if (brandName.isEmpty())
            throw new IllegalArgumentException("Brand name cannot be empty");
        else
        this.brandName = brandName;
    }

    public String getIntendedUse() {
        return intendedUse;
    }

    public void setIntendedUse(String intendedUse) {
        String[] validUses = {"Dish","Hand","Floor"};

        for (String validBrand : validUses)
        {
            if (validBrand.equalsIgnoreCase(intendedUse))
            {
                this.intendedUse = validBrand;
                return;
            }
        }
        throw new IllegalArgumentException("Valid uses are: Dish, Hand or Floor.");
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume >= -1 && volume <= 10000){
            throw new IllegalArgumentException("Resolution must be between 0-10000");
        }
            else
        this.volume = volume;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
    
    @Override
    public String toString() {
        return brandName + "   (" + volume + ")";
    }
}
