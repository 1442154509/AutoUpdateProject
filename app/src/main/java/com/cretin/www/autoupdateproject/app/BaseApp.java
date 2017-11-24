package com.cretin.www.autoupdateproject.app;

import android.app.Application;

import com.cretin.www.autoupdateproject.R;
import com.cretin.www.autoupdateproject.UpdateModel;
import com.cretin.www.cretinautoupdatelibrary.utils.CretinAutoUpdateUtils;

public class BaseApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CretinAutoUpdateUtils.Builder builder = new CretinAutoUpdateUtils.Builder()
                .setBaseUrl("http://www.cretinzp.com/system/versioninfo")
                .setIgnoreThisVersion(true)
                .setShowType(CretinAutoUpdateUtils.Builder.TYPE_DIALOG_WITH_BACK_DOWN)
                .setIconRes(R.mipmap.logo)
                .showLog(true)
                .setRequestMethod(CretinAutoUpdateUtils.Builder.METHOD_GET)
                .setTransition(new UpdateModel())
                .build();
        CretinAutoUpdateUtils.init(builder);
    }
}