package com.example.scanner_example;

import android.app.Application;

import moxy.RegisterMoxyReflectorPackages;
import com.example.scanner.di.ScannerFeatureComponent;
import com.example.scanner_example.di.ScannerFeatureDependenciesFake;

@RegisterMoxyReflectorPackages({"com.example.scanner"})
public class ScannerExampleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // component
        ScannerFeatureComponent.initAndGet(
            new ScannerFeatureDependenciesFake()
        );
    }

}
