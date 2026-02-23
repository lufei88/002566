package com.github.catvod.spider.merge.h0;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.h0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacksC0313B implements ComponentCallbacks {
    public final /* synthetic */ C0315D a;

    public ComponentCallbacksC0313B(C0315D c0315d) {
        this.a = c0315d;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C0315D c0315dM5265 = C0029.m5265(this);
        if (!C0005.m1604(c0315dM5265) || C0045.m7551(c0315dM5265) == null || C0031.m5643(c0315dM5265) == null) {
            return;
        }
        C0016.m3575(new RunnableC0312A(c0315dM5265, 2));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }
}