package com.learning.realProjectProblems.config;

import java.io.InputStream;
import org.yaml.snakeyaml.Yaml;

public class AppConfig {
    private String productFilePath;
    private String restaurantReviewsFilePath;

    public static AppConfig loadConfig() {
        Yaml yaml = new Yaml();
        try (InputStream inputStream = AppConfig.class.getResourceAsStream("/app_config.yaml")) {
            return yaml.loadAs(inputStream, AppConfig.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public String getProductFilePath() {
        return productFilePath;
    }

    public void setProductFilePath(String productFilePath) {
        this.productFilePath = productFilePath;
    }

    public String getRestaurantReviewsFilePath() {
        return restaurantReviewsFilePath;
    }

    public void setRestaurantReviewsFilePath(String restaurantReviewsFilePath) {
        this.restaurantReviewsFilePath = restaurantReviewsFilePath;
    }
}

