package com.volcengine.mars.demo.update;

import android.content.Context;
import com.volcengine.mars.update.AbsAppCommonContext;
import com.volcengine.mars.update.DeviceWrapper;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

public class AppCommonContextImpl extends AbsAppCommonContext {

    private Context mContext;

    public AppCommonContextImpl(Context context) {
        mContext = context;
    }

    @Override
    public String getCustomUrl() {
        return "https://release-api.vemarsdev.com/v1/gray_release/package";
    }


    @NotNull
    @Override
    public Context getContext() {
        return mContext;
    }

    @Override
    public String getStringAppName() {
        return "升级SDK Demo";
    }

    @NotNull
    @Override
    public String getDeviceId() {
//        若接入了applog，或实现了Device接口，可参考注释中的代码获取did，此接口不能返回空字符串
//        DeviceWrapper deviceService = new DeviceWrapper();
//        return deviceService.getDeviceID();
        return "000000";
    }

    @Override
    public Map<String, String> getCustomKV() {
        return null;
    }
}
