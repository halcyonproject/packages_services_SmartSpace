package com.google.android.systemui.smartspace;

import com.android.systemui.plugins.BcSmartspaceConfigPlugin;

public final class DefaultBcSmartspaceConfigProvider implements BcSmartspaceConfigPlugin {
    @Override // com.android.systemui.plugins.BcSmartspaceConfigPlugin
    public final boolean isDefaultDateWeatherDisabled() {
        return false;
    }
    @Override
    public final boolean isViewPager2Enabled() {
        return false;
    }
    @Override
    public final boolean isSwipeEventLoggingEnabled() {
        return false;
    }
}
