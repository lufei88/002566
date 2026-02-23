package com.github.catvod.spider.merge.f0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h0.C0315D;
import com.github.catvod.spider.merge.h0.RunnableC0312A;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.f0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298a implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C0315D c0315dM9577 = C0063.m9577();
        C0047.m7777(c0315dM9577);
        C0016.m3575(new RunnableC0312A(c0315dM9577, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C0017.m3665(new com.github.catvod.spider.merge.D.g(2), 100);
        C0017.m3665(new com.github.catvod.spider.merge.D.g(3), 1000);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}